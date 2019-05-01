package com.Class28;

public interface WebDriver {
	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
}

class ChromeDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Chrome can open Browser");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome can close Browser");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome can maximize window in Browser");

	}

	@Override
	public void findElement() {
		System.out.println("Chrome can find element in Browser");

	}

}

class FireFoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("FireFox can open Browser");

	}

	@Override
	public void closeBrowser() {
		System.out.println("FireFox can close Browser");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("FireFox can maximize Window in Browser");

	}

	@Override
	public void findElement() {
		System.out.println("FireFox can find element in Browser");

	}

}