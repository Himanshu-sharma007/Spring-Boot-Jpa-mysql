package com.candidjava.spring.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.candidjava.spring.bean.Login;
import com.candidjava.spring.bean.User;
import com.candidjava.spring.service.LoginService;
import com.candidjava.spring.service.UserService;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	UserService userService;
	
	@Autowired
	LoginService loginService;
	
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new Login());
	    return mav;
	  }
	
	  @RequestMapping(value = "/usrreg", method = RequestMethod.GET)
	  public ModelAndView registrationPage(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("registration");
	    mav.addObject("registration", new User());
	    return mav;
	  }
	  
	  @RequestMapping(value = "/dataT", method = RequestMethod.GET)
	  public ModelAndView getData(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("dataTable");
	    //mav.addObject("registration", new User());
	    return mav;
	  }
	    
	  @RequestMapping(value = "/loginProcess", method = RequestMethod.GET)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") Login login) {
	    ModelAndView mav = null;
	    try{
	     Login LoginRevValue = loginService.validateUser(login);
	 //  System.err.println(LoginRevValue.getPass());
	     if (null != LoginRevValue) {
	     mav = new ModelAndView("welcome");
	     mav.addObject("firstname", LoginRevValue.getEmail());
	     } else {
	     mav = new ModelAndView("login");
	     mav.addObject("message", "Username or Password is wrong!!");	    
	   }
    }catch(NullPointerException e){
    logger.error(e.getMessage());
    }
	return mav;
}
	    
}
