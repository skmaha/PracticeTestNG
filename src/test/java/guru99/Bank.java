package guru99;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Bank {
	WebDriver driver = WebDriverManager.chromedriver().create();

  @Test
  public void TestScript01() {
	//	  Day_1
	  driver.get(Util.base_url +"V4/");
//	  driver.findElement(By.cssSelector(".fc-cta-consent > p:nth-child(2)")).click();
	  driver.findElement(By.name("uid")).sendKeys(Util.User_Id);
	  driver.findElement(By.cssSelector("input[name='password']")).sendKeys(Util.Password);
	  driver.findElement(By.name("btnLogin")).click();
	  System.out.println("Login successful");
//	  Day_2
	  String actual_title = driver.getTitle();
	  if(actual_title.equalsIgnoreCase(Util.Expexted_Title)) {
		  System.out.println("Passed :Title is: " + driver.getTitle());
	  }else {
	  System.out.println("Failed");
	  }
  }
//  Day_3
  @Test
  public void TestScript03() throws InterruptedException{
	  driver.get(Util.base_url + "V4/");
	  driver.findElement(By.name("uid")).sendKeys(Util.User_Id);
	  driver.findElement(By.cssSelector("input[name='password']")).sendKeys(Util.Password_1);
	  driver.findElement(By.name("btnLogin")).click();
	  Thread.sleep(3000);
	  System.out.println(driver.switchTo().alert().getText());
  }
// Day_5
  @Test
  public void TestScript04() throws Exception {
	  driver.get(Util.base_url +"/V4/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.name("uid")).sendKeys(Util.User_Id);
	  driver.findElement(By.cssSelector("input[name='password']")).sendKeys(Util.Password);
	  driver.findElement(By.name("btnLogin")).click();
	  String Actual_User_Id = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
	  if(Actual_User_Id.equalsIgnoreCase(Util.Expected_Manager_Id)) {
		  System.out.println("Passed, Manager id: "+Actual_User_Id );
	  }
	  System.out.println("Failed");
  }
  
}
