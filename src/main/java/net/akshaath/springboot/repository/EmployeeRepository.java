package net.akshaath.springboot.repository;

import net.akshaath.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}