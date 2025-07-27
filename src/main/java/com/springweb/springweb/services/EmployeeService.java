package com.springweb.springweb.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.springweb.springweb.dto.EmployeeDTO;
import com.springweb.springweb.entity.EmployeeEntity;
import com.springweb.springweb.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    private final EmployeeRepository employeeRepository;

    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository , ModelMapper modelMapper){
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper; 
    }

    public List<EmployeeDTO> getAllEmployee(){

        List<EmployeeEntity> allEmployees = employeeRepository.findAll();

        return allEmployees
                .stream()
                .map( employee -> modelMapper.map(employee,EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO){
        EmployeeEntity toSaveEmployee = modelMapper.map(employeeDTO,EmployeeEntity.class);
        EmployeeEntity savedEmployee = employeeRepository.save(toSaveEmployee);
        
        return modelMapper.map(savedEmployee,EmployeeDTO.class);
    }

    public EmployeeDTO findEmployeeById(Long id){
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);

        return modelMapper.map(employeeEntity,EmployeeDTO.class);
    }

}
