package com.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	WebDriver driver = WebDriverManager.firefoxdriver().create();

	@Test
	public void TestGoogle() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	public void TestFB() throws InterruptedException {
		driver.get("https://www.fb.com");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	}
}
