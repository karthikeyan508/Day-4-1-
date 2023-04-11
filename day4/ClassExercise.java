package day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassExercise {
		public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver=new ChromeDriver(co);
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement name=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		name.sendKeys("karthi");
		WebElement email=driver.findElement(By.id("input-lastname"));
		email.sendKeys("karthi123@gmail.com");
		WebElement yourname=driver.findElement(By.xpath("//*[@id=\"input-to-yourname\"]"));
		yourname.sendKeys("karthikeyan");
		WebElement youremail=driver.findElement(By.xpath("//*[@id=\"input-to-youremail\"]"));
		youremail.sendKeys("karthi12345@gmail.com");
		WebElement birthday=driver.findElement(By.xpath("//*[@id=\"input-to-birthday\"]"));
		birthday.sendKeys("Monday");
		WebElement message=driver.findElement(By.xpath("//*[@id=\"input-to-messsage\"]"));
		message.sendKeys("hello");
		
		
		
		}
	}


