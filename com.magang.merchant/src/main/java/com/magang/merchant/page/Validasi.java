package com.magang.merchant.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magang.merchant.driver.DriverSingleton;

public class Validasi {

	private WebDriver driver;
	
	 public Validasi(){
		// TODO Auto-generated constructor stub
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[13]/a")
	private WebElement Validasi;
	
	@FindBy(css = "#data-worklist > tbody > tr:nth-child(1) > td:nth-child(5) > a > i")
	private WebElement btnAction;
	
	@FindBy(xpath = "//*[@id=\"form_survey\"]/footer/a[2]")
	private WebElement btnAprrove;
	
	//
	@FindBy(css = "#div_document > table > tbody > tr:nth-child(1) > td:nth-child(2) > span")
	private WebElement fotoTampakDekat;
	
	@FindBy(css = "#modalFoto > div > div > div.modal-header > button")
	private WebElement btnfotoTampakDekat;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[3]/td[2]/span")
	private WebElement fotoTampakJauh;
	
	@FindBy(xpath = "//*[@id=\"modalFoto\"]/div/div/div[1]/button")
	private WebElement btnfotoTampakJauh;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[5]/td[2]/span")
	private WebElement fotoTransaksiSakuku;
	
	@FindBy(xpath = "//*[@id=\"modalFoto\"]/div/div/div[1]/button")
	private WebElement btnTampilanfotoTransaksiSakuku;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[7]/td[2]/span")
	private WebElement TransaksiNonSakuku;
	
	@FindBy(xpath = "//*[@id=\"modalFoto\"]/div/div/div[1]/button")
	private WebElement btnfotoTransaksiNonSakuku;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[9]/td[2]/span")
	private WebElement fotodepantoko;
	
	@FindBy(xpath = "//*[@id=\"modalFoto\"]/div/div/div[1]/button")
	private WebElement btnfotodepantoko;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[11]/td[2]/span")
	private WebElement fototampakdalamtoko;
	
	@FindBy(xpath = "//*[@id=\"modalFoto\"]/div/div/div[1]/button")
	private WebElement btnfototampakdalemtoko;
	
	@FindBy(xpath = "//*[@id=\"div_document\"]/table/tbody/tr[13]/td[2]/span")
	private WebElement fototampasampingtoko;
	
	@FindBy(xpath = "//*[@id=\"modalFoto\"]/div/div/div[1]/button")
	private WebElement btnfototampaksampingtoko;
	
	@FindBy(xpath = "//*[@id=\"form_survey\"]/footer/a[1]")
	private WebElement btnkembali;
	
	@FindBy(xpath = "//*[@id=\"form_survey\"]/footer/a[2]")
	private WebElement btnapprove;
	
	@FindBy(xpath = "//*[@id=\"form_survey\"]/footer/a[3]")
	private WebElement btnreturn;
	
	@FindBy(xpath = "//*[@id=\"Return\"]/div/div/form/div[2]/button\r\n")
	private WebElement btnreturnclose;
	
	@FindBy(xpath = "//*[@id=\"Return\"]/div/div/form/div[1]/div/textarea")
	private WebElement txtketerangan;
	
	@FindBy(xpath = "//*[@id=\"Return\"]/div/div/form/div[2]/input")
	private WebElement txtketerangansave;
	
	public void gotoValidasi() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Validasi.click();
		btnAction.click();
		js.executeScript("window.scrollBy(0,500)");
////		fotoTampakDekat.click();
//		btnfotoTampakDekat.click();
//		fotoTampakJauh.click();
//		btnfotoTampakJauh.click();
//		js.executeScript("window.scrollBy(0,500)");
//		fotoTransaksiSakuku.click();
//		btnTampilanfotoTransaksiSakuku.click();
//		TransaksiNonSakuku.click();
//		btnfotoTransaksiNonSakuku.click();
//		js.executeScript("window.scrollBy(0,500)");
//		fotodepantoko.click();
//		btnfotodepantoko.click();
//		fototampakdalamtoko.click();
//		btnfototampakdalemtoko.click();
//		fototampasampingtoko.click();
//		btnfototampaksampingtoko.click();
		js.executeScript("window.scrollBy(0,500)");
//		btnkembali.click();
//		btnapprove.click();
		btnreturn.click();
		btnreturnclose.click();
	}
}
