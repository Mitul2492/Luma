package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LumaAccount {
	
	
	
	public WebDriver driver;
	
	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		driver = new ChromeDriver();
	    
	}

	@When("User open URL {string}")
	public void user_open_url(String string) {
		driver.get(string);
	    
	}

	@When("User click on Create new accout link")
	public void user_click_on_create_new_accout_link() {
		driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
	    
	}

	@When("User enters first name {string}")
	public void user_enters_first_name(String firstname) {
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
	   
	}

	@When("User enters last name {string}")
	public void user_enters_last_name(String lastname) {
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
	    
	}

	@When("User enters email {string}")
	public void user_enters_email(String email) {
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(email);
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}

	@When("User confirms password {string}")
	public void user_confirms_password(String confirmpwd) {
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(confirmpwd);
	}
	


	@When("User clicks on the {string} button")
	public void user_clicks_on_the_button(String createbutton) {
		driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).click();
	}

	/*@Then("User should navigate to Home screen")
	public void user_should_navigate_to_home_screen() {
		driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).click();
	   
	}*/


}
