package javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTestNG02 {
	
	@Test
	
	public void gogglesearch(){
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get(" https://www.google.com");
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		searchBox.sendKeys("Google text");
		searchBox.sendKeys(Keys.ENTER); 
		String currentUrl = driver.getCurrentUrl();
		System.out.println(" current url is" + currentUrl);
		System.out.println(" the Title is" + driver.getTitle());
		driver.navigate().to("https;//demoqa.com/");
		driver.navigate().back();
		
		driver.navigate().refresh();
		driver.quit();
		driver.close();
		
		
		
		
		
	}

}
