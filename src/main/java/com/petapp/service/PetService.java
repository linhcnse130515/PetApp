package com.petapp.service;

import com.petapp.dto.PetDTO;

import java.util.List;

public interface PetService {
    PetDTO save(PetDTO petDTO);
    PetDTO getPetById(Long id);
    List<PetDTO> getPets();
    List<PetDTO> getPetsByOwnerId(Long ownerId);
}
