package com.magang.merchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magang.merchant.driver.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div[2]/form/div[1]/input")
	private WebElement txtUsername;
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div[2]/form/div[2]/input")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement btnSubmit;

	@FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[2]/button")
//	@FindBy(css ="#exampleModal > div > div > div.modal-footer > button")
	private WebElement btnClose;
	
	@FindBy(css = "#myCarousel > div > div:nth-child(1) > img")
	private WebElement gambar;
	
	@FindBy(css = "#myCarousel > div > div:nth-child(1) > img")
	private WebElement btnclose;
	
	@FindBy(css = "#flash")
	private WebElement msgLogout;
	
	public void clickClose() {
		gambar.click();	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		btnclose.click();
	}
	
	
	public void gotoLogin(String myusername, String password) {
		txtUsername.sendKeys(myusername);
		txtPassword.sendKeys(password);
		
		btnSubmit.click();
		gambar.click();	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		btnclose.click();
	}
	
	public void clikClose() {
		gambar.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		btnClose.click();
	}

}
