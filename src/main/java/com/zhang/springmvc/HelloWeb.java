package com.zhang.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloWeb {
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap modelMap){
		modelMap.addAttribute("message", "你好！！");	
		return "index";
	}

}
