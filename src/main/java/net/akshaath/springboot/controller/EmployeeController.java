package net.akshaath.springboot.controller;

import net.akshaath.springboot.dto.EmployeeDTO;
import net.akshaath.springboot.model.Employee;
import net.akshaath.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*")
public class EmployeeController {
	@Autowired
    private EmployeeService service;

    @PostMapping
    public Employee create(@RequestBody EmployeeDTO dto) {
        return service.addEmployee(dto);
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody EmployeeDTO dto) {
        return service.updateEmployee(id, dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "Deleted employee with id: " + id;
    }

}