package net.akshaath.springboot.service;

import net.akshaath.springboot.dto.EmployeeDTO;
import net.akshaath.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(EmployeeDTO dto);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, EmployeeDTO dto);
    void deleteEmployee(Long id);
}