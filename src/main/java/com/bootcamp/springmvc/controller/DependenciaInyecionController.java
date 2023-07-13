package com.bootcamp.springmvc.controller;

import com.bootcamp.springmvc.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inyeccion")
public class DependenciaInyecionController {

    @Autowired
    @Qualifier("miServioCompleto")
    private IService servicio;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("objecto", servicio.operacion());
        return "inyeccion/index";
    }
}
