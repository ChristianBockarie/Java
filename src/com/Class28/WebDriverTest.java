package com.Class28;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		chrome.openBrowser();
		chrome.closeBrowser();
		chrome.maximizeWindow();
		chrome.findElement();
		
		System.out.println("---------------");
		
		WebDriver firefox = new FireFoxDriver();
		firefox.openBrowser();
		firefox.closeBrowser();
		firefox.maximizeWindow();
		firefox.findElement();
	}

}
