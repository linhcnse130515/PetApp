package com.petapp.entity;

import com.petapp.entity.enumerate.EmployeeSkill;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Schedule.class)
public abstract class Schedule_ {

	public static volatile SetAttribute<Schedule, Pet> pets;
	public static volatile SingularAttribute<Schedule, LocalDate> date;
	public static volatile SetAttribute<Schedule, EmployeeSkill> activities;
	public static volatile SingularAttribute<Schedule, Long> id;
	public static volatile SetAttribute<Schedule, Employee> employees;

	public static final String PETS = "pets";
	public static final String DATE = "date";
	public static final String ACTIVITIES = "activities";
	public static final String ID = "id";
	public static final String EMPLOYEES = "employees";

}

