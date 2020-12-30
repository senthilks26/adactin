package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class HotelbookObject extends Baseclass {

	public HotelbookObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;

	@FindBy(xpath = "//*[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//*[@name='cc_num']")
	private WebElement cardnum;

	@FindBy(xpath = "//*[@name='cc_type']")
	private WebElement cctype;

	@FindBy(xpath = "//*[@name='cc_exp_month']")
	private WebElement month;

	@FindBy(xpath = "//*[@name='cc_exp_year']")
	private WebElement year;

	@FindBy(xpath = "//*[@name='cc_cvv']")
	private WebElement ccv;

	@FindBy(xpath = "//*[@name='book_now']")
	private WebElement booknow;

	@FindBy(xpath = "//input[@name='order_no']")
	private WebElement orderno;

	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement itineary;

	@FindBy(xpath = "//input[@value='Cancel GBP2M9FDR2']")
	private WebElement cancelid;

	@FindBy(xpath = "//label[@id='search_result_error']")
	private WebElement label;

	public WebElement label() {
		return label;

	}

	public WebElement cancelid() {
		return cancelid;
	}

	public WebElement itineary() {
		return itineary;
	}

	public WebElement firstname() {
		return firstname;

	}

	public WebElement lastname() {
		return lastname;

	}

	public WebElement address() {
		return address;

	}

	public WebElement cardnum() {
		return cardnum;

	}

	public WebElement cctype() {
		return cctype;

	}

	public WebElement month() {
		return month;

	}

	public WebElement year() {
		return year;
	}

	public WebElement ccv() {
		return ccv;

	}

	public WebElement booknow() {
		return booknow;
	}

	public WebElement orderno() {
		return orderno;

	}
}
