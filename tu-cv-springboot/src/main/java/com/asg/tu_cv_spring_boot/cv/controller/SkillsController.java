package com.asg.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SkillsController {
    @GetMapping("/skills")
    public String habilidades(Model model){
        List<String> habilidades = List.of("Java", "Spring", "Angular", "HTML", "JS");
        List<String> list = new ArrayList<>();
        model.addAttribute("skills", list);
        return "skills";
    }
}
