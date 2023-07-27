package mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickAndHold {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Paranthaman\\eclipse-workspace\\amazon\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/sortable");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement grid=driver.findElement(By.id("demo-tab-grid"));
		grid.click();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", ""); 
		
		WebElement two=driver.findElement(By.xpath("(//div[text()='Two'])[2]"));
		
		WebElement eight=driver.findElement(By.xpath("(//div[text()='Eight']"));
		Actions act=new Actions(driver);
		act.clickAndHold(two).release(eight).build().perform();
		
	}

}
