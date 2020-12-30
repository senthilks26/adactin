package object;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class ObjectSeclect extends Baseclass{

	public ObjectSeclect() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radio;
	
	@FindBy(xpath = " //input[@name='continue']")
	private WebElement btclick;
	
	public WebElement radio() {
		return radio;
		
	}
	
	public WebElement btclick() {
		return btclick;
		
	}
}


