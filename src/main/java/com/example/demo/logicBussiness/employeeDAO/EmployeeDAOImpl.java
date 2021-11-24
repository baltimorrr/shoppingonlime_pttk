package com.example.demo.logicBussiness.employeeDAO;

import java.util.List;

import com.example.demo.model.employee.Employee;
import com.example.demo.repository.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    EmployeeRepo repo;

    @Override
    public Employee addEmployee(Employee emp) {
        return repo.save(emp);
    }

    @Override
    public void removeEmp(int id) {
        repo.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }
}
