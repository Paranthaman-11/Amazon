package mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_Click {

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Paranthaman\\eclipse-workspace\\amazon\\exe\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			WebElement todayDeal=driver.findElement(By.xpath("//a[text()='Amazon Business Card']"));
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", todayDeal);
			Actions act=new Actions(driver);
			act.click(todayDeal).build().perform();
	 	}

	}

