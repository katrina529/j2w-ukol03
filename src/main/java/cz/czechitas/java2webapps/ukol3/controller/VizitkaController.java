package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    private final List<Vizitka> vizitky;

    public VizitkaController() {
        vizitky = Arrays.asList(
                new Vizitka("Petra Černocká", "Seznam", "Hovorčovická 56", "18200", null, 657655555,null ),
                new Vizitka("Alice Bystrá", "Unicorn", "Lužany 30", "33454", "alice@bystra.cz", 676766766,null ),
                new Vizitka("Jan Nedvěd", "Sparta Praha", "Smrková 24", "32600", "honzanedved@seznam.cz", null,null),
                new Vizitka("Emil Novotný", "Kupi.cz", "Vyprodaá 56", "33401",null ,null,"kupi.cz")
                );
    }

    @GetMapping("/")
    public String seznam() {
        return "seznam";
    }

    @GetMapping("/detail")
    public String detail() {
        return "detail";
    }
}
