package com.petapp.repository;

import com.petapp.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findAllByCustomer_Id(Long ownerId);

    List<Pet> findAllByIdIn(List<Long> Id);
}
