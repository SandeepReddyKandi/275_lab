package com.psa.flight_reservation_app_1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psa.flight_reservation_app_1.entity.Flight;
import com.psa.flight_reservation_app_1.repository.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	private FlightRepository flightRepo;

	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("dateOfDeparture") @DateTimeFormat(pattern = "MM-dd-yyyy") Date dateOfDeparture,
			ModelMap modelMap) {
		List<Flight> findFlights = flightRepo.findFlights(from, to, dateOfDeparture);
		modelMap.addAttribute("findFlights", findFlights);
		return "login/displayFlights";
	}

	@RequestMapping("/showReservation")
	public String showReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		modelMap.addAttribute("flight", flight);
		return "login/showReservation";
	}

}
