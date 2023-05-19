package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.karnataka_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class KarnatkaTest {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private karnataka_POM karnataka_POM ;
	private static Properties properties;
	private ScreenShot screenShot;

//	@BeforeClass
//	public static void setUpBeforeClass() throws IOException {
//		
//	}
//	
	
	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		karnataka_POM = new karnataka_POM(driver) ;
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);

		// open the browser 
		driver.get(baseUrl);
		
	}
	
//	@AfterTest
//	public void tearDown() throws Exception {
//		Thread.sleep(1500);
//		driver.quit();
//	}
	
//	@Test
//	public void validLoginTest() {
//		loginPOM.sendUserName("admin");
//		loginPOM.sendPassword("admin@123");
//		loginPOM.clickLoginBtn(); 
//		screenShot.captureScreenShot("First");
//	}
	
	@Test( priority = 0 )
	public void tc1() throws InterruptedException {
		karnataka_POM.clickhamburgerBtn();
	}
	
	@Test( priority = 1 )
	public void tc2() throws InterruptedException {
//		karnataka_POM.start();
		karnataka_POM.tc2();
	}
	
	@Test( priority = 2 )
	public void tc3() throws InterruptedException {
		karnataka_POM.tc3();
	}
	
	@Test( priority = 3 )
	public void tc4() throws InterruptedException {
		karnataka_POM.tc4();
	}
	
	@Test( priority = 4 )
	public void tc5() throws InterruptedException {
		karnataka_POM.tc5();
	}
	
	@Test( priority = 5 )
	public void tc6() throws InterruptedException {
		karnataka_POM.tc6();
	}
	
	@Test( priority = 6 )
	public void tc7() throws InterruptedException {
		karnataka_POM.tc7();
	}
	
	@Test( priority = 7 )
	public void tc8() throws InterruptedException {
		karnataka_POM.tc8();
	}
	
	@Test( priority = 8 )
	public void tc9() throws InterruptedException {
		karnataka_POM.tc9();
	}
	
	@Test( priority = 9 )
	public void tc10() throws InterruptedException {
		karnataka_POM.tc10();
	}
	
}
