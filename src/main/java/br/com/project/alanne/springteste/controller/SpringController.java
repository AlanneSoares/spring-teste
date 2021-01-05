package br.com.project.alanne.springteste.controller;

import br.com.project.alanne.springteste.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public String index() {
        return "home/home";
    }

    @PostMapping("/form")
    public String form(Contato contato, String name) {
        // injeção de dependencia
        homeService.salvar();
        return "";
    }
}














//@RequestMapping(value="/home", method = RequestMethod.GET)