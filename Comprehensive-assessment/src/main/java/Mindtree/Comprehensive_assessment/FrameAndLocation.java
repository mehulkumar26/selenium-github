package Mindtree.Comprehensive_assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameAndLocation {
	
	private WebDriver driver;
	
	FrameAndLocation(WebDriver driver){
		this.driver = driver;
	}
	
	public  void frame() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");

		
		
		String url = "https://www.eazydiner.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		
        WebDriverWait wait = new WebDriverWait(driver,300);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id = 'webpush-onsite']")));

		WebElement ele = driver.findElement(By.xpath("//iframe[@id = 'webpush-onsite']"));

		driver.switchTo().frame(ele);

		driver.findElement(By.id("deny")).click();

		driver.switchTo().window(parent);

	}
	
	public  void selectCity() {

		driver.findElement(By.id("city-name")).click();
		
		driver.findElement(By.xpath("//a[@data-city='Delhi NCR']")).click();
	}

}
