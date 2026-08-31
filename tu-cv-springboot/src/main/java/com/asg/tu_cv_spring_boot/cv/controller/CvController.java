package com.asg.tu_cv_spring_boot.cv.controller;

import com.asg.tu_cv_spring_boot.cv.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Permite mapear rutas web
@RequestMapping("/cv") //Creamos una ruta base
@RequiredArgsConstructor
public class CvController {

    private final Person person;

    @GetMapping({"/index", "/", ""})
    // Model es una interfaz, contenedor de datos, pasa información
    // de controlador a una vista
    public String index(Model model){
//        Person persona = new Person("Gabriel", "Sagrero", "Dev");
//        model.addAttribute("name", "Ga"); // Es un mapa que maneja una key
//        model.addAttribute("persona", persona); // Es un mapa que maneja una key
        model.addAttribute("property", person.getPrimerNombre());
        return "index";
    }

    @GetMapping("index2")
    public String index2(Model model,
                         @RequestParam(required = false) String texto,
                         @RequestParam(required = false) Integer number
    ){
        model.addAttribute("texto", texto);
        model.addAttribute("number", number);
        return "index2";
    }

}
