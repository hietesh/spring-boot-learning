package com.springweb.springweb.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDTO {
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
}
