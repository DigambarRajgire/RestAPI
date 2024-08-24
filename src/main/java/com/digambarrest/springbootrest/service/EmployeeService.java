package com.digambarrest.springbootrest.service;


import com.digambarrest.springbootrest.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> getAllEmplyees();

    Employee getEmployeebyId(String id);

    String deleteEmployeeById(String id);
}
