package com.petapp.entity;

import com.petapp.entity.enumerate.PetType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity(name = "pet")
@Getter
@Setter
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private PetType type;

    private String name;

    private LocalDate birthDate;

    private String notes;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    private Customer customer;

    @ManyToMany(mappedBy = "pets")
    private Set<Schedule> schedules;

}
