package com.developer.employeemanagement.service;

import com.developer.employeemanagement.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();
    Optional<EmployeeEntity> findById(Long id);
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
    void deleteEmployee(Long id);
}
