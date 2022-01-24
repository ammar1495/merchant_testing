package com.magang.merchant.utils;

public enum TestCases {

	T1("Testing the authentication"),
	T2("Testing Monitoring MD page"),
	T3("Testing Completed Data page"),
	T4("Testing Monit MD page");
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
