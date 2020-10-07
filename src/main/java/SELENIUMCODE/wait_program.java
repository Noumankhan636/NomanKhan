package SELENIUMCODE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wait_program {
public static WebDriver driver;
public static WebDriverWait wait;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.className("_6ltg")).click();
		wait=new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.cell.alignR.toprlinks>p:nth-child(2)>a:nth-child(1)")));
		driver.findElement(By.cssSelector("div.cell.alignR.toprlinks>p:nth-child(2)>a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(1)>div:nth-child(2)>input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("div.table>div:nth-child(2)>div:nth-child(2)>input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(2)>div:nth-child(2)>input:nth-child(2)")).click();
		driver.findElement(By.cssSelector("a.rd_logout"));
		
	}

}