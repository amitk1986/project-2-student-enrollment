package com.acadgild.agmail.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.acadgild.agmail.bean.RegisterBean;

@Component
public class RegistrationValidator implements Validator {

	public boolean supports(Class<?> c) {
		return RegisterBean.class.isAssignableFrom(c);
	}

	public void validate(Object command, Errors errors) {
		RegisterBean regBean = (RegisterBean)command;
		if(!regBean.getEmail().contains("@")){
			errors.rejectValue("email","email.invalid");
		}
	}

}
