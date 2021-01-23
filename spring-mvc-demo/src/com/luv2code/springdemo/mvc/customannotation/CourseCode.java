package com.luv2code.springdemo.mvc.customannotation;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class) //business logic class
@Target({ ElementType.METHOD, ElementType.FIELD }) //for both method and field
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//All fields in Annotation are defined in Method like manner!****
	
	// default course code
	public String value() default "LUV";
	
	// define default error message
	public String message() default "must start with LUV";
	
	// define default groups 
	public Class<?>[] groups() default{};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};
}
