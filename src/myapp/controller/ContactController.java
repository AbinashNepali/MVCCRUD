package myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class ContactController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	// This method  / the this method is called and main reversed to the// 
	//cotenst file inside the spring-servet to /wed-inf/views/main.jsp //
 public String displayMainPage(){
	 return "main";
 }
}
