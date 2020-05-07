package com.hcl.table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		WebDriver chd = new ChromeDriver();
		chd.manage().window().maximize();
		chd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// chd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		chd.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

		List<WebElement> rowsEle = chd.findElements(By.xpath("//table[@id='example']/tbody/tr[1]"));
		int rowCount = rowsEle.size();
		System.out.println(rowCount);

		// WebElement name1Ele =
		// chd.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]"));
		// String name1 = name1Ele.getText();
		// System.out.println(name1);

		// GET THE COUNT OF LINK

		for (int i = 1; i<=rowCount; i++) {
			WebElement name1Ele = chd.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]"));
			String name1 = name1Ele.getText();
			System.out.println(name1);

			if (name1.equals("Brenden Wagner")) {

				WebElement checkEle = chd.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]"));
				checkEle.click();
				//break;
				
				//get position
				WebElement posEle = chd.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[3]"));
				String pos = posEle.getText();
				System.out.println(pos);
			}
		}
		// List<WebElement> linksEle=chd.findElements(By.tagName("a"));
		// int linkCount=linksEle.size();
		// System.out.println(linkCount);
		
		
		
		
		

	}

}
