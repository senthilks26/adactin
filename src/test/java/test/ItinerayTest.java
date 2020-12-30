package test;

import org.testng.annotations.Test;

import base.Baseclass;
import object.ItineraryObject;

public class ItinerayTest {
	Baseclass b;
	ItineraryObject io;
	HotelBookTest ho;

	public ItinerayTest() {
		b = new Baseclass();
		io = new ItineraryObject();
		ho = new HotelBookTest();

	}
	@Test
	public void verifycancalbooking() {
		io.cancelid().click();
		b.Alert();
		
	}

}
