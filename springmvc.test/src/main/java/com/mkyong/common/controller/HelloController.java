package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {

	public HelloController()
	{
		
	}
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(Model model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}
	
}