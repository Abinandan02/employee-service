package com.org.employeeservice.repository;

import com.org.employeeservice.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(Employee department) {
        employees.add(department);
        return department;
    }

    public Employee findById(Long id) {
        return employees.stream()
                .filter(employee -> employee.id().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Employee> findAll() {
        return employees;
    }

    public List<Employee> findByDepartmentId(Long departmentId) {
        return employees.stream()
                .filter(employee -> employee.departmentId().equals(departmentId))
                .toList();
    }
}
