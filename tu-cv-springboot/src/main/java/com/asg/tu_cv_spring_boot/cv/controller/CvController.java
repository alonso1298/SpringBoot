package com.asg.tu_cv_spring_boot.cv.controller;

import com.asg.tu_cv_spring_boot.cv.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Permite mapear rutas web
@RequestMapping("/cv") //Creamos una ruta base
public class CvController {

    @GetMapping({"/index", "/", ""})
    // Model es una interfaz, contenedor de datos, pasa informacion
    // de controlador a una vista
    public String index(Model model){
        Person persona = new Person("Gabriel", "Sagrero", "Dev");
        model.addAttribute("name", "Gabriel"); // Es un mapa que maneja una key
        model.addAttribute("persona", persona); // Es un mapa que maneja una key
        return "index";
    }

}
