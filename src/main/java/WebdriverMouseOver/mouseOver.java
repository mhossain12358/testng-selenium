package WebdriverMouseOver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseOver {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver ();
		driver.get("https:google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		
		//Example of Implicit wait
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ddsdkljsd")));
		
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Way2Automation");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();
		WebElement menue = driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[8]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(menue).perform();
		driver.findElement(By.linkText("Practice site 1")).click();
		driver.quit();

	}

}
