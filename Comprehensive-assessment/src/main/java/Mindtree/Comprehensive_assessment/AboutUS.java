package Mindtree.Comprehensive_assessment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutUS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		FrameAndLocation frm = new FrameAndLocation(driver);
		
		frm.frame();
		
		frm.selectCity();
		
		Actions action = new Actions(driver);

	    action.moveToElement(driver.findElement(By.xpath("//a[@href='/static/about-us']"))).keyDown(Keys.SHIFT).click().build().perform();
		
		   Set<String> ids = driver.getWindowHandles();
			
			Iterator<String> iter = ids.iterator();
			
			String parent = iter.next();
			String child = iter.next();
			
			driver.switchTo().window(child);
			
		System.out.println(	driver.getTitle());
		
		
	
	}

}
