package com.ideas.springboot.app.springbootwebapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ideas.springboot.app.springbootwebapp.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

    @Value("${texto.indexcontroller.index.titulo}")
    private String textoIndex;

    @Value("${texto.indexcontroller.index.perfil}")
    private String textoPerfil;

    @Value("${texto.indexcontroller.index.listar}")
    private String textoListar;
    
    @GetMapping({ "/index", "/", "/home", ""})
    public String index(Model model) {
        model.addAttribute("titulo", textoIndex);
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();

        usuario.setNombre("Juan");
        usuario.setApellido("Herman");
        usuario.setEmail("juan@mail.com");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
        
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", textoListar);
        
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuario(){
        List<Usuario> usuarios = Arrays.asList(
            new Usuario("María", "Bastidas", "majo@mail.com"),
            new Usuario("Juan", "Herman", "juan@mail.com"),
            new Usuario("Gloria", "Lasso", "glo@mail.com"));

        return usuarios;
    }

}
