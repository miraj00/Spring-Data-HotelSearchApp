package co.stay.HotelSearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.stay.HotelSearch.repository.HotelRepository;

@Controller
public class hotelController {

	
	@Autowired
	private HotelRepository repo;
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
		
	}
	
	@RequestMapping("/results")
	public String result(
			@RequestParam String city,
			Model model) {
			
		
		model.addAttribute("city", city);
		return "results";
	}
	
}
