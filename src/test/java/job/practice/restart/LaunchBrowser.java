package job.practice.restart;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Paranthaman\\eclipse-workspace\\restart\\exe\\chromedriver.exe");
		WebDriver driver; driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
        String URL=driver.getCurrentUrl();
		
		System.out.println(URL);
		
		String getTitle=driver.getTitle();
		
		System.out.println(getTitle);
		
		WebElement textField= driver.findElement(By.id("twotabsearchtextbox"));
		textField.click();
		textField.clear();
		textField.sendKeys("redmi");
		
		WebElement searchBtn=driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		
		WebElement firstPdt=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		String text= firstPdt.getText();
		System.out.println(text);
		firstPdt.click();
		Thread.sleep(3000);
		
		String parentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        WebElement addToCartButton = driver.findElement(By.id("attach-sidesheet-view-cart-button"));
        
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        addToCartButton.click();
        
        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='a-button-inner']//span[@class='a-button-text']")));
        cart.click();
        WebElement pdtText=driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
        String conformText=pdtText.getText();
        System.out.println(conformText);
        if(text.equals(conformText)) {
        	System.out.println("same pdt");
        }
        driver.quit();
	}

}
