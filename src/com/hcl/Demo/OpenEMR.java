package com.hcl.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenEMR {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://demo.openemr.io/b/openemr/index.php");
		
		
		
		 driver.findElement(By.id("authUser")).sendKeys("admin");
		
		 driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		WebElement languageEle= driver.findElement(By.name("languageChoice"));
		Select selectLanguage=new Select(languageEle);
		selectLanguage.selectByVisibleText("English (Indian)");
		
		//login
		
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 //mouse over activity 
		 
//		 WebElement billyEle=driver.findElement(By.xpath("//span[text()='Billy']"));
//		 Actions actions=new Actions(driver);
//		 actions.moveToElement(billyEle).build().perform();
//		 
//		 //Logout
//		 
//		 driver.findElement(By.xpath("//li[text()='Logout']")).click();
		 
		 
 //mouse over activity 
		 
		 WebElement patEle=driver.findElement(By.xpath("//div[@data-bind='text:label']"));
		 Actions actions=new Actions(driver);
		 actions.moveToElement(patEle).build().perform();
		 
		 //New or Search
		driver.findElement(By.xpath("//*[text()='New/Search']")).click();
		 
		 //driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div")).click();
		 Thread.sleep(3000);
		 driver.switchTo().frame("pat");
		 driver.findElement(By.id("form_fname")).sendKeys("Nan");
		 driver.findElement(By.id("form_lname")).sendKeys("Yas");
		 driver.findElement(By.id("form_DOB")).sendKeys("2020-05-06");
		 
		 //for dropdown
		 
		 Select selectGender=new Select(driver.findElement(By.id("form_sex")));
		 selectGender.selectByVisibleText("Female");
		 
		 
		 driver.findElement(By.id("create")).click();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("modalframe");
		 
		driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
		
		driver.switchTo().defaultContent();
		 //New or Search tab
		 //driver.findElement(By.xpath("//*[@id=\"tabs_div\"]/div/div[4]/span[1]")).click();
		 
		 //alert box
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		
		alert.accept();
		//Thread.sleep(3000);
		//close happy birthday
		driver.findElement(By.xpath("//div[@class='closeDlgframe']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
