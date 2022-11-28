package com.petapp.service;

import com.petapp.dto.EmployeeDTO;
import com.petapp.dto.EmployeeRequestDTO;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Set;

public interface EmployeeService {
    EmployeeDTO save(EmployeeDTO employeeDTO);
    EmployeeDTO getEmployeeById(Long id);
    void setEmployeeAvailability(Long id, Set<DayOfWeek> daysAvailable);
    List<EmployeeDTO> findEmployeesForService(EmployeeRequestDTO employeeRequestDTO);
}
