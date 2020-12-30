package test;

import org.testng.annotations.Test;

import base.Baseclass;
import object.HotelObject;

public class HotelTest {
	HotelObject sh;
	Baseclass b;
	ObjectClassTest oc;

	public HotelTest() {
		sh= new HotelObject();
		b= new Baseclass();
		oc= new ObjectClassTest();
	}

	@Test
	public void hotelvalidation() {
	    oc.loginvalidation();
		b.dropdown(sh.location(), 2);
		b.selectdropdown(sh.hotel(), "Hotel Creek");
		b.selectFromDropDown(sh.roomtype(), "Double");
		b.dropdown(sh.numroom(), 2);
		b.selectdropdown(sh.room(), "3 - Three");
		b.selectdropdown(sh.childroom(), "4 - Four");
		sh.login().click();
	}
}
