package com.asg.tu_cv_spring_boot.cv.controller;

import com.asg.tu_cv_spring_boot.cv.model.Skill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/skills")
public class SkillsController {

    private final List<Skill> skills = new ArrayList<>();

//    @GetMapping
//    public String habilidades(Model model){
//        List<String> habilidades = List.of("Java", "Spring", "Angular", "HTML", "JS");
//        List<String> list = new ArrayList<>();
//        model.addAttribute("skills", list);
//        return "skills";
//    }

//    @GetMapping
//    public  String showSkills(Model model){
//        model.addAttribute("skills", skills);
//        return "skills";
//    }

//    @GetMapping
//    public  String showSkills(){
//        return "skills";
//    }

//    @GetMapping
//    // En RequestParam se puede agregar un valor por defecto
//    public  String showSkills(@RequestParam(defaultValue = "", required = false) String filter, Model model){
//        List<Skill> skillsFilter = skills.stream()
//                .filter(skill -> skill.getNombre().toLowerCase().contains(filter.toLowerCase()))
//                .toList();
//        model.addAttribute("skills", skillsFilter);
//        model.addAttribute("filter", filter);
//        return "skills";
//    }

    @GetMapping
    public  String showSkills(@RequestParam(defaultValue = "", required = false) String filter, Model model){
        List<Skill> skillFilter = skills.stream()
                        .filter(skill -> skill.getNombre().contains(filter.toLowerCase()))
                        .toList();
        model.addAttribute("skills", skillFilter);
        model.addAttribute("filter", filter);
        return "skills";
    }

    @ModelAttribute(name = "skills2")
    public List<Skill> getSkill(){
        return skills;
    }

    @GetMapping("/new")
    public  String showForm(Model model){
        model.addAttribute("skill", new Skill());
        return "add-skills";
    }

    @PostMapping("/add")
    // ModelAtribute sirve para vincular los datos de un formulario HTML con un objeto Java
    public  String addSkill( @ModelAttribute Skill skill){
        skills.add(skill);
        return "redirect:/skills";
    }

}
