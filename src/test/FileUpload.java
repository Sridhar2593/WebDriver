package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement FileInput = driver.findElement(By.xpath("//*[@name = 'uploadfile_0']"));
		FileInput.sendKeys("C:\\Users\\srid0\\Desktop\\test.txt");
		WebElement Tnc = driver.findElement(By.xpath("//*[@name = 'terms']"));
		Tnc.click();
		WebElement Submit = driver.findElement(By.xpath("//*[@name = 'send']"));
		Submit.click();
	}

}
