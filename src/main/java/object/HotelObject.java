package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class HotelObject extends Baseclass{

	public HotelObject() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = " //select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath = " //select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = " //*[@id='room_nos']")
	private WebElement numroom;
	
	@FindBy(xpath = " //select[@name='adult_room']")
	private WebElement room;
	
	@FindBy(xpath = "//select[@name='child_room'] ")
	private WebElement childroom;
	
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement login;
	
	
	
	public WebElement location() {
		return location;
		
	}
	public WebElement hotel() {
		return hotel;
		
	}
	public WebElement roomtype() {
		return roomtype;
		
	}
	public WebElement numroom() {
		return numroom;
}
	public WebElement room() {
		return room;
}
	public WebElement childroom() {
		return childroom;
}
	public WebElement login() {
		return login;
		
	}
	
}
