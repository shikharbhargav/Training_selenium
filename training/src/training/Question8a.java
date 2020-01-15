package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
		 WebElement element = driver.findElement(By.xpath("//input[@type='email'and @class='inputtext']"));
		  Point location = element.getLocation();
		  int x = location.getX();
		  int y = location.getY();
		  
		  WebElement element1 = driver.findElement(By.xpath("//input[@type='text' and @aria-label='Mobile number or email address']"));
		Point location1 = element1.getLocation();
		  int x1 = location.getX();
		  int y1 = location.getY();
		  
		  if((x-y)==(x1-y1)){System.out.println("Size of both the textfields is equal"); }
		 else  {System.out.println("Size of both the textfields is not equal");}
		  
		  driver.close();
	}

}


