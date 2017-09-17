package seleniumStudy1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.baidu.com");
		WebElement textbox1 = driver.findElement(By.id("kw"));
		textbox1.sendKeys("cookie");
		driver.findElement(By.id("su")).click();
		//WebElement numSum = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("nums")));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".c-abstract")));
		System.out.println(result.getText());
		
		driver.close();
	}

}
