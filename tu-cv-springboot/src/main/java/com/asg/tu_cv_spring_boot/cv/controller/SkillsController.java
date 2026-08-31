package com.asg.tu_cv_spring_boot.cv.controller;

import com.asg.tu_cv_spring_boot.cv.model.Skill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/skills")
public class SkillsController {

    private final List<Skill> skills = new ArrayList<>();

    @GetMapping
    // En RequestParam se puede agregar un valor por defecto
    public  String showSkills(@RequestParam(defaultValue = "", required = false) String filter, Model model){
        List<Skill> skillsFilter = skills.stream()
                .filter(skill -> skill.getNombre().toLowerCase().contains(filter.toLowerCase()))
                .toList();
        model.addAttribute("skills", skillsFilter);
        model.addAttribute("filter", filter);
        return "skills";
    }

    @GetMapping("/id/{index}")
    public String showSkillDetail(@PathVariable int index, Model model){
        if (index>=0 && index < skills.size()){
            Skill skill = skills.get(index);
            model.addAttribute("skill", skill);
            return "skill-detail";
        }
        return "redirect:/skills";
    }

    @GetMapping("/{nombre}/{nivel}")
    public String showFiltredSkill(@PathVariable String nombre, @PathVariable String nivel, Model model){
        List<Skill> skillsFilter = skills.stream()
                .filter(skill -> skill.getNombre().equalsIgnoreCase(nombre)
                                    && skill.getNivel().equalsIgnoreCase(nivel)
                )
                .toList();
        model.addAttribute("skills", skillsFilter);
        model.addAttribute("filterMessage", "Filtro: " + nombre + " - " + nivel);
        return "skills";
    }

    @GetMapping("/name/{name}")
    public String showFilteredSkill(@PathVariable String name, Model model){
        List<Skill> skillsFilter = skills.stream()
                .filter(skill -> skill.getNombre().equalsIgnoreCase(name)
                )
                .toList();
        if(skillsFilter.isEmpty()){

            model.addAttribute("filterMessage", "No se encontraron resultados para: " + name);

            return "forward:/skills";
        }
        model.addAttribute("skills", skillsFilter);
        model.addAttribute("filterMessage", "Filtro: " + name);
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
