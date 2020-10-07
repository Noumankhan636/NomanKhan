package SELENIUMCODE;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_popup {
public static WebDriver driver;

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com");
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.className("signinbtn")).click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	Thread.sleep(3000);
	alert.accept();
	
		

	}

}
