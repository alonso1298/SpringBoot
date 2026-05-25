package com.asg.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // Permite mapear rutas web
@RequestMapping("/cv") //Creamos una ruta base
public class CvController {

    @GetMapping("/home")
    public String index(){
        return "index";
    }

    // Indicamos 3 rutas con un get mapping
    @GetMapping("/pep")
    public String pep(){
        return "pep";
    }

}
