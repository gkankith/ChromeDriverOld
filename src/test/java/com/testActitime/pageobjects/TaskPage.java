package com.testActitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcust;

	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement custname;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesc;

	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selcustdd;

	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement selbbcomp;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcust;
	
	@FindBy(id="logoutLink")
	private WebElement lgbtn;

	public WebElement getSelbbcomp() {
		return selbbcomp;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}

	public WebElement getSelourcomp() {
		return selbbcomp;
	}

	public WebElement getCreatecust() {
		return createcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesc() {
		return custdesc;
	}

	public WebElement getSelcustdd() {
		return selcustdd;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}
	public void clickOnAddNewBtn() {
		addnewbtn.click();
	}
	public void clickOnNewCust() {
		newcust.click();
	}
	public void enterCustName(String name) {
		custname.sendKeys(name);
	}
	public void enterCustDesc(String desc) {
		custdesc.sendKeys(desc);
	}
	public void clickOnSelCustDD() {
		selcustdd.click();
	}
	
	public void cname(String cname) {
		selcustdd.sendKeys(cname);
	}
	public void selbbComp() {
		selbbcomp.click();
	}
	public void createCustomer() {
		createcust.click();
	}

	public void logout() {
		lgbtn.click();
		
	}
}
