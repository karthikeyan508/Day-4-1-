package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exe3 {
		public static void main(String args[]) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver;
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			
			driver.manage().window().maximize();

			driver.navigate().to("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
			WebElement regname= driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
			regname.sendKeys("karthikn");
			
			WebElement regemail= driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
			regemail.sendKeys("karthikn@gmail.com");

			WebElement name= driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
			name.sendKeys("karthikn");
			
			WebElement email= driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
			email.sendKeys("karthi@gmail.com");
			
			WebElement gifttheme= driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
			gifttheme.click();
			
			WebElement msg= driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
			msg.sendKeys("Happy Birthday");
			
			WebElement amt= driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
			amt.sendKeys("1000");
			
//			WebElement terms= driver.findElement(By.xpath("//*[@name=\"agree\"]"));
//			terms.click();
			
			 WebElement con = driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]"));
			 con.submit();
			
			
		}
	}

