package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel {
	@FindBy(id="radiobutton_1")
	private WebElement clickHotel;
	
	
	
@FindBy(id="continue")
private WebElement continueto;



public WebElement getClickHotel() {
	return clickHotel;
}



public WebElement getContinueto() {
	return continueto;
}

}
