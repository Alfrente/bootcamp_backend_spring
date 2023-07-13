package com.bootcamp.springmvc.controller;

import com.bootcamp.springmvc.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/", "/index", ""})
    public String index(Model model) {
        model.addAttribute("saludo", "Cordial saludo");
        return "index";
    }

    @GetMapping("/usuario")
    private String usuarioController(Model model) {
        Usuario usuario = new Usuario("Arroyo", "Hernandez","arroyolokura8@gmail.com", "3226093031");
        model.addAttribute("titulo", "ver usuario ".concat(usuario.nombre()));
        model.addAttribute("usuario", usuario);
        return "usuario";
    }

    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("titulo", "Listado de usuario");
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Arroyo", "Hernandez","Arroyo@gmail.com", "3226093031"));
        usuarios.add(new Usuario("Daniel", "Asprilla","Daniel@gmail.com", "1234567890"));
        usuarios.add(new Usuario("Damian", "Caicedo","Damian@gmail.com", "0987654321"));
        usuarios.add(new Usuario("Josue", "Renteria","Josue@gmail.com", "1112131415"));
        return usuarios;
    }
}
