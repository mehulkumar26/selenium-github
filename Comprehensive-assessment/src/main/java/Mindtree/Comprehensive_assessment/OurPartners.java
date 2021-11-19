package Mindtree.Comprehensive_assessment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OurPartners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		FrameAndLocation frm = new FrameAndLocation(driver);
		
		frm.frame();
		
		frm.selectCity();
		
		
		
		Actions action = new Actions(driver);

	   
		
	    action.moveToElement(driver.findElement(By.xpath("//img[@alt='CITI']"))).keyDown(Keys.SHIFT).click().build().perform();
	    
	    action.moveToElement(driver.findElement(By.xpath("//img[@alt='Diageo']"))).keyDown(Keys.SHIFT).click().build().perform();
	    
	    
		   
	    
	    Set<String> ids = driver.getWindowHandles();
			
			Iterator<String> iter = ids.iterator();
			
			ArrayList<String> list = new ArrayList<String>();
			
			String parent = iter.next();
		
			while(iter.hasNext()) {
				
				String child = iter.next();
				
				driver.switchTo().window(child);
				
				String title = driver.getTitle();
				
				list.add(title);
				
				driver.switchTo().window(parent);
				
				
			}
			
		System.out.println("Our Partner : ");

		
			for(int i = 0; i < list.size(); i++ ) {
				System.out.println(list.get(i));
			}
			
			
		
	}

}
