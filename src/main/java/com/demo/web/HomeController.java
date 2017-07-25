package com.demo.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.dto.RegistrationFormDTO;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/home")
	public String getIndex(ModelMap modelMap) {
		System.out.println("in side home+++++++++++");
		return "home";
	}

	@GetMapping("/registration-form")
	public String getRegiForm(ModelMap model) {
		RegistrationFormDTO dto = new RegistrationFormDTO();
		model.addAttribute("dto", dto);
		System.out.println("dto in get method"+dto.getEmail());
		System.out.println("inside Registration form ++++++++++++++++");
		return "registration-form";
	}

	@GetMapping("/save-registraition-form")
	private  String saveForm(@Valid RegistrationFormDTO entry, ModelMap model) {
		System.out.println("in side save method");
		RegistrationFormDTO dto = new RegistrationFormDTO();
		dto.setEmail(entry.getEmail());
		dto.setName(entry.getName());
		model.addAttribute("dto", dto);
		System.out.println("dto +++++++++++++++++++++"+dto.getEmail());
		return "success";
	}
}
