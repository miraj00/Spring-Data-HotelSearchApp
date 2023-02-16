package co.stay.HotelSearch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String hotelName;
	private String city;
	private int pricePerNighr;
	
	
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
	public int getPricePerNighr() {
		return pricePerNighr;
	}
	public void setPricePerNighr(int pricePerNighr) {
		this.pricePerNighr = pricePerNighr;
	}
	public Hotel(Long id, String hotelName, String city, int pricePerNighr) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.city = city;
		this.pricePerNighr = pricePerNighr;
	}
	
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", hotelName=" + hotelName + ", city=" + city + ", pricePerNighr=" + pricePerNighr
				+ "]";
	}
	
	
	
	
	
	
}
