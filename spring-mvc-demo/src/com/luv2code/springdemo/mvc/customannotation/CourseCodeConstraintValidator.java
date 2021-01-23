package com.luv2code.springdemo.mvc.customannotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCode) {
		coursePrefix = theCode.value();
	}
	
	@Override
	public boolean isValid(String codeEntered, ConstraintValidatorContext arg1) {

		boolean result = true;		
		if(codeEntered!=null) {
			result = codeEntered.startsWith(coursePrefix);
		}	
		return result;
	}

}
