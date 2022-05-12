package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;

	@Given("user is on loginPage")
	public void user_is_on_login_page() {
		System.out.println("Step1:User is in loginPage");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","E:\\chromeDriverNew\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://183.82.103.245/nareshit/login.php");
	   
	}

	@When("user enters userName and password")
	public void user_enters_user_name_and_password() {
		System.out.println("Step2:enter userName and password");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	    
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Step3:Click on login button");
		driver.findElement(By.name("Submit")).click();
	   
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		System.out.println("Step4:User is land on home page");
     driver.close();		
	
	
	
	
	
	}
	
}
