package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
				
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement FromEle = driver.findElement(By.xpath("//*[@id = 'credit2']/a"));
		WebElement ToEle = driver.findElement(By.xpath("//*[@id = 'bank']/li"));
		
		Actions actionobj = new Actions(driver);
		actionobj.dragAndDrop(FromEle, ToEle).build().perform();
		
		WebElement FromEle1 = driver.findElement(By.xpath("//*[@id = 'fourth']/a"));
		WebElement ToEle1 = driver.findElement(By.xpath("//*[@id = 'amt7']/li"));
		
		Actions actionobj1 = new Actions(driver);
		actionobj.dragAndDrop(FromEle1, ToEle1).build().perform();
		
		WebElement FromEle2 = driver.findElement(By.xpath("//*[@id = 'credit1']/a"));
		WebElement ToEle2 = driver.findElement(By.xpath("//*[@id = 'loan']/li"));
		
		Actions actionobj2 = new Actions(driver);
		actionobj.dragAndDrop(FromEle2, ToEle2).build().perform();
		
		WebElement FromEle3 = driver.findElement(By.xpath("//*[@id = 'fourth']/a"));
		WebElement ToEle3 = driver.findElement(By.xpath("//*[@id = 'amt8']/li"));
		
		Actions actionobj3 = new Actions(driver);
		actionobj.dragAndDrop(FromEle3, ToEle3).build().perform();
		
		List<WebElement> Rows = driver.findElements(By.xpath("//div[@id = 'bal3']/table/tbody/tr/td"));
		System.out.println("Total Number of Rows: " + Rows.size());
		
		//driver.close();
		
	}

}
