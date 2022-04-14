package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\Login.feature"},monochrome=true,glue= {"org.stepDef"},
plugin= {"html:C:\\Users\\DELL\\eclipse-workspace\\AdactinCucumber\\target",
		"json:C:\\Users\\DELL\\eclipse-workspace\\AdactinCucumber\\target\\login.json",
		"junit:C:\\Users\\DELL\\eclipse-workspace\\AdactinCucumber\\target\\login.xml"})
public class TestRunner {

}
