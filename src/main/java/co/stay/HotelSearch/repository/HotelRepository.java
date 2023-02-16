package co.stay.HotelSearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.stay.HotelSearch.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {	
	
	
}	
