package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver = WebDriverManager.chromedriver().create();
  @Test
  public void LaunchApp() {
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
  }
  @Test
  public void LgintoApp() throws InterruptedException {
	  driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  Thread.sleep(3000);	  
	}
  @Test
  public void VerifyMyInfo() {
	  driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();
	  driver.quit();
  }
}
	