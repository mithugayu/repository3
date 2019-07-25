package case3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testmeapp3 {
	

	WebDriver driver;
	
	@Given("click the sign in button")
	public void click_the_sign_in_button() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\ChromeDriver.exe");
		driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    driver.findElement(By.linkText("SignIn")).click();
	}
	
	@When("enter the {word}")
	public void enter_the(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}
	
	@And("{word} to be entered")
	public void to_be_entered(String string) {
		 driver.findElement(By.name("password")).sendKeys(string);
	}
	  
	@And("login to testme application")
	public void login_to_testme_application() {
		driver.findElement(By.name("Login")).click();
		
	
	}
	@And("search for product")
	public void search_for_product() 
	{
		WebElement search = driver.findElement(By.id("myInput"));
		Actions action=new Actions(driver);
		action.sendKeys(search,"Head").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    //c.findElement(By.xpath("input[@name='val']")).click();
	}

	@Then("verify Search")
	public void verify_Search()
	{
		String check= driver.getTitle();
		Assert.assertTrue(check.contains("Search"));
		driver.close();
	}

}
