package case2;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class testmeapp2step {
	
	WebDriver driver;
	
	@Given("click the sign in button")
	public void click_the_sign_in_button() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\ChromeDriver.exe");
		driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    driver.findElement(By.linkText("SignIn")).click();
	}
	
	@When("enter the {string}")
	public void enter_the(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}
	
	@And("{string} to be entered")
	public void to_be_entered(String string) {
		 driver.findElement(By.name("password")).sendKeys(string);
	}
	  
	@When("login to testme application")
	public void login_to_testme_application() {
		driver.findElement(By.name("Login")).click();
		
	
	}
	@Then("close the application")
	public void close_the_application() {
		driver.close();
		
	}
          
	
}
