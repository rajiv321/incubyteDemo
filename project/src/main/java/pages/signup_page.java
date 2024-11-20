package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import components.components;
import driverfactory.Driverfactory;

public class signup_page {

	SoftAssert Assert = new SoftAssert();
	private WebDriver driver =  Driverfactory.getDriver();
	private components components = new components();
	  public signup_page() {
	        PageFactory.initElements(driver, this);
	    }
	
	@FindBy(xpath = "//div[@class='panel header']//li[3]//a")
	private WebElement signupbtn;
	public void i_click_on_the_signup_button(){
		signupbtn.click();
		
	}
	
	
	@FindBy(xpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	private WebElement submitbtn;
	public void the_signup_page_appears(){
		components.wait_element_Displayed(submitbtn);
//		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(submitbtn))));
//		
	}
	
	@FindBy(xpath= "//input[@id='firstname']")
	private WebElement firstname;
	@FindBy(xpath= "//input[@id='lastname']")
	private WebElement lastname;
	@FindBy(xpath= "//input[@id='email_address']")
	private WebElement email;
	@FindBy(xpath= "//input[@id='password']")
	private WebElement password;
	@FindBy(xpath= "//input[@id='password-confirmation']")
	private WebElement confirm_pass;
	
	public void i_add_the_and(String string, String string2, String string3, String string4) {
		firstname.sendKeys(string);
		lastname.sendKeys(string2);
		email.sendKeys(string3);
		password.sendKeys(string4);
		confirm_pass.sendKeys(string4);
		
	}
	@FindBy(xpath="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	private WebElement submitbn;
	
	public void i_click_on_the_submit_button() {
		components.Scroll(submitbn);
		submitbn.click();
	}
	
	@FindBy(xpath = "//strong[normalize-space()='Account Information']")
	private WebElement acinfo;
	public void the_dashboard_should_be_visible_and_i_should_be_signed_in() {
		components.wait_element_Displayed(acinfo);
//		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//strong[normalize-space()='Account Information']"))));

		System.out.println("All GOOD:>");
	}

	@FindBy(xpath = "//span[@class='customer-name active']")
	private WebElement menudropdown;
	@FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
	private WebElement logout;
	
	public void i_click_on_the_logout_button() {
		// Locate the "Change" button by its CSS selector and click it
		WebElement changeButton = driver.findElement(By.cssSelector(".customer-name button[data-action='customer-menu-toggle']"));
		changeButton.click();

//		components.click(menudropdown);
		components.wait_element_Displayed(logout);
		logout.click();
	}
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	private WebElement signinbn;
	public void i_click_on_the_signin_button() {
		components.wait_element_Displayed(signinbn);
		signinbn.click();
		
	}
	
	@FindBy(xpath="//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	private WebElement signin_submit;
	@FindBy(xpath="//input[@id='email']")
	private WebElement signin_email;
	@FindBy(xpath="//fieldset[@class='fieldset login']//input[@id='pass']")
	private WebElement signin_pass ;
	
	public void i_should_be_able_to_redirect_to_the_signin_page() {
		components.wait_element_Displayed(signin_submit);
		

	}
	
	public void i_input_the_and(String string, String string2) {
		signin_email.sendKeys(string);
		signin_pass.sendKeys(string2);
	}
	
	public void i_click_the_signin_button() {
		
		signin_submit.click();
	}
	
	@FindBy(xpath="//div[@class='panel header']//span[@class='logged-in'][contains(text(),'Welcome')]")
	private WebElement welcome;
	public void i_should_be_able_to_signin_to_the_application() {
		components.wait_element_Displayed(welcome);
		
	}
}
