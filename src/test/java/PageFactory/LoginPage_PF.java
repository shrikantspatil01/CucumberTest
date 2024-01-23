package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import junit.framework.Assert;

public class LoginPage_PF {

	@FindBy(xpath="//input[@id='username']")
	WebElement unm;
	@FindBy(xpath="//input[@id='password']")
	WebElement psw;
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;
	@FindBy(xpath="//div[@id='msg']")
	WebElement invalidlogin;
			
	WebDriver driver;
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uname) {
		unm.sendKeys(uname);
	}
	public void enterPassword(String pass) {
		psw.sendKeys(pass);
	}
	public void clickOnLoginButton() {
		login.click();
	}
	public void checkInvalidLogin() {
		String invalidtext=invalidlogin.getText();
		String inv="Invalid Username or Password";
		Assert.assertEquals(invalidtext,inv);
	}
	
}
