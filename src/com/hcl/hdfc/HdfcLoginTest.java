package com.hcl.hdfc;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class HdfcLoginTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://netbanking.hdfcbank.com/netbanking");
		 
		 
		
		//Frame,Multiple
		 driver.switchTo().frame("login_page");
		 //send username
		 driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		//click on continue
		 driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
		 //come to main
		 
		// driver.switchTo().
		 
		
		

	}

}
