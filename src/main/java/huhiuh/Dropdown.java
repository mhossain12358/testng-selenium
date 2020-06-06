package huhiuh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("Aug");

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select select = new Select(dropdown);
		select.selectByValue("5");


		List<WebElement> Values = driver.findElements(By.tagName("option"));

		System.out.println("Total number of values" + Values.size());
		System.out.println(Values.get(19).getText());

		for (int i =0; i <Values.size(); i++) {
			System.out.println(Values.get(i).getAttribute("value"));
		}
		driver.quit();

	}

}
