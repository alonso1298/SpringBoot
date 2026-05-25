package com.asg.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // Permite mapear rutas web
@RequestMapping("/cv") //Creamos una ruta base
public class CvController {

    @GetMapping({"/index", "/", ""})
    // Model es una interfaz, contenedor de datos, pasa informacion
    // de controlador a una vista
    public String index(Model model){
        model.addAttribute("name", "Gabriel"); // Es un mapa que maneja una key
        return "index";
    }

}
