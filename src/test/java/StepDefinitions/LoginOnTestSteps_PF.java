package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginOnTestSteps_PF {

	WebDriver driver=null;
	LoginPage_PF login;
	HomePage_PF home;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("== Within LoginOnTestSteps_PF");
		System.setProperty("webdriver.crome.driver", "C:\\Users\\SHRIKPAT\\Downloads\\chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		System.out.println("driver value from step def"+driver);
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://q-modl.qbe.com/mic/?AuthMode=CAS");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String nm,String ps) {
		
		login=new LoginPage_PF(driver);
		login.enterUserName(nm);
		login.enterPassword(ps);
	}
	@And("user click on login")
	public void user_click_on_login() throws InterruptedException {
		login.clickOnLoginButton();
		Thread.sleep(4000);
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		home=new HomePage_PF(driver);
		home.checkWhetherOnHomePage();
		driver.quit();
	}
	@Then("user unable to navigate home page")
	public void user_unable_to_navigate_home_page() {
	   login.checkInvalidLogin();
	   driver.quit();
	}

}
