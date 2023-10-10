package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lekce;
import cz.czechitas.java2webapps.lekce4.entity.Lektor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("/lekce")
public class LekceController {

  private final List<Lekce> seznamLekci = List.of(

          new Lekce("Úvod","1.1.2024","18:00","Praha"),
          new Lekce("Podmínky","14.1.2024",//null,
                   "17:00" , "online"),
          new Lekce("Metody","28.1.2024",
                  "19:20", "Brno"
                  //null)
          )
            );

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("/lekce/index");
    modelAndView.addObject("lekce", seznamLekci);
    return modelAndView;
  }
}
