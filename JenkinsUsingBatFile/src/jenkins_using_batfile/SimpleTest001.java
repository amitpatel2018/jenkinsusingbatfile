package jenkins_using_batfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest001 {
	WebDriver driver;
	
	@Test
	public void performSimpleTest() {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
}
