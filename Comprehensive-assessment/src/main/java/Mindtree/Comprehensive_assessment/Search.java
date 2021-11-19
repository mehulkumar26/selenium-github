package Mindtree.Comprehensive_assessment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		FrameAndLocation frm = new FrameAndLocation(driver);
		
		frm.frame();
		
		frm.selectCity();
		
		
		driver.findElement(By.xpath("//div [@class='bg-white radius-4 bucket meal-bucket padding-10 flex align-v-center h-100']")).click();
		
		
		driver.get("https://www.eazydiner.com/restaurants?location=govind-nagar&takeaway_delivery=1&near-me=true");
		

		Actions action = new Actions(driver);
		
	   action.moveToElement(driver.findElement(By.xpath("//a[@class='btn btn-primary height-40 block bold padding-10 font-14 apxor_click']"))).keyDown(Keys.SHIFT).click().build().perform();;
	
	   Set<String> ids = driver.getWindowHandles();
		
		Iterator<String> iter = ids.iterator();
		
		String child1 = iter.next();
		String child2 = iter.next();
		
		driver.switchTo().window(child2);
		
	System.out.println(	driver.findElement(By.xpath("//h2[@class = 'font-20 bold grey']")).getText());

		
	}

}
