package base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	public String browser = "chrome";

	public Baseclass() {

		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://adactinhotelapp.com/");
		}
	}
	// find element tag name
		// get attribute value
		// split cancel value order id
		// if condition to matching the order id
		// click the order id...

	
/*	public void getcancel() {
		List<WebElement> list = driver.findElements(By.xpath("//input[@name=\"ids[]\"]"));
		int num = list.size();
		System.out.println(num);
		System.out.println();
		for (WebElement element : list) {
			System.out.println(element.getAttribute("value"));
		}*/
		
		
		
	public void Alert() {
		org.openqa.selenium.Alert  al = driver.switchTo().alert();
		al.accept();
	}
	
	public void gettext(WebElement location) {
		System.out.println(location.getText());
	}

	public String getAttribute(WebElement location) {
		return location.getAttribute("value").toString();
	}

	public String selectFromDropDown(WebElement element, String option) {
		Select obj = new Select(element);
		obj.selectByValue(option);
		return obj.getFirstSelectedOption().getText();

	}

	public void dropdown(WebElement location, int num) {
		Select obj1 = new Select(location);
		obj1.selectByIndex(num);
		obj1.getFirstSelectedOption().getText();
	}

	public void selectdropdown(WebElement location, String option) {
		Select obj2 = new Select(location);
		obj2.selectByVisibleText(option);
		obj2.getFirstSelectedOption().getText();
	}
}
