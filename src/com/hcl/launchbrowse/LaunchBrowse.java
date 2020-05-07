package com.hcl.launchbrowse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowse {

	public static void main(String[] args) {
		
		WebDriver chd=new ChromeDriver();
		chd.manage().window().maximize();
		
		//chd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		chd.get("https://magento.com/");
		
		WebElement myAccEle=chd.findElement(By.linkText("My Account"));
		myAccEle.click();
		
		WebElement emailEle=chd.findElement(By.id("email"));
		emailEle.sendKeys("balaji0017@gmail.com");
		
		WebElement passEle=chd.findElement(By.id("pass"));
		passEle.sendKeys("welcome@123");
		
		WebElement loginEle=chd.findElement(By.id("send2"));
		loginEle.click();
		
		//make sure mainpage is loaded
		
		WebDriverWait wait=new WebDriverWait(chd,50 );
		wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("out")));
		
		String expectedTitle="My Account";
		
		
		String pageSource=chd.getPageSource();
		if(pageSource.contains(" ")) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		
		
		
		
		String actualTitle=chd.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Test passed");
		}
			else
			{
				System.out.println("failure");
			}
		WebElement logoutEle=chd.findElement(By.partialLinkText("log"));
		logoutEle.click();
		
	}

}
