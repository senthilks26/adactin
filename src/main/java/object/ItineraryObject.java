package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class ItineraryObject extends Baseclass {

	public ItineraryObject() {
		PageFactory.initElements(driver, this);
	}

	
@FindBy(xpath="//input[@id='btn_id_335713']")
private WebElement cancelid;

public WebElement cancelid() {
	return cancelid;
	
}
}
