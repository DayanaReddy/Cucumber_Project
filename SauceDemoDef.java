package cucumber_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoDef {
	WebDriver d;
	@Given("I am in the login page of SauceDemo")
	public void i_am_in_the_login_page_of_sauce_demo() throws InterruptedException {
		System.out.println("Opening the sauce demo page");
		d= new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@When("I enter the username and password")
	public void i_enter_the_username_and_password() throws InterruptedException {
		System.out.println("entering username and password");
		d.findElement(By.id("user-name")).sendKeys("standard_user");
	    d.findElement(By.id("password")).sendKeys("secret_sauce");
	    Thread.sleep(2000);
	}

	@And("click the signin button")
	public void click_the_signin_button() throws InterruptedException {
		d.findElement(By.id("login-button")).click();
		System.out.println("Clicking login");
		Thread.sleep(2000);
	}

	@And("I click on the \"Add to cart\"button for {string}")
	public void i_click_on_the_add_to_cart_button_for(String string) throws InterruptedException {
		d.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		System.out.println("Clicking on Add to cart");
		Thread.sleep(2000);
	}

	@And("I click on the {string} button Icon")
	public void i_click_on_the_button_icon(String string) throws InterruptedException {
		d.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		System.out.println("Clicking on Cart Symbol");
		Thread.sleep(2000);
		d.findElement(By.id("checkout")).click();
		System.out.println("Clicking on Checkout");
		Thread.sleep(2000);
	}

	@And("I enter the firstName lastName and postalcode")
	public void i_enter_the_first_name_last_name_and_postalcode() throws InterruptedException {
		d.findElement(By.id("first-name")).sendKeys("Dayana");
	    d.findElement(By.id("last-name")).sendKeys("last-name");
	    d.findElement(By.id("postal-code")).sendKeys("50086");
	    System.out.println("FirstName LastName and  Postal Code details entered");
	    Thread.sleep(2000);
	}

	@And("click the continue button")
	public void click_the_continue_button() throws InterruptedException {
		d.findElement(By.id("continue")).click();
		System.out.println("Clicking on Continue Button");
		Thread.sleep(2000);
	}

	@And("I click on Finish button")
	public void i_click_on_finish_button() throws InterruptedException {
		d.findElement(By.id("finish")).click();
	    System.out.println("Clicking on the Finish button");
	    Thread.sleep(2000);
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() throws InterruptedException {
	    System.out.println("Order is Placed");
	    Thread.sleep(2000);
	    d.close();
	}


}
