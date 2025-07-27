package com.springweb.springweb.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    Long id;
    String name;
    LocalDate dateOfJoining;

    public EmployeeDTO(Long id, String name, LocalDate dateOfJoining) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public LocalDate getDate() { return dateOfJoining; }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
