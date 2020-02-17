package com.jambit.organigramm.api.controller;

import com.jambit.organigramm.persistence.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organigramm")
public class OrganigrammController {
    @Autowired
    EmployeeRepository  employeeRepository;

    @GetMapping("/employees")
    ResponseEntity getAllUsers(){
        return ResponseEntity.ok().body(employeeRepository.findAll());
    }

    @GetMapping("/employees/{id}")
    ResponseEntity getUsersById(@RequestParam("id") int userId){
        return ResponseEntity.ok().body(employeeRepository.findById(userId));
    }
}
