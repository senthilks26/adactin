package test;

import org.testng.annotations.Test;

import base.Baseclass;
import object.ObjectSeclect;

public class ObjectSelectTest {

	Baseclass b;
	ObjectSeclect os;
	HotelTest ht;
	
	public ObjectSelectTest() {
		b=new Baseclass();
      	os= new ObjectSeclect();
      	ht = new HotelTest();
}
	@Test
	public void verify()
{
		ht.hotelvalidation();
		os.radio().click();
		os.btclick().click();
}
	
}