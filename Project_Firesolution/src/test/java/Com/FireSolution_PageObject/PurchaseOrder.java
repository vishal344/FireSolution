package Com.FireSolution_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrder {

	WebDriver ldriver;

	public PurchaseOrder(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@class='side-menu__title'][normalize-space()='Purchase Order']")
	@CacheLookup
	WebElement PurchaseOrders;

	@FindBy(xpath = "//button[normalize-space()='Add PO']")
	@CacheLookup
	WebElement AddPO;

	@FindBy(xpath = "//input[@id='quantity-0']")
	@CacheLookup
	WebElement Quantity;

	@FindBy(xpath = "//input[@id='option2']")
	@CacheLookup
	WebElement radiobuttnIGST;

	@FindBy(xpath = "//button[@id='addButton']")
	@CacheLookup
	WebElement Addbutton;

	@FindBy(xpath = "//input[@id='dis']")
	@CacheLookup
	WebElement Discount;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	@CacheLookup
	WebElement SaveButton;

	public void PurchaseOrders() {
		PurchaseOrders.click();
		;
	}

	public void AddPO() {
		AddPO.click();
	}

	public void Quantity() {
		Quantity.sendKeys("10");
	}

	public void radiobuttnIGST() {
		radiobuttnIGST.click();
	}

	public void Addbutton() {
		Addbutton.click();
	}

	public void Discount() {
		Discount.sendKeys("7");
	}

	public void SaveButton() {

		SaveButton.click();
	}

}
