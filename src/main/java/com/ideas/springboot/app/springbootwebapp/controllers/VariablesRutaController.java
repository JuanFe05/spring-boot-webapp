package com.ideas.springboot.app.springbootwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class VariablesRutaController {

    @GetMapping("/")
    public String index (Model model) {
        model.addAttribute("titulo", "Enviar varios parámetros de la ruta (@PathVariable)");
        return "variables/index";
    }
    
    @GetMapping("/string/{texto}")
    public String variable(@PathVariable String texto, Model model){
        model.addAttribute("titulo", "Recibir parámetros de la ruta (@PathVariable)");
        model.addAttribute("resultado", "El texto enviado es: " + texto);
        return "variables/ver";
    }

    @GetMapping("/string/{texto}/{numero}")
    public String variable(@PathVariable String texto, @PathVariable Integer numero,Model model){
        model.addAttribute("titulo", "Recibir parámetros de la ruta (@PathVariable)");
        model.addAttribute("resultado", "El texto enviado es: " + texto + " y el número enviado en el path es: " + numero);
        return "variables/ver";
    }

}
