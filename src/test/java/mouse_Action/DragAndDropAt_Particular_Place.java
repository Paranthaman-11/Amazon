package mouse_Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropAt_Particular_Place {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Paranthaman\\eclipse-workspace\\amazon\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dragable");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		//WebElement drag=driver.findElement(By.);
		
		Actions act=new Actions(driver);
		
		//act.dragAndDropBy(drag, 0, 100). build().perform();

	}

}
