import java.awt.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Navotar {

	public static <webelement> void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","E://Selinium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String STR="http://67.43.12.211/NavotarReservation/?clientid=321&mode=qa&AspxAutoDetectCookieSupport=1#/?lang=en%20%3C";
driver.get(STR);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
Select vechicle= new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[1]/div[2]/select")));
vechicle.selectByVisibleText("Mini Van");
driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[1]/p/input")).clear();
driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[1]/p/input")).sendKeys("01-January-2020");
Select time= new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[1]/div[2]/select")));
time.selectByVisibleText("09:00 pm");
driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[1]/p/input")).clear();
driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[1]/p/input")).sendKeys("03-January-2020");
driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[4]/div[1]/select")).clear();
driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[4]/div[1]/select")).sendKeys("Chennai, India");






	}
	

}
