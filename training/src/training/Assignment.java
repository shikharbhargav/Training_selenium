package training;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@type='email'and @class='whsOnd zHQkBf']").sendKeys("ssrivastava739");
		Thread.sleep(3000);
		//driver.findElementByXPath("//span[.='Next']").click();
		//driver.findElementByXPath("//input[@type='password'and @class='whsOnd zHQkBf']");
		//driver.findElementByXPath("//span[.='Next']").click();
		WebElement fname=driver.findElement(By.xpath("//input[@type='email'and @class='whsOnd zHQkBf']"));
		String value = fname.getText();
		System.out.println(value);
	}

}
