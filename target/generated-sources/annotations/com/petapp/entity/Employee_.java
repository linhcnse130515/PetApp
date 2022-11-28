package com.petapp.entity;

import com.petapp.entity.enumerate.EmployeeSkill;
import java.time.DayOfWeek;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SetAttribute<Employee, EmployeeSkill> skills;
	public static volatile SetAttribute<Employee, Schedule> schedules;
	public static volatile SingularAttribute<Employee, String> name;
	public static volatile SetAttribute<Employee, DayOfWeek> daysAvailable;
	public static volatile SingularAttribute<Employee, Long> id;

	public static final String SKILLS = "skills";
	public static final String SCHEDULES = "schedules";
	public static final String NAME = "name";
	public static final String DAYS_AVAILABLE = "daysAvailable";
	public static final String ID = "id";

}

