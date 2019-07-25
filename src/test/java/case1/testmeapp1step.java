package case1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testmeapp1step {
	
	WebDriver driver;
	@Given("open the application")
	public void open_the_application() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	Thread.sleep(2000);
	driver.findElement(By.linkText("SignUp")).click();
	}

	@When("enter the {word} as")
	public void enter_the_user_name_as(String string) {
	driver.findElement(By.name("userName")).sendKeys(string);  
	}

	@And("Enter name {word} as")
	public void enter_first_name_as(String string) {
	  driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@And("Enter {word} as")
	public void enter_last_name_as(String string) {
		 driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@And("Enter the pass {word} details as")
	public void enter_the_password_details_as(String string) {
		 driver.findElement(By.name("password")).sendKeys(string);
	}

	@And("Enter cpass {word} as")
	public void enter_confrim_password_as(String string) {
		 driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@And("Select the gender")
	public void select_the_gender() {
	    List <WebElement> gender= driver.findElements(By.name("gender"));
	    gender.get(1).click();

	}

	@And("Enter the emailid as {string}")
	public void enter_the_emailid_as(String string) {
	   driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@And("Enter the mobile number as {string}")
	public void enter_the_mobile_number_as(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@And("Enter dob {word} as")
	public void enter_dob_as(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);
	}

	@And("Enter the address as {string}")
	public void enter_the_address_as(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
	}

	@Then("Select the security questions")
	public void select_the_security_questions() {
	WebElement security=driver.findElement(By.name("securityQuestion"));
	Select s=new Select(security);
	s.selectByIndex(1);
	}

	@And("Enter the ans {word} for the qns as")
	public void enter_the_answer_for_the_qns_as(String string) {
		driver.findElement(By.name("answer")).sendKeys(string);
	}

	@Then("click register")
	public void click_register() {
		driver.findElement(By.name("Submit")).click();
	}

	
}
