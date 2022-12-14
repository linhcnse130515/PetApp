package com.petapp.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cart.class)
public abstract class Cart_ {

	public static volatile SingularAttribute<Cart, BigDecimal> total;
	public static volatile SingularAttribute<Cart, Long> id;
	public static volatile ListAttribute<Cart, Item> items;
	public static volatile SingularAttribute<Cart, User> user;

	public static final String TOTAL = "total";
	public static final String ID = "id";
	public static final String ITEMS = "items";
	public static final String USER = "user";

}

