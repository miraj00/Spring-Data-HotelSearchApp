package co.stay.HotelSearch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String hotelName;
	private String city;
	private int pricePerNight;
	
	 
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNighr(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	public Hotel() {
		super();
	}
	
	public Hotel(Long id, String hotelName, String city, int pricePerNight) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}
	
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", hotelName=" + hotelName + ", city=" + city + ", pricePerNight=" + pricePerNight
				+ "]";
	}
	
	
	
	
	
	
}
