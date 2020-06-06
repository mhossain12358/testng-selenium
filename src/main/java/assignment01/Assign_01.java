package assignment01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign_01 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Way2Automation");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a")).click();
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links  " +links.size());
		
		for (WebElement Link: links) {
			System.out.println(Link.getText()+ "This All are the url  " + Link.getAttribute("href"));
		}
		driver.quit();

	}

}
