package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		int u = driver.findElement(By.xpath("//input[@type='email']")).getSize().getWidth();
	
		int p = driver.findElement(By.xpath("//input[@type='password' and @name='pass'])[1]")).getSize().getWidth();
		
		if(u==p)
		{System.out.println("Size of both the textfields is equal");}
		else{System.out.println("Size of both the textfields is not equal");}
		driver.close();
	}

}
