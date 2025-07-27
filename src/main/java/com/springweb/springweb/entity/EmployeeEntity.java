package com.springweb.springweb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    Long id;
    String name;
    LocalDate dateOfJoining;
}
