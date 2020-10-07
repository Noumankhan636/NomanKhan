package SELENIUMCODE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff {
public static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
    //driver.findElement(By.cssSelector("div.cell.alignR.toprlinks>p:nth-child(2)>a:nth-child(1)")).click();
    driver.findElement(By.cssSelector("div.cell.alignR.toprlinks>p:nth-of-type(1)>a:nth-of-type(1)")).click();
    
	}

}
