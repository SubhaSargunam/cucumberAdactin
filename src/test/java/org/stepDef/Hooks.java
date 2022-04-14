package org.stepDef;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BaseClass {
	@Before
	public void beforeMethod() {
		Date date=new Date();
		System.out.println(date);
	}
	@After
	public void afterMethod(Scenario s) throws IOException {
		takingScreenshot(s.getName());
	}

}
