import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handalingKeyBoard {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://www.google.com/gmail/about/#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("jabed12358@gmail.com");
		
		Actions action = new Actions (driver);
		//action.sendKeys(Keys.ENTER).perform();
		action.sendKeys(Keys.chord(Keys.CONTROL + "a")).perform();
		action.sendKeys(Keys.chord(Keys.CONTROL + "c")).perform();
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL + "v")).perform();
		
		
	

	}

}
