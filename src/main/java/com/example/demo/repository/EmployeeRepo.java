package com.example.demo.repository;

import com.example.demo.model.employee.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
}
