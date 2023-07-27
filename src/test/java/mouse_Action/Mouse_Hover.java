package mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_Hover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Paranthaman\\eclipse-workspace\\amazon\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement boyfashion=driver.findElement(By.xpath("//a[text()=' BOY FASHION']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(boyfashion).build().perform();
		
		WebElement essential=driver.findElement(By.xpath("(//a[@title=' BOY FASHION'])[3]"));
		//essential.click();
		act.click(essential).build().perform();
		
		
		
		
		

	}

}
