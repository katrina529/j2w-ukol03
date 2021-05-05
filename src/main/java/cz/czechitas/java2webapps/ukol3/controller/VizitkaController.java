package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
//@RequestMapping ("/")
public class VizitkaController {
    private final List<Vizitka> seznamVizitek;

    public VizitkaController() {
        seznamVizitek = new ArrayList<>();
        seznamVizitek.add(new Vizitka("Petra Černocká", "Seznam", "Hovorčovická 11", "Praha", "18200", null, 657655555, null));
        seznamVizitek.add(new Vizitka("Alice Bystrá", "Unicorn", "Lužany 30", "Přeštice", "33454", "alice@bystra.cz", 676766766, null));
        seznamVizitek.add(new Vizitka("Jan Nedvěd", "Sparta Praha", "Smrková 30", "Plzeň", "31200", "honzanedved@seznam.cz", null, null));
        seznamVizitek.add(new Vizitka("Emil Novotný", "Kupi.cz", "Sady Pětatřicátníků 31", "Plzeň", "30100", null, null, "kupi.cz"));
    }

    //zobrazení seznamu vizitek//
    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView result = new ModelAndView("seznam");
        result.addObject("vizitky", seznamVizitek);
        return result;
    }


    //zobrzení detailu vizitky//
    @GetMapping(path = "/detail", params = {"id"})
    public ModelAndView detail(int id) {
        ModelAndView result = new ModelAndView("detail");
        result.addObject("id", id);
        result.addObject("vizitka", seznamVizitek.get(id));
        return result ;
    }

    //zadání nové vizitky//
    @GetMapping(path = "/nova")
    public ModelAndView nova() {
        ModelAndView novaVizitka = new ModelAndView("nova");
        return novaVizitka;
    }

    //poslání údajů na seznamVizitek//
    @PostMapping(value = "/nova", params = {"jmeno", "firma", "ulice", "mesto", "obecPsc", "email", "telefon", "web"})
    public String add(Vizitka vizitka) {
        seznamVizitek.add(vizitka);
        return "redirect:/";
    }

    //mazání vizitky//
    @PostMapping(path = "/detail", params = {"id"})
    public String delete(int id) {
        seznamVizitek.remove(id);
        return "redirect:/";
    }

}
