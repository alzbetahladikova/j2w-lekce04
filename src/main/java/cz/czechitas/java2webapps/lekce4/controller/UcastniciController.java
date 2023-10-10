package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lekce;
import cz.czechitas.java2webapps.lekce4.entity.Ucastnici;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("/ucastnici")
public class UcastniciController {

  private final List<Ucastnici> seznamUcastniku = List.of(

          new Ucastnici ("Ája","Fíková", "Ahníkov"),
          new Ucastnici("Maxipes", "FÍk","Ahníkov"),
          new Ucastnici("Zajíc", "Odlesa","U Rybníka")
  );
  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("/ucastnici/index");
    modelAndView.addObject("ucastnici",seznamUcastniku);
    return modelAndView;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView("/lektori/detail");
    modelAndView.addObject("lektor", seznamUcastniku.get(id));
    return modelAndView;
  }

}
