package testone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormSeleniumAuto {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
     
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://elab-stg.labyrinthelab.com/create_learner_account.php");  
		driver.manage().window().maximize();  
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement firstname = driver.findElement(By.xpath("(//label[text()='First Name']//following::input[1])[1]"));		
		firstname.sendKeys("ABC");
		
		WebElement lastname = driver.findElement(By.xpath("(//label[text()='Last Name']//following::input[1])[1]"));		
		lastname.sendKeys("DEF");
		
		WebElement email = driver.findElement(By.xpath("(//label[text()='Email']//following::input[1])[1]"));		
		email.sendKeys("abc@def.com");
		
		WebElement pass = driver.findElement(By.xpath("(//label[text()='Password']//following::input[1])[1]"));		
		pass.sendKeys("A	bc@123");
		
		WebElement conpass = driver.findElement(By.xpath("(//label[text()='Confirm Password']//following::input[1])[1]"));		
		conpass.sendKeys("Abc@123");
		
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
		checkbox.click();
		 
		WebElement submit = driver.findElement(By.xpath("(//button[@type=\"submit\"])[last()]"));
		submit.click();
		 
		driver.close();
	}
}

