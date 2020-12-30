package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class ObjectClass extends Baseclass {

	public ObjectClass() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement login;

	@FindBy(xpath = "//input[@value=\"Hello senthilks!\"]")
	private WebElement text;
	

	public WebElement user() {
		return user;

	}

	public WebElement pass() {
		return pass;

	}

	public WebElement login() {
		return login;

	}

	public WebElement text() {
		return text;
	}	
	
	}
		
	

	

