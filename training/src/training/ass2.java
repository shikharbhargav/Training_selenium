package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] username={"9936035367", "test"};
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		        WebDriver driver =new ChromeDriver();
		        driver.get("https://www.flipkart.com");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//a[.='Log In']")).click();
				
		            for(int i = 0; i < username.length ; i++)
		            {
		            	driver.findElement(By.xpath("//input[@type='text'and @class='_2zrpKAtqH0O2AkjJPXnqu9']")).clear();
		            	driver.findElement(By.xpath("//input[@type='text'and @class='_2zrpKAtqH0O2AkjJPXnqu9']")).sendKeys(username[i]);
		               System.out.println(username[i]);
		           	driver.findElement(By.xpath("//input[@type='password']")).clear();
		        	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(username[i]);
		               System.out.println(username[i]);

		               driver.findElement(By.name("login")).click();

	}
	}
}
