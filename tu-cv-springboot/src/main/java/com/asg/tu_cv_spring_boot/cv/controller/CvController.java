package com.asg.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Permite mapear rutas web
public class CvController {

    @GetMapping("/home")
    public String index(){
        return "index";
    }
}
