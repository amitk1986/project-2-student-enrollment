package com.acadgild.agmail.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.acadgild.agmail.bean.LoginBean;
import com.acadgild.agmail.bean.RegisterBean;
import com.acadgild.agmail.service.RegisterService;
import com.acadgild.agmail.validator.RegistrationValidator;
@Controller
public class RegController {
	@Autowired
	RegisterService registerService;
	RegistrationValidator validator = null;
	
	public RegistrationValidator getValidator() {
		return validator;
	}

	@Autowired
	public void setValidator(RegistrationValidator validator) {
		this.validator = validator;
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("command") @Valid RegisterBean registerBean, 
			BindingResult result) {
		validator.validate(registerBean, result);
		if(result.hasErrors()){
			return "register";
		}
	    registerService.registerUser(registerBean);
		return "redirect:/loginJsp.html";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(@ModelAttribute("command") @Valid LoginBean loginBean, 
			BindingResult result,ModelMap model) {
		if(result.hasErrors()){
			return new ModelAndView("login", model);
		}
		boolean loginVal=registerService.checkLogin(loginBean.getLoginName(),loginBean.getLoginPassword());
		if(loginVal){
			Map<String, Object> model1 = new HashMap<String, Object>();
			return new ModelAndView("loginSuccess", model1);
		}
		model.addAttribute("error", "User Name or Password is incorrect");
		return new ModelAndView("login", model);
	}
	@RequestMapping(value = "/loginJsp", method = RequestMethod.GET)
	public ModelAndView loadLogin(@ModelAttribute("command") LoginBean loginBean, 
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("login", model);
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView loadRegister(@ModelAttribute("command") RegisterBean registerBean, 
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("register", model);
	}
}
