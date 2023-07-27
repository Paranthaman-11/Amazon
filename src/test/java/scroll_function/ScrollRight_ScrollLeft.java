package scroll_function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollRight_ScrollLeft {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Paranthaman\\eclipse-workspace\\amazon\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.album.alexflueras.ro/index.php");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
//Scroll Right
		js.executeScript("window.scrollBy(2000,0)", "");
		
// Scroll Left 		
		js.executeScript("window.scrollBy(-1500,0)", "");
		

	}

}
