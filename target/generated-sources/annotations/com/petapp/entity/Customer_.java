package com.petapp.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile ListAttribute<Customer, Pet> pets;
	public static volatile SingularAttribute<Customer, String> phoneNumber;
	public static volatile SingularAttribute<Customer, String> notes;
	public static volatile SingularAttribute<Customer, String> name;
	public static volatile SingularAttribute<Customer, Long> id;

	public static final String PETS = "pets";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String NOTES = "notes";
	public static final String NAME = "name";
	public static final String ID = "id";

}

