package test;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestSE {

		  static WebDriver driver;
		 
	   // Writing before annotation so that the method run before execution of any other method
	   @Before
	   public void OpenBrowser()
		 {
			driver=new FirefoxDriver();
					
		 }
	   // Writing test annotation to convert the open method as a test condition
	   @Test
	   public void Open()
	   {
		   	driver.get("http://localhost:8080/ExampleWebapp/");
		//	Point point=driver.findElement(By.id("hplogo")).getLocation();
			//driver.findElement(By.name("q")).sendKeys("Akhilesh123");
			driver.findElement(By.linkText("Click here")).click();
			driver.navigate().refresh();
			driver.close();
		}
	}
