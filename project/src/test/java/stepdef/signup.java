package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverfactory.Driverfactory;
import io.cucumber.java.en.*;
import pages.signup_page;
import util.Uimapper;

public class signup {
	private WebDriver driver;
	private signup_page signup;
 public signup() {
	 
	 driver = Driverfactory.getDriver();
	 signup = new signup_page();
 
 }
@Given("I am on the Website")
public void i_am_on_the_website() {
	driver.get(Uimapper.getElement("url"));
}

@When("I click on the signup button")
public void i_click_on_the_signup_button() throws InterruptedException {
	signup.i_click_on_the_signup_button();
//	driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
}

@Then("The Signup Page appears")
public void the_signup_page_appears() {
	
	signup.the_signup_page_appears();
//	WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]"))));
//	
}

@Then("I add the {string}, {string}, {string}, and {string}")
public void i_add_the_and(String string, String string2, String string3, String string4) {
	signup.i_add_the_and(string, string2, string3, string4);

}

@Then("I click on the submit button")
public void i_click_on_the_submit_button() throws InterruptedException {
//	driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).click();
//	Thread.sleep(3000);
	signup.i_click_on_the_submit_button();

}

@Then("The dashboard should be visible, and I should be signed in")
public void the_dashboard_should_be_visible_and_i_should_be_signed_in() {
	WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//strong[normalize-space()='Account Information']"))));

	

}

@Then("I click on the logout button")
public void i_click_on_the_logout_button() {
   signup.i_click_on_the_logout_button();
}

@When("I click on the signin button")
public void i_click_on_the_signin_button() {
   signup.i_click_on_the_signin_button();
}

@Then("I should be able to redirect to the Signin page")
public void i_should_be_able_to_redirect_to_the_signin_page() {
   signup.i_should_be_able_to_redirect_to_the_signin_page();
}

@When("I Input the {string}, and {string}")
public void i_input_the_and(String string, String string2) {
	signup.i_input_the_and(string, string2);
}

@When("I click the signin button")
public void i_click_the_signin_button() {
   signup.i_click_the_signin_button();
}

@Then("I should be able to signin to the application")
public void i_should_be_able_to_signin_to_the_application() {

}




}
