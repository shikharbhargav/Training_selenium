package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Log In']")).click();
		driver.findElementByXPath("//input[@type='text'and @class='_2zrpKAtqH0O2AkjJPXnqu9']").sendKeys("9936035367");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//input[@type='text'and @class='_2zrpKAtqH0O2AkjJPXnqu9']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text'and @class='_2zrpKAtqH0O2AkjJPXnqu9']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.chord(Keys.CONTROL, "v"), "");
		
	}
}
