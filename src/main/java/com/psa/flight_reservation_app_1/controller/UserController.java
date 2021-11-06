package com.psa.flight_reservation_app_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psa.flight_reservation_app_1.entity.User;
import com.psa.flight_reservation_app_1.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@RequestMapping("/showLoginPage")
	public String showLogin() {
		return "login/login";
	}

	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}

	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("User") User user) {
		userRepo.save(user);
		return "login/login";
	}

	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId") String emailId, @RequestParam("password") String password,
			ModelMap modelMap) {
		User user = userRepo.findByEmail(emailId);
		if (user.getEmail().equals(emailId) && user.getPassword().equals(password)) {
			return "login/findFlights";
		} else {
			modelMap.addAttribute("error", "invalid/userName & password.");
			return "login/login";
		}

	}

}
