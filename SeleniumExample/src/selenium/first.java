package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class first 
{
		public static void main(String []args) throws InterruptedException
				{
							System.setProperty("webdriver.chrome.driver", "D:\\Software Developement methodologies\\chromedriver_win32\\chromedriver.exe");
							WebDriver driver = new ChromeDriver();
							
							driver.get("https://opensource-demo.orangehrmlive.com/"); 
							
							driver.findElement(By.name("txtUsername")).sendKeys("Admin");
							driver.findElement(By.name("txtPassword")).sendKeys("admin123");
							driver.findElement(By.name("Submit")).click();
							
							driver.findElement(By.linkText("Admin")).click();
//							driver.findElement(By.linkText("Time")).click();
							
							Select dropdown = new Select (driver.findElement(By.id("searchSystemUser_userType")));
							dropdown.selectByVisibleText("ESS");
							
							WebElement checkbox = driver.findElement(By.id("ohrmList_chkSelectRecord_60"));
							checkbox.click();
							
							
							driver.findElement(By.id("welcome")).click();
							Thread.sleep(2000);
							driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
							driver.close();
				}
}
