package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\lib\\chromedriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();

				driver.get("https://www.seleniumhq.org");
				
				driver.quit();
	}

}