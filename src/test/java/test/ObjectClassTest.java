package test;

import org.testng.annotations.Test;

import base.Baseclass;
import object.ObjectClass;

public class ObjectClassTest {

	Baseclass bc;
	ObjectClass oc;

	public ObjectClassTest() {
		bc = new Baseclass();
		oc = new ObjectClass();
	}

	@Test
	public void loginvalidation() {
		oc.user().sendKeys("senthilks");
		oc.pass().sendKeys("743702");
		oc.login().click();
	String b  =	bc.getAttribute(oc.text());
	System.out.println(b);
	
	}
}
