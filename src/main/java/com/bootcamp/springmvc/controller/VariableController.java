package com.bootcamp.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variable")
public class VariableController {

    @GetMapping({"/", ""})
    public String index(Model model){
        model.addAttribute("titulo","Enviando parametros a la ruta");
        return "variable/index";
    }

    @GetMapping("/string/{texto}")
    public String variable(@PathVariable String texto, Model model){
        model.addAttribute("titulo","Recibir parametros de la ruta");
        model.addAttribute("resultado", "El texto enviado por la ruta es " + texto);
        return "variable/ver";
    }

}
