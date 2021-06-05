package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		//driver.findElement(By.xpath("//a[text() ='Create New Account']"));
		//driver.findElement(By.xpath("//h2[@class = '_8eso']"));
	    driver.findElement(By.linkText("English (UK)")).click();
		WebElement UserName = driver.findElement(By.xpath("//input[@id = 'email']"));
		UserName.sendKeys("srid01srid@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//input[@id = 'pass']"));
		Password.sendKeys("abs@1025");
		WebElement Login = driver.findElement(By.xpath("//button[@type = 'submit']"));
		Login.click();
		WebElement Error = driver.findElement(By.xpath("//div[@id = 'error_box']"));
		String ActError = Error.getText();
		String ClassName = Error.getAttribute("class");
		String TagName = Error.getTagName();
		
		System.out.println("Class Name: " + ClassName);
		System.out.println("Tag Name: " + TagName);
		
		String ExpectedError = "The email or password you have entered is invalid.";
		
		if(ActError.equals(ExpectedError))
		{
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		//select a dropdown
		
		WebElement dob = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
		
		Select dddob = new Select(dob);
		dddob.selectByIndex(2);
		dddob.selectByValue("Feb");
		dddob.selectByVisibleText("10");
		
	}

}
