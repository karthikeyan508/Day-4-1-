package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class classExe {
		public static void main(String args[]) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver;
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			
			driver.manage().window().maximize();
			driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
			WebElement fname=driver.findElement(By.id("input-firstname"));
			fname.sendKeys("karthikeyan");
			WebElement lname = driver.findElement(By.id("input-lastname"));
			lname.sendKeys("S");
			WebElement email = driver.findElement(By.id("input-email"));
			email.sendKeys("karthi1@gmail.com");
			WebElement pword = driver.findElement(By.id("input-password"));
			pword.sendKeys("karthikn123");
			WebElement check = driver.findElement(By.id("input-newsletter-yes"));
			check.click();
		}
	}
