package Com.FireSolution_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryChallan {

	WebDriver ldriver;

	public DeliveryChallan(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@id='DeliveryChallen']")
	@CacheLookup
	WebElement DeliveryChallen;

	@FindBy(xpath = "//button[normalize-space()='Add DC']")
	@CacheLookup
	WebElement AddDC;

	@FindBy(xpath = " //input[@name='qty[]']")
	@CacheLookup
	WebElement Quantity;

	@FindBy(xpath = " //button[normalize-space()='Save']")
	@CacheLookup
	WebElement SaveButton;

	public void DeliveryChallen() {

		DeliveryChallen.click();
	}

	public void AddDC() {
		AddDC.click();
	}

	public void Quantity() {

		Quantity.sendKeys("10");
	}

	public void SaveButton() {
		SaveButton.click();
	}

}
