package net.futileprogramming.icypetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

	@RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
	public String getOwners(Model model) {
		return "owners/index";
	}
}
