package co.stay.HotelSearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.stay.HotelSearch.model.Hotel;
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
		
		List<Hotel> hotellist;
		
		hotellist = repo.findByCity(city);
		
		model.addAttribute("hotels", hotellist);
		model.addAttribute("city", city);
		return "results";
	}
	
}
