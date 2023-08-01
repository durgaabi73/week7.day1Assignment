package week7.day1.Assignment;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class WaitforClickability {

	public static void main(String[] args) {
		
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/waits.xhtml");
		WebElement Clickability = driver.findElement(By.xpath("//span[text()='Click First Button']"));
		Clickability.click();
		
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		  wait.until(ExpectedConditions.elementToBeClickable( Clickability));
	
		  Clickability.click();
	               
		}

}
