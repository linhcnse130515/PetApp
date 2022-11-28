package com.petapp.service;

import com.petapp.dto.ScheduleDTO;

import java.util.List;

public interface ScheduleService {
    ScheduleDTO save(ScheduleDTO scheduleDTO);

    List<ScheduleDTO> getSchedulesByCustomer(Long customerId);

    List<ScheduleDTO> getSchedulesByEmployee(Long employeeId);

    List<ScheduleDTO> getSchedulesByPet(Long petId);

    List<ScheduleDTO> getSchedules();
}
