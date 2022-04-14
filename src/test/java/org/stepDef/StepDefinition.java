package org.stepDef;

import org.base.BaseClass;
import org.junit.Assert;
import org.pom.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	@Given("User is on Adactin Login Page")
	public void user_is_on_Adactin_Login_Page() {
		getDriver("chrome");
		launchUrl("https://adactinhotelapp.com/");
	   
	}

	@When("user enter the userName {string} and password {string}")
	public void user_enter_the_userName_and_password(String string, String string2) {
		LoginPage login=new LoginPage();
		typeText(login.getTxtUserName(),string);
		typeText(login.getTxtPassword(), string2);
	    
	}

	@When("user clicks on Login button")
	public void user_clicks_on_Login_button() {
		LoginPage login=new LoginPage();
		btnClick(login.getBtnLogin());
	    
	}

	@Then("Validate the user enters into Search Hotel page.")
	public void validate_the_user_enters_into_Search_Hotel_page() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Adactin.com - Search Hotel"));
		System.out.println("User is on the Search page");
	    
	}




}
