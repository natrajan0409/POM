package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpagelauch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chromer.driver","E://Selinium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://github.com/natrajan0409/POM");
		Thread.sleep(500);
		driver.close();
		
		
		
	}

}
