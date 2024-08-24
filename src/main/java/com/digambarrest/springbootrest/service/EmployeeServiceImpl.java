package com.digambarrest.springbootrest.service;


import com.digambarrest.springbootrest.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<Employee>();
    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId() == null || employee.getEmployeeId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmplyees() {
        return employees;
    }

    @Override
    public Employee getEmployeebyId(String id) {
        Employee employeeResult = null;
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(id)) {
                return employee;
            }
        }
      return employeeResult;
    }

    @Override
    public String deleteEmployeeById(String id) {
        Employee employee = getEmployeebyId(id);
        employees.remove(employee);
        return "Employee Successfully deleted Employee whose EmployeeId is  "+ id;
    }
}
