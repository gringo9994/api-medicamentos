package com.medicamentos.medicamentos.controller.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/")
public class HomeController {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index() {
		
		
		
		return  new ModelAndView("/index.html");

}
	
	
}
