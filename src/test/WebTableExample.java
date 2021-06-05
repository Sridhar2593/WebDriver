package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr"));
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr/th"));
		System.out.println("Total Number of Rows: " + Rows.size());
		System.out.println("Total Number of Columns: " + Columns.size());
		
		WebElement data = driver.findElement(By.xpath("//table[@id = 'customers']/tbody/tr[3]/td[1]"));
		System.out.println("Data: " + data.getText());
		
		WebElement ScrollEle = driver.findElement(By.xpath("//h2[text() = 'HTML Table - Add Cell Padding']"));
		JavascriptExecutor obj = (JavascriptExecutor)driver;
		obj.executeScript("arguments[0].scrollIntoView();", ScrollEle);
		ScrollEle.getText();
		String ActValue = ScrollEle.getText();
		System.out.println("Actual Value: " + ActValue);
		String ExpectedValue = "HTML Table - Add Cell Padding";
		if(ActValue.equals(ExpectedValue))
		{
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		driver.close();
	}

}
