package SELENIUMCODE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_Practice {

public static WebDriver driver;
@Test(priority=1,alwaysRun=true)
@Parameters({"Browser","url","username","password"})
public void testingRediff(String Browser,String url,String username,String password)throws Exception{
	if (Browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}else if(Browser.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

driver.manage().window().maximize();
driver.get(url);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.className("signin")).click();
	driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("login1")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("signinbtn")).click();
	driver.findElement(By.className("rd_logout")).click();
	driver.quit();
	
}
	

}
