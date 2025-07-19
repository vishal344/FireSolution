package Com.FireSolution_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LabourBills {

	WebDriver ldriver;

	public LabourBills(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@id='labourBills']")
	@CacheLookup
	WebElement LabourBill;

	@FindBy(xpath = "//button[normalize-space()='Add Bill']")
	@CacheLookup
	WebElement AddLabourBills;

	@FindBy(xpath = "//input[@id='poNumber']")
	@CacheLookup
	WebElement Billsnumber;

	@FindBy(xpath = "//input[@id='Bamt']")
	@CacheLookup
	WebElement Billsamount;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	@CacheLookup
	WebElement SaveButton;

	public void LabourBill() {
		LabourBill.click();
	}

	public void AddLabourBills() {
		AddLabourBills.click();
	}

	public void Billsnumber() {

		Billsnumber.sendKeys("billNO002");
	}

	public void Billsamount() {
		Billsamount.sendKeys("88744");
	}

	public void SaveButton() {
		SaveButton.click();
	}

}
