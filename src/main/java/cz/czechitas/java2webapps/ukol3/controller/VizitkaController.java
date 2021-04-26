package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
@RequestMapping ("/")
public class VizitkaController {
    private final List<Vizitka> vizitky;

    public VizitkaController() {
        vizitky = Arrays.asList
                (new Vizitka("Petra Černocká", "Seznam", "Hovorčovická 56","Praha", "18200", null, 657655555,null ),
                new Vizitka("Alice Bystrá", "Unicorn", "Lužany 30", "Přeštice","33454", "alice@bystra.cz", 676766766,null ),
                new Vizitka("Jan Nedvěd", "Sparta Praha", "Smrková 24", "Plzeň","32600", "honzanedved@seznam.cz", null,null),
                new Vizitka("Emil Novotný", "Kupi.cz", "Vyprodaá 56", "Plzeň","30100",null ,null,"kupi.cz"));
    }

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView ("seznam");
        modelAndView.addObject("", vizitky);
        return modelAndView;
    }

    @GetMapping("/detail")
    public ModelAndView detail() {
        ModelAndView modelAndView = new ModelAndView ("detail");
        modelAndView.addObject("", vizitky);
        return modelAndView;
    }
}
