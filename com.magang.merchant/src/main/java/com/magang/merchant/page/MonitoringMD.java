package com.magang.merchant.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magang.merchant.driver.DriverSingleton;


public class MonitoringMD {
	
	private WebDriver driver;
	
	public MonitoringMD() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[14]/a")
	private WebElement btnMonitoringMD;
	
	@FindBy(xpath = "//*[@id=\"data-monitoring_length\"]/label/select/option[2]")
	private WebElement btnShow25;
	
	@FindBy(xpath = "//*[@id=\"data-monitoring_next\"]/a")
	private WebElement btnNext;
	
	@FindBy(xpath = "//*[@id=\"data-monitoring_paginate\"]/ul/li[4]/a")
	private WebElement btnNum3;
	
	@FindBy(xpath = "//*[@id=\"data-monitoring_previous\"]/a")
	private WebElement btnPrev;
	
	@FindBy(xpath = "//*[@id=\"data-monitoring\"]/tbody/tr[1]/td[10]/a")
	private WebElement btnView;
	
	@FindBy(css = "#datepicker-autoClose > input")
	private WebElement btnCalender;
	
	@FindBy(css = "body > div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom > div.datepicker-days > table > tbody > tr:nth-child(3) > td:nth-child(4)")
	private WebElement btnCalenderchoose;
	
	public void tunda() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void MonitoringMD() {
		btnMonitoringMD.click();
		tunda();
		btnShow25.click();
		tunda();
		btnNext.click();
		tunda();
		btnNum3.click();
		tunda();
		btnPrev.click();
		tunda();
		btnView.click();
		tunda();
		btnCalender.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		btnCalender.click();
	}
}
