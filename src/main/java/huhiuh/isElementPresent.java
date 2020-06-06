package huhiuh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isElementPresent {

	public static WebDriver driver ;
	
	
	public static boolean isElementPresent(String locator) {
		try {	driver.findElement(By.xpath(locator));
			return true;
		} catch (Throwable t) {
			return false;}
		}
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver ();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
	
	
		System.out.println(isElementPresent(("//*[@id='searchLanguage']")));
	
	
	}

}
