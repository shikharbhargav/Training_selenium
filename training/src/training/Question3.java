package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Log In']")).click();
		WebElement e=driver.findElementByXPath("//input[@type='text'and @class='_2zrpKAtqH0O2AkjJPXnqu9']");
		e.sendKeys("9936035367");
		
		
	}

}
