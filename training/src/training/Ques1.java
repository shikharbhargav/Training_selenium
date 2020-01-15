package training;



import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Desktop/assignment.html");
		WebElement e=driver.findElement(By.tagName("input"));
		boolean status=e.isEnabled();
		System.out.println("Status of isEnabled():"+status);
		
		List<WebElement> we = driver.findElements(By.tagName("input"));
		for ( WebElement el : we ) {
			if ( !el.isSelected() ) {
		        el.click();
		    }
		}
		Thread.sleep(4000);
		int size=we.size();
		for(int i=size-1;i>=0;i--)
		{
			we.get(i).click();
		}
		Thread.sleep(4000);
		for ( WebElement el1 : we ) {
		boolean status2=el1.isSelected();
		System.out.println("Status of isSelected():"+status2);
		}
		}
		}


