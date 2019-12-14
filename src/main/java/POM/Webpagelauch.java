package POM;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import com.google.common.io.Files;


public class Webpagelauch {

	public static <Takescreenshoot> void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.EDGE.driver","E://Selinium//msedgedriver");
		WebDriver driver= new EdgeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("natrajan0409");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("nat@852906");
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[8]")).click();
	String expected ="https://github.com/natrajan0409";

		if(Assert.assertEquals(expected, driver.getCurrentUrl()))

				{
			System.out.print("b");
			java.io.File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new java.io.File("E:\\Selinium\\SCREEN.png"));
		}
		else 
		{
			driver.close();
		}
		
		driver.close();
	}
 
}
