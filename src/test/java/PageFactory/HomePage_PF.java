package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HomePage_PF {

	@FindBy(xpath="//div[@class='v-menubar v-widget c-suite-tiles-menubar v-menubar-c-suite-tiles-menubar']//span[@class='v-menubar-menuitem v-menubar-menuitem-c-tiles-menu-selected-item']")
	WebElement hmbtn;
	WebDriver driver;
	public HomePage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void checkWhetherOnHomePage() {
		String hmbtname=hmbtn.getText();
		Assert.assertEquals(hmbtname, "Home");
	}
}
