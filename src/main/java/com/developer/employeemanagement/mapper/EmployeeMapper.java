package com.developer.employeemanagement.mapper;

import com.developer.employeemanagement.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<EmployeeEntity> getAllEmployeeInfo();
}
