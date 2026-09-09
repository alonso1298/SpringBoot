package com.portafolio.my_portafolio_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    private Long id;
    private String jobtitle; // Ej: "Full Stack Developer"
    private String companyName;
    private LocalDate startpate;
    private LocalDate endDate; // Puede ser null si es el puesto actual
    private String desccintion; // Responsabilidades y logros
    private Long personalInfoId; // Clave foránea a peronalInfo
}
