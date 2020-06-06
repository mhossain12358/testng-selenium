package huhiuh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fytf {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
//		WebElement username =	driver.findElement(By.id("email"));
//		username.sendKeys("jabed12358@gmail.com");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"email\"]"))).sendKeys("Jabed12358@gmail.com");
		

		/*username.findElement(By.name("pass"));
		username.sendKeys("01671972987");*/
		/*WebElement psswd = driver.findElement(By.name("pass"));
		psswd.sendKeys("01671972987");*/
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("01710827");;
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText());
		driver.quit();


		//		WebElement logbtn = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
		//		logbtn.click();



	}
}
