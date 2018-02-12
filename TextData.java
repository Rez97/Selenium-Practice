package com.org.learningMaven;

public class TextData {

	private String Browser;
	private String version;
	private String WebVersion;
	
	public TextData() {
		
	}

	public TextData(String browser, String version, String webVersion) {
		Browser = browser;
		this.version = version;
		WebVersion = webVersion;
	}

	public String getBrowser() {
		return Browser;
	}

	public void setBrowser(String browser) {
		Browser = browser;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getWebVersion() {
		return WebVersion;
	}

	public void setWebVersion(String webVersion) {
		WebVersion = webVersion;
	}

	@Override
	public String toString() {
		return "The Browser is " + getBrowser() + "the  version is " + getVersion() + " and the webdriver is "
				+ getWebVersion();
	}

}
