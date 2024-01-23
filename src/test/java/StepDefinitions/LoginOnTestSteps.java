/*package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginOnTestSteps {

	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
	
		System.setProperty("webdriver.crome.driver", "C:\\Users\\SHRIKPAT\\Downloads\\chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://q-modl.qbe.com/mic/?AuthMode=CAS");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String nm,String ps) {
		WebElement unm=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		
		unm.sendKeys(nm);
		pass.sendKeys(ps);
		
	}
	@And("user click on login")
	public void user_click_on_login() throws InterruptedException {
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		Thread.sleep(4000);
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		WebElement hmbtton=	driver.findElement(By.xpath("//div[@class='v-menubar v-widget c-suite-tiles-menubar v-menubar-c-suite-tiles-menubar']//span[@class='v-menubar-menuitem v-menubar-menuitem-c-tiles-menu-selected-item']"));
		String btntext=hmbtton.getText();
		Assert.assertEquals(btntext, "Home");
		System.out.println("Hm button==>"+btntext+"Shrikant Patil");
		driver.quit();
	}

}
*/