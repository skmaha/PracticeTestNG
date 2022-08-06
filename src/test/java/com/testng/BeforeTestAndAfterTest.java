package com.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BeforeTestAndAfterTest {
	WebDriver driver = WebDriverManager.chromedriver().create();
	
	@BeforeTest
	public void BeforeTest(){
	    driver.get("https://www.google.co.in");
	    driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
	    System.out.println("Before Test method");
	}
	@Test
	public void Test() throws InterruptedException{
	    WebElement Searchbar = driver.findElement(By.xpath("//input[@name='q']"));
	    Searchbar.sendKeys("TestNG", Keys.ENTER);
	    Thread.sleep(1000);
//	    WebElement GoogleSearchButton = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
//	    GoogleSearchButton.click();
	    Thread.sleep(1000);
	    WebElement TestngURL = driver.findElement(By.xpath("//a[h3[.='TestNG - Welcome']]"));
	    TestngURL.click();
	}
	
	@AfterTest
	public void AfterTest() throws InterruptedException{
		driver.navigate().refresh();
	    System.out.println("Current page:"+driver.getTitle());
	    Thread.sleep(1000);
	    driver.quit();
	}
}
