package com.work.adminwebpanel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AdminController {
	
	@RequestMapping(value = "/menu",  method = RequestMethod.GET)
	public String menu()
	{
		return "inc/menu";
	}
	
	@RequestMapping(value = "/css", method = RequestMethod.GET)
	public String css()
	{
		return "inc/css";
	}
	
	@RequestMapping(value = "/footer_r", method = RequestMethod.GET)
	public String footer_right() {
		return "inc/footer_r";
	}
	
	@RequestMapping(value = "/footer_md", method = RequestMethod.GET)
	public String footer_medium() {
		return "inc/footer_md";
	}
	
	@RequestMapping(value = "/js", method = RequestMethod.GET)
	public String js() {
		return "inc/js";
	}

}
