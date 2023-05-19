package com.training.pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class karnataka_POM {
	private WebDriver driver; 
	
	public karnataka_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
//   locating webElement
	@FindBy(id = "nav-menu-item-127106")
//	 creating variable for webElement
	private WebElement expLink; 
	
	
//	Module - Hamburger 
	@FindBy(className = "mkdf-sm-lines")
	private WebElement hamburger ;

	@FindBy(xpath = "//a[@href='https://karnatakatourism.org/department/']" )
	private WebElement departmentLink ;
	
//	Features - functionality
	@FindBy(xpath = "//a[@href='https://karnatakatourism.org/department/tourism-department/']" )
	private WebElement tourismDepartment ;

	@FindBy(xpath = "//a[@href='https://karnatakatourism.org/department/tourism-facilitation-act/']" )
	private WebElement tourismFacilitationAct ;

	@FindBy(xpath = "//a[@href='https://karnatakatourism.org/department/tourism-policy/']" )
	private WebElement tourismPolicy ;

	@FindBy(xpath = "//a[@href='https://karnatakatourism.org/department/press-release/']" )
	private WebElement pressRelease ;

	@FindBy(xpath = "//a[@href='https://karnatakatourism.org/department/gallery/']" )
	private WebElement gallery ;

	@FindBy(xpath = "//a[@href='https://www.karnatakatourism.org/']" )
	private WebElement karnatakaTourism  ;

	@FindBy(xpath = "//a[@href='https://karnatakatourism.org/department']" )
	private WebElement home  ;
	
	@FindBy(xpath = "//a[@href='https://www.karnatakatourism.org/department/?page_id=180']" )
	private WebElement contact  ;

	@FindBy(id = "menu-item-687" )
	private WebElement  feedback ;

	@FindBy(xpath = "//a[@href='https://www.nidhi.nic.in/HotelDivision/Default.aspx']"  )
	private WebElement  registerationUnder  ;
	
	
	
//	Methods for TCs  ( 1-7 => functionality )
//	#1
	public void clickhamburgerBtn() throws InterruptedException {	
		this.hamburger.click() ;
		this.departmentLink.click();	
		Set<String> id = driver.getWindowHandles() ;
		
		Iterator<String> iterate = id.iterator();
		
		String parent = iterate.next() ;
		String child = iterate.next() ;
		
		driver.switchTo().window(child);
		
		Thread.sleep(3000);
		this.tourismDepartment.click();
		
		Assert.assertEquals( driver.getCurrentUrl() , "https://karnatakatourism.org/department/tourism-department/");
		Assert.assertEquals( tourismDepartment.getText() , "Tourism Department" );
		
		driver.navigate().back();
	}
	
//	#2
	
	public void tc2() throws InterruptedException {	
		
		Thread.sleep(3000);
		this.tourismFacilitationAct.click();
		
		Assert.assertEquals( driver.getCurrentUrl() , "https://karnatakatourism.org/department/tourism-facilitation-act/");
		Assert.assertEquals( tourismFacilitationAct.getText() , "Tourism Facilitation Act");
		driver.navigate().back();
	}
	
	
//	#3
	
	public void tc3() throws InterruptedException {	

		Thread.sleep(3000);
		this.tourismPolicy.click();
		
		Assert.assertEquals( driver.getCurrentUrl() , "https://karnatakatourism.org/department/tourism-policy/");
		Assert.assertEquals( tourismPolicy.getText() , "Tourism Policy");
		driver.navigate().back();
		
	}
	
	
//	#4
	
	public void tc4() throws InterruptedException {	

		Thread.sleep(3000);
		this.pressRelease.click();
		
		Assert.assertEquals( driver.getCurrentUrl() , "https://karnatakatourism.org/department/press-release/" ) ;
		Assert.assertEquals( pressRelease.getText() , "Press Release");
		driver.navigate().back();
	}
	
	
//	#5
	
	public void tc5() throws InterruptedException {	

		Thread.sleep(3000);
		this.gallery.click();
		
		Assert.assertEquals( driver.getCurrentUrl() , "https://karnatakatourism.org/department/gallery/");
		Assert.assertEquals( gallery.getText() , "Gallery");
		driver.navigate().back();
	}
	
	
//	#6
	
	public void tc6() throws InterruptedException {	
	
		Thread.sleep(3000);
		Assert.assertEquals( karnatakaTourism.getText() , "Karnataka Tourism");
		this.karnatakaTourism.click();
		
		Assert.assertEquals( driver.getCurrentUrl() , "https://karnatakatourism.org/" );
		driver.navigate().back();
	}
	
	
//	#7
	public void tc7() throws InterruptedException {	

		Thread.sleep(3000);
		this.home.click();
		
		Assert.assertEquals( driver.getCurrentUrl() , "https://karnatakatourism.org/department/");
		driver.navigate().back();
	}
	
	
//	#8
	public void tc8() throws InterruptedException {	

		Thread.sleep(3000);
		this.contact.click();
		
		Assert.assertEquals( driver.getCurrentUrl() , "https://karnatakatourism.org/department/contact/");
		driver.navigate().back();
	}
	

//	#9
	public void tc9() throws InterruptedException {	

		Thread.sleep(3000);
		this.feedback.click();
		
		Assert.assertEquals( driver.getCurrentUrl() , "https://karnatakatourism.org/department/feedback/");
		driver.navigate().back();
	}
	
	
//	#10
	public void tc10() throws InterruptedException {	

		Thread.sleep(3000);
		this.registerationUnder.click();
		Thread.sleep(3000);
		Set<String> id = driver.getWindowHandles() ;
		
		Iterator<String> iterate = id.iterator();
		
		String parent = iterate.next() ;
		String child1 = iterate.next() ;
		
		driver.switchTo().window(child1);
		String child2 = iterate.next() ;
		driver.switchTo().window(child2);
		Thread.sleep(3000);
		Assert.assertEquals( driver.getCurrentUrl() , "https://nidhi.nic.in/HotelDivision/Default.aspx");
		
	}
}
