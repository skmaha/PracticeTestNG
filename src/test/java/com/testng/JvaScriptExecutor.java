package com.testng;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JvaScriptExecutor {
	WebDriver wd = WebDriverManager.chromedriver().create();
  @Test
  public void f() throws Exception {
	  wd.get("https://demo.openmrs.org/openmrs/login.htm");
	  JavascriptExecutor jsExecutor = (JavascriptExecutor) wd;
	  jsExecutor.executeScript("document.getElementById('username').value='Admin'");
	  jsExecutor.executeScript("document.getElementById('password').value='Admin123'");
	  jsExecutor.executeScript("document.getElementById('Inpatient Ward').click()");
	  jsExecutor.executeScript("document.getElementsByClassName('btn confirm')[0].click()");
	  Thread.sleep(6000);
	  }
}