package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the initial Html form
	@RequestMapping("/showForm")
	public String showform() {
		return "helloworld-form";
	}
	
	//need a controller method for process Html form
	@RequestMapping("/processForm")
	  public String processform() {
		 return "helloworld";
	}
	
	//new controller method for form data and 
	//data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request from the HTML Form
		
		String theName = request.getParameter("studentName");
		
		//convert the all data to upper case
		theName = theName.toUpperCase();
		
		//create the message
		String result= "Yo!  " + theName;
		//add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree
	(@RequestParam("studentName") String theName, Model model) {
		
		
		//convert the all data to upper case
		theName = theName.toUpperCase();
		
		//create the message
		String result= "Hey my Friend ! " + theName;
		//add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}


}
