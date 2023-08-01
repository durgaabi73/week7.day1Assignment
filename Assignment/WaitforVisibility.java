package week7.day1.Assignment;


   import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class WaitforVisibility {
		
	
	    public static void main(String[] args) {
	    	
	    	
	        //set the path and launch the browser
	                ChromeDriver  driver=new ChromeDriver();
	                driver.manage().window().maximize();

	                driver.get("https://www.leafground.com/waits.xhtml");
	                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	                //click the element to be visible
	                WebElement visible = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
	                visible.click();
	                WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	                wait.until(ExpectedConditions.visibilityOf(visible));
	}
	                //verification
	       
	
	               
	}      
	
	    
	
	
	

