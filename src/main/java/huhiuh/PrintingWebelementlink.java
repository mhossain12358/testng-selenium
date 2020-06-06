package huhiuh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingWebelementlink {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
		
	//WebElement block = block.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]"));

		
		
		for (WebElement link : links) {
			System.out.println(link.getText()+ "the url is " + link.getAttribute("href"));
		}
		
		
		driver.quit();
		
		
		
	}

}
