package com.portafolio.my_portafolio_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {
    private Long id;
    private String degree;
    private String institution;
    private LocalDate startDate;
    private LocalDate endDate; // puede ser null si esta en curso
    private String description;
    private Long personalInfoId;
}
