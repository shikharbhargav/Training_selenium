package training;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[.='Log In']")).click();
		//driver.findElementByXPath("//input[@type='text'and @class='_2zrpKAtqH0O2AkjJPXnqu9']").sendKeys("9936035367");
		//driver.findElementByXPath("//input[@type='password']").sendKeys("shikhar@8");
		//driver.findElement(By.xpath("//button[.='Login']")).click();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
		//driver.findElementByXPath("//span[@class='eyCtv2ts9SphntfSSjO7h']").sendKeys(Keys.chord(Keys.CONTROL,"a"));
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.findElementByXPath("//span[@class='eyCtv2ts9SphntfSSjO7h']").sendKeys(Keys.chord(Keys.CONTROL,"c"));
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.findElementByXPath("//input[@type='password']").sendKeys(Keys.chord(Keys.CONTROL, "v"), "");
		
		
}}