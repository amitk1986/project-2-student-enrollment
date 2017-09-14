package com.acadgild.agmail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.acadgild.agmail.bean.RegisterBean;
import com.acadgild.agmail.dao.RegisterDao;
import com.acadgild.agmail.model.Register;
@Service("employeeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class RegisterService {
	
	@Autowired
	RegisterDao registerDao;
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void registerUser(RegisterBean registerBean){
		Register register=new Register();
		register.setAddress(registerBean.getAddress());
		register.setCity(registerBean.getCity());
		register.setCountry(registerBean.getCountry());
		register.setEmail(registerBean.getEmail());
		register.setFirstName(registerBean.getFirstName());
		register.setGender(registerBean.getGender());
		register.setLastName(registerBean.getLastName());
		register.setMobileNumber(registerBean.getMobileNum());
		register.setPassword(registerBean.getPassword());
		register.setPincode(registerBean.getPincode());
		register.setState(registerBean.getState());
	
		registerDao.registerUser(register);
		
	}
	public boolean checkLogin(String userName,String password) {
		return registerDao.checkLogin(userName, password);
	}

}
