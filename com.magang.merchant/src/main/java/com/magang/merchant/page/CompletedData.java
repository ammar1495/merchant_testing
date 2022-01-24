package com.magang.merchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.magang.merchant.driver.DriverSingleton;

public class CompletedData {
	
	private WebDriver driver;
	
	 public CompletedData() {
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[16]/a")
	private WebElement btnCompletedData;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[16]/ul/li[1]/a")
	private WebElement btnSukses;
	
	@FindBy(xpath = "//*[@id=\"data-worklist\"]/tbody/tr[1]/td[4]/a/i")
	private WebElement btnAction;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1/a[1]")
	private WebElement btnPrintPDF;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1/a[2]")
	private WebElement btnEdit;
	
	@FindBy(css = "#EditStatus > div > div > form > div.modal-body > div > select")
	private WebElement drpdownEdit;
	
	@FindBy(xpath = "//*[@id=\"EditStatus\"]/div/div/form/div[2]/input")
	private WebElement btnEditSave;
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[16]/ul/li[2]/a")
	private WebElement btnGagal;
	
	@FindBy(css = "#data-worklist > tbody > tr.odd > td:nth-child(4) > a")
	private WebElement btnAction2;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1/a[1]")
	private WebElement btnPrintPDF2;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1/a[2]")
	private WebElement btnEdit2;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1/a[2]")
	private WebElement drpdownEdit2;
	
	@FindBy(xpath = "//*[@id=\"EditStatus\"]/div/div/form/div[2]/input")
	private WebElement btnEditSave2;
	
	public void gotoCompletedData() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnCompletedData.click();
		btnSukses.click();
		btnAction.click();
		btnPrintPDF.click();
		btnEdit.click();
		new Select(btnEdit).selectByValue("1");
		btnEditSave.click();
				
		
	}

	public void gotoCompletedDataGagal() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		btnGagal.click();
		btnAction2.click();
		btnPrintPDF2.click();
		btnEdit2.click();
		new Select(drpdownEdit2).selectByValue("1");
		btnEditSave2.click();
	}
}
