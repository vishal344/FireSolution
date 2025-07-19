package Com.FireSolution_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkOrder {

	WebDriver ldriver;

	public WorkOrder(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@class='side-menu__title'][normalize-space()='Work Order']")
	@CacheLookup
	WebElement WorkOrders;

	@FindBy(xpath = "//button[normalize-space()='Add Work Order']")
	@CacheLookup
	WebElement AddWorkOrder;

	@FindBy(xpath = "//input[@id='poNumber']")
	@CacheLookup
	WebElement WONumber;

	@FindBy(xpath = "//input[@id='estimateamount']")
	@CacheLookup
	WebElement Estimateamount;

	@FindBy(xpath = "//input[@id='actualamount']")
	@CacheLookup
	WebElement Actualamount;

	@FindBy(xpath = "//input[@id='quantity']")
	@CacheLookup
	WebElement Quantity;

	@FindBy(xpath = "//button[@id='addButton']")
	@CacheLookup
	WebElement AddButton;

	@FindBy(xpath = "//button[@onclick='adddata();']")
	@CacheLookup                                   
	WebElement SaveButton1;

	public void WorkOrders() {

		WorkOrders.click();
	}

	public void AddWorkOrder() {

		AddWorkOrder.click();
	}

	public void WONumber() {
		WONumber.sendKeys("#WO0002");
	}

	public void Estimateamount() {
		Estimateamount.sendKeys("35000");
	}

	public void Actualamount() {

		Actualamount.sendKeys("45000");
	}

	public void Quantity() {

		Quantity.sendKeys("50");
	}

	public void AddButton() {

		AddButton.click();
	}

	public void SaveButton1() {

		if (SaveButton1.isEnabled()) {
			SaveButton1.click();
		} else {
		    System.out.println("Save button is disabled.");
		}
	}

}
