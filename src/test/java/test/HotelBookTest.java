package test;

import org.testng.annotations.Test;

import base.Baseclass;
import object.HotelbookObject;

public class HotelBookTest {

Baseclass b;
HotelbookObject ho;
ObjectSelectTest os;


	public HotelBookTest() {
		b=new Baseclass();
		ho=new HotelbookObject();
		os=new ObjectSelectTest();
		
	}
    
	@Test
	public void bookingverify() {
		os.verify();
		ho.firstname().sendKeys("senthil");
		ho.lastname().sendKeys("nathan");
		ho.address().sendKeys("143 vj chennai-600028");
		ho.cardnum().sendKeys("1234534545445454");
		b.selectFromDropDown(ho.cctype(), "VISA");
		b.selectdropdown(ho.month(), "March");
		b.dropdown(ho.year(), 7);
		ho.ccv().sendKeys("1225");
		ho.booknow().click();
		String num =b.getAttribute(ho.orderno());
		System.out.println(num);
		ho.itineary().click();
		ho.cancelid().click();
		b.Alert();
		b.gettext(ho.label());
	
	}
}
