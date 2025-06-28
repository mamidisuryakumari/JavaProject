package strings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Type {
	 public static void main(String[] args) {
	    	
	        // Setup ChromeDriver (make sure WebDriverManager is added if needed)
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("APjFqb")).click();

	        // Locate the input field (update selector based on your app)
	    

	        // Use Actions to send character-by-character
	        Actions actions = new Actions(driver);
	        char[] input = "Admin123".toCharArray();

	        for (char c : input) {
	            actions.sendKeys(String.valueOf(c)).perform();
	            // Optional: Thread.sleep(100); // Add slight delay to mimic real typing
	        }

	        // Close browser
	    //    driver.quit();
	    }

}
