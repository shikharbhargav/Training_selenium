package training;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	
	public static void main(String[] args) {
	
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
		  int x1 = location1.getX();
		  int y1 = location1.getY();
		  
		  
		  if(x==x1) { System.out.println("both the text box are at same location with respect to x axis");}
		 else { System.out.println("both the text box are not at same location with respect to x axis"); }
		  driver.close();
	}

}
