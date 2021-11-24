package com.example.demo.logicBussiness.employeeDAO;

import java.util.List;

import com.example.demo.model.employee.Employee;

public interface EmployeeDAO {
    public Employee addEmployee(Employee emp);

    // public Book updateBook(Book book);

    public void removeEmp(int id);



    // public Optional<Book> getBookByID(int id);

    public List<Employee> getAllEmployee();

    // public void deleteAll();
}
