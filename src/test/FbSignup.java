package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("English (UK)")).click();
		driver.findElement(By.xpath("//a[text() ='Create New Account']")).click();
		WebElement Firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		Firstname.sendKeys("Sridhar");
		WebElement Lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		Lastname.sendKeys("Sri");
		WebElement Email = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		Email.sendKeys("9978987899");
		WebElement Password = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
		Password.sendKeys("Abc@123");
		WebElement Day = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("10");
		WebElement Month = driver.findElement(By.xpath("//select[@name = 'birthday_day']/following-sibling::select[1]"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Jun");
		WebElement Year = driver.findElement(By.xpath("//select[@name = 'birthday_day']/following-sibling::select[2]"));
		Select ddYear = new Select(Year);
		ddYear.selectByValue("1990");
		driver.findElement(By.xpath("//input[@value = '2']")).click();
		driver.findElement(By.xpath("//*[@name = 'websubmit']")).click();
		
	}

}
