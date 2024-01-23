package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class LoginPage {
	WebDriver driver;
	By unm=By.xpath("//input[@id='username']");
	By pass=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@type='submit']");
	By hmbtton=By.xpath("//div[@class='v-menubar v-widget c-suite-tiles-menubar v-menubar-c-suite-tiles-menubar']//span[@class='v-menubar-menuitem v-menubar-menuitem-c-tiles-menu-selected-item']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		System.out.println("driver value from POM"+driver);
	}
	
	public void enterUserName(String uname) {
		driver.findElement(unm).sendKeys(uname);
		
	}
	public void enterPassword(String psw) {
		driver.findElement(pass).sendKeys(psw);
	}
	public void clickOnLoginButton() {
		driver.findElement(login).click();
		
	}
	public void checkWhetherOnHomePage() {
		
		String btntext=driver.findElement(hmbtton).getText();
		Assert.assertEquals(btntext, "Home");
	}
}
