package test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import baseclass.Testbase;
import io.qameta.allure.Description;
import pages.Component;
import pages.Desktop;
import pages.Laptops;

public class Test_cases extends Testbase {
    WebDriver driver;
    Testbase test;
    Desktop obj;
    Laptops objj;
    Component obk; 
      
      
      
      @BeforeTest
      public void object() {
   	   test=new Testbase();
   	   driver= test.initialize_driver();
   	   obj=new Desktop(driver);
   	   objj=new Laptops(driver);
   	   obk=new Component(driver);
      }
      public void Adektop() throws InterruptedException {
      	obj.Trigger_url("http://tutorialsninja.com/demo/");
      	obj.DesktopButton();
      	obj.Mac1();
      	Thread.sleep(4000);
      	Assert.assertEquals(obj.verify(),"Just when you thought iMac had everything, now there´s even more. More powerful Intel Core 2 Duo pro..");
      	obj.ADDtoCART();
      	Thread.sleep(4000);
      	obj.cart();
      	Thread.sleep(4000);
      	obj.checkout();
      	Thread.sleep(4000);
      	Assert.assertEquals(obj.Total(),"$122.00");
      	obj.Continue_button();
      }
      public void BLaptops() throws InterruptedException
      {
      	System.out.println("You are reached");
      	Thread.sleep(8000);
      	objj.laptops();
      	objj.showall();
      	Assert.assertEquals(objj.Verify(), "Laptops & Notebooks");
      	objj.click();
      	Thread.sleep(4000);
      	objj.dropdown();
      	objj.dropdown2();
      	objj.Mackbookpro();
      	Thread.sleep(4000);
      	objj.Cart();
      	objj.ViewCart();
      	Assert.assertEquals(objj.verify2(),"What would you like to do next?");
      	objj.Cancel();
      	objj.ContButton();
      	
      }
      @Description("Test on QA_Services")
      
      public void component() {
      	obk.component();
      	obk.monitors();
      	Assert.assertEquals(obk.verify(), "Refine Search");
      	obk.ADD();
      }
      @AfterMethod
      public void Screenshot() {
    	  try {
    		  TakesScreenshot scrShot =(TakesScreenshot)driver;
    			File src=scrShot.getScreenshotAs(OutputType.FILE);
    		
    			String destinationFile = System.getProperty("user.dir")+"\\reports\\failed2.png";
    		
    			FileUtils.copyFile(src, new File(destinationFile));
    	  } catch(Exception e) {
    		  e.printStackTrace();
    	  }
      }
      @AfterClass
      public void Teardown() {
      	driver.quit();
      }
      

}
 


