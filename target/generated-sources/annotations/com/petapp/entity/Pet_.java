package com.petapp.entity;

import com.petapp.entity.enumerate.PetType;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pet.class)
public abstract class Pet_ {

	public static volatile SingularAttribute<Pet, String> notes;
	public static volatile SetAttribute<Pet, Schedule> schedules;
	public static volatile SingularAttribute<Pet, String> name;
	public static volatile SingularAttribute<Pet, Long> id;
	public static volatile SingularAttribute<Pet, PetType> type;
	public static volatile SingularAttribute<Pet, LocalDate> birthDate;
	public static volatile SingularAttribute<Pet, Customer> customer;

	public static final String NOTES = "notes";
	public static final String SCHEDULES = "schedules";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String BIRTH_DATE = "birthDate";
	public static final String CUSTOMER = "customer";

}

