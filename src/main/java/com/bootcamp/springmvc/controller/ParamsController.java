package com.bootcamp.springmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/params")
public class ParamsController {

    @GetMapping("/string")
    public String param(@RequestParam String texto, Model model) {
        model.addAttribute("resultado", "El texto enviado es: " + texto);
        return "/param/ver";
    }

    @GetMapping("/integer")
    public String param(@RequestParam Integer numero, String numero2, Model model) {
        model.addAttribute("resultado", "El numero enviado es: " + numero + " y " + numero2);
        return "/param/ver";
    }

    @GetMapping("/mix-params")
    public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
        model.addAttribute("resultado", "El resultado enviado es: " + saludo
        + " el numero es " + numero);
        return "/param/ver";
    }

    @GetMapping("/mix-params-request")
    public String param(HttpServletRequest request, Model model) {
        String saludo = request.getParameter("saludo");
        Integer numero = null;

        try {
            numero = Integer.parseInt(request.getParameter("numero"));
        }catch (NumberFormatException nfe){
            log.error(nfe.getMessage());
            numero=0;
        }
        model.addAttribute("resultado", "El resultado enviado es: " + saludo
                + " el numero es " + numero);
        return "/param/ver";
    }
}
