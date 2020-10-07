package SELENIUMCODE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_down {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("form._featuredLogin__formContainer>div:nth-child(8)>a")).click();
		
		Thread.sleep(3000);
		
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Mar");
		Select select1 = new Select(driver.findElement(By.id("day")));
		select1.selectByVisibleText("25");
	    Select select2=new Select(driver.findElement(By.id("year")));
	    select2.selectByVisibleText("1997");

	}

}
