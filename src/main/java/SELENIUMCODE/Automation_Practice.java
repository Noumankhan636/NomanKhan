package SELENIUMCODE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Practice {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("nomankhan30027@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Nouman");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Khan");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Practice123");
		Thread.sleep(3000);
		//Select select = new Select(driver.findElement(By.className("form-control")));
		//select.selectByVisibleText("8");
		//Select select1 = new Select(driver.findElement(By.id("months")));
		//select1.selectByVisibleText("3");
		//Select select2 = new Select(driver.findElement(By.id("years")));
		//select2.selectByVisibleText("1997");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		driver.findElement(By.id("company")).sendKeys("PracticePurpose_123");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("88-24 181st Street Hollis NY 11432");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Jamaica");
	    Select select = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
	    select.selectByVisibleText("New York");
	    driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("11432");
	    Select select1 = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
	    select1.selectByVisibleText("United States");
        driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("Hi I try to drag down my date of birth But i dont know what the reason it's doesnt Work :(  ");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("347-264-0688");
        driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("50 Bank Street Long island NY 11581");
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	}

}
