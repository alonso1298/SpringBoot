package com.asg.tu_cv_spring_boot.cv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
// Cuando se le dice que es componente, se puede inyectar en cualquier parte
@Component
public class Person {

    @Value("${person.firstname}")
    private String primerNombre;
    private String segundoNombre;
    private String profesion;
}
