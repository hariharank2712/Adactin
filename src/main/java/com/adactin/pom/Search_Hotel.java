package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Hotel {
	@FindBy(id="location")
	private WebElement selectLocation;
	@FindBy(id="hotels")
	private WebElement selectHotels;
	@FindBy(id="room_type")
	private WebElement selectRoomType;
	@FindBy(id="room_nos")
	private WebElement noOfRoom;
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	@FindBy(id="adult_room")
	private WebElement adults;
	@FindBy(id="child_room")
	private WebElement childPerRoom;
	@FindBy(id="submit")
	private WebElement SearchHotel;
	
	
	
	
	
	
}