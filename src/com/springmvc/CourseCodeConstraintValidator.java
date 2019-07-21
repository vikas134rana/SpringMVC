package com.springmvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String annotationValue;

	@Override
	public void initialize(CourseCode courseCode) {
		annotationValue = courseCode.value();
	}

	@Override
	public boolean isValid(String fieldValue, ConstraintValidatorContext arg1) {
		return (fieldValue != null) ? fieldValue.startsWith(annotationValue) : true;
	}

}
