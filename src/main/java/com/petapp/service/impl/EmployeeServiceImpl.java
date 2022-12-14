package com.petapp.service.impl;

import com.petapp.dto.EmployeeDTO;
import com.petapp.dto.EmployeeRequestDTO;
import com.petapp.entity.Employee;
import com.petapp.entity.enumerate.EmployeeSkill;
import com.petapp.service.EmployeeService;
import com.petapp.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDTO save(EmployeeDTO employeeDTO) {
        Employee employee = this.convertEmployeeDTOToEntity(employeeDTO);
        employee = employeeRepository.save(employee);
        return this.convertEntityToEmployeeDTO(employee);
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
        return this.convertEntityToEmployeeDTO(employee);
    }

    @Override
    public void setEmployeeAvailability(Long id, Set<DayOfWeek> daysAvailable) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
        employee.setDaysAvailable(daysAvailable);
        employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeDTO> findEmployeesForService(EmployeeRequestDTO employeeRequestDTO) {
        Set<EmployeeSkill> employeeSkills = employeeRequestDTO.getSkills();
        DayOfWeek availability = employeeRequestDTO.getDate().getDayOfWeek();
        List<Employee> employees = employeeRepository.findAllByDaysAvailableContaining(availability);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSkills().containsAll(employeeSkills)) {
                employeeDTOs.add(this.convertEntityToEmployeeDTO(employee));
            }
        }
        return employeeDTOs;
    }

    private EmployeeDTO convertEntityToEmployeeDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        BeanUtils.copyProperties(employee, employeeDTO);
        return employeeDTO;
    }

    private Employee convertEmployeeDTOToEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO, employee);
        return employee;
    }
}
