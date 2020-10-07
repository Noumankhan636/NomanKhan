package SELENIUMCODE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelector {
public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("div.cell.alignR.toprlinks>p:nth-child(2)>a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(1)>div:nth-child(2)>input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("div.table>div:nth-child(2)>div:nth-child(2)>input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("div.floatL.leftwidth>div:nth-child(2)>div:nth-child(2)>div:nth-child(2)>input:nth-child(2)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.rd_logout")).click();
		
		
		
		
	}

}
