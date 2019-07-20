package com.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld_form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processForm2")
	public String processForm2(HttpServletRequest request, Model model) {
		String name = request.getParameter("fullname");
		String result = "YO! " + name.toUpperCase();
		model.addAttribute("result", result);
		return "helloworld2";
	}

	@RequestMapping("/processForm3")
	public String processForm3(@RequestParam("fullname") String name, Model model) {
		String result = "YO! " + name.toUpperCase();
		model.addAttribute("result", result);
		return "helloworld2";
	}
}
