import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragandDrop {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);

		
		
		WebElement dragable = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dropable = driver.findElement(By.cssSelector("#droppable"));
		
		Actions action =new Actions(driver);
		action.dragAndDrop(dragable, dropable).perform();
		
	}
}
	


