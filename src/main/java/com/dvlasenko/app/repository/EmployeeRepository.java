package com.dvlasenko.app.repository;

import com.dvlasenko.app.entity.employee.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findAll();
    Optional<List<Employee>> findByFirstName(String firstName);
    Optional<List<Employee>> findByLastName(String lastName);
}
