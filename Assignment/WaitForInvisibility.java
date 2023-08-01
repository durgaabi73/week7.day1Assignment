package week7.day1.Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mongodb.MapReduceCommand.OutputType;

public class WaitForInvisibility {

	
		
		public static void main(String[] args) throws IOException, InterruptedException {
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.leafground.com/waits.xhtml");		
			
			WebElement invisibility = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
			invisibility.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
			wait.until(ExpectedConditions.visibilityOf(invisibility));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
