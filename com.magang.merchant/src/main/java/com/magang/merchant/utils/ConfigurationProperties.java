package com.magang.merchant.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String myusername;
	
	@Value("${password}")
	private String password;
	
	@Value("${displayname}")
	private String displayName;

	public String getBrowser() {
		return browser;
	}


	public String getMyusername() {
		return myusername;
	}


	public String getPassword() {
		return password;
	}

	public String getDisplayName() {
		return displayName;
	}
	
}
