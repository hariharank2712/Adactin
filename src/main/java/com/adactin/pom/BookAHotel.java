package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookAHotel {
	@FindBy(id="hotel_name_dis")
	private WebElement HotelName;
	@FindBy(id="location_dis")
	private WebElement Location;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_num_dis")
	private WebElement noOfRoom;
	@FindBy(id="total_days_dis")
	private WebElement totalDays;
	@FindBy(id="price_night_dis")
	private WebElement pricePerNight;
	@FindBy(id="total_price_dis")
	private WebElement totalPrice;
	@FindBy(id="gst_dis")
	private WebElement gst;
	@FindBy(id="final_price_dis")
	private WebElement finalPrice;
	
	@FindBy(id="reg_input")
	private WebElement FirstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement creditCardNum;
	public WebElement getHotelName() {
		return HotelName;
	}
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRoom() {
		return noOfRoom;
	}
	public WebElement getTotalDays() {
		return totalDays;
	}
	public WebElement getPricePerNight() {
		return pricePerNight;
	}
	public WebElement getTotalPrice() {
		return totalPrice;
	}
	public WebElement getGst() {
		return gst;
	}
	public WebElement getFinalPrice() {
		return finalPrice;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditCardNum() {
		return creditCardNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcMonth() {
		return ccMonth;
	}
	public WebElement getCcYear() {
		return ccYear;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getBookNow() {
		return BookNow;
	}
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccYear;
	@FindBy(id="cc_cvv")
	private WebElement ccNum;
	@FindBy(id="book_now")
	private WebElement BookNow;
	
	
	
	
}
