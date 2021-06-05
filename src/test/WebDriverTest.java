package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.simplilearn.com/");
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("srid01srid@gmail.com");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("abs@1025");
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();
		WebElement Login = driver.findElement(By.name("btn_login"));
		Login.click();
		
		WebElement Error = driver.findElement(By.id("msg_box"));
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
		
		List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));
		System.out.println("Number of Input Elements: " + listOfInputs.size());
		List<WebElement> HypLink = driver.findElements(By.tagName("a"));
		System.out.println("Number of HyperLink Elements: " + HypLink.size());
		try {
		for (int i = 0; i<=HypLink.size(); i++) {
	         System.out.println("Name of Link# "  + HypLink.get(i).getText());
		}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Handled IndexOutOfBoundsException");
		}
		List<WebElement> Button = driver.findElements(By.tagName("button"));
		System.out.println("Number of Button Elements: " + Button.size());
		driver.close();
		
	}

}
