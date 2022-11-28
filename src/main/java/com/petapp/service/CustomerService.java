package com.petapp.service;

import com.petapp.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO save(CustomerDTO customerDTO);
    List<CustomerDTO> getCustomers();
    CustomerDTO getCustomerByPet(Long petId);
}
