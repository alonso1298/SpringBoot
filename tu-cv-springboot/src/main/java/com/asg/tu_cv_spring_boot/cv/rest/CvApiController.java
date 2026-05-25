package com.asg.tu_cv_spring_boot.cv.rest;

import com.asg.tu_cv_spring_boot.cv.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controlador para APIs
@RequestMapping("/api")
public class CvApiController {

    @GetMapping("/cv")
    public Person getPerson(){
        return new Person("Alonso", "Sagrero", "Ing. en Computacion");
    }
}
