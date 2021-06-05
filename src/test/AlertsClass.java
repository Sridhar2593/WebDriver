package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		WebElement CusName = driver.findElement(By.xpath("//input[@name = 'cusid']"));
		CusName.sendKeys("Sridhar");
		
		WebElement Submit = driver.findElement(By.xpath("//input[@name = 'submit']"));
		Submit.click();
		
		Alert alertObj = driver.switchTo().alert();
		alertObj.accept();
		Alert alertObj1 = driver.switchTo().alert();
		alertObj1.accept();
		
		driver.close();
	}

}
