package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Scenario1
        String url = "https://github.com";

        driver.get(url);
        driver.findElement(By.partialLinkText("Sign")).click();
       String actualTitle = driver.getTitle();
       String ExpectedTitle="Sign in to GitHub � GitHub";
       System.out.println(driver.getTitle());
       if(actualTitle.equalsIgnoreCase(ExpectedTitle))
       {
    	   System.out.println("Login page matched");
       }
       else
       {
    	   System.out.println("Login page doesnot match");
       }
  //Scenario2     
       WebElement login=driver.findElement(By.name("login"));
       WebElement password=driver.findElement(By.name("password"));   
       WebElement sign=driver.findElement(By.name("commit"));
       //String text= driver.findElement(By.xpath("//div[@class='container']")).getText();
       // login without passing username and password
       login.sendKeys("");
       password.sendKeys("");
       sign.click();
       String textOnPassingnulltoUserandPassword= driver.findElement(By.xpath("//div[@class='container']")).getText();
       
      if(textOnPassingnulltoUserandPassword.equalsIgnoreCase("Incorrect username or password.")) 
      {
    	  System.out.println("Userid and password are mandatory"); 
      }
      
      driver.findElement(By.partialLinkText("Forgot password")).click();
      
    WebElement email=  driver.findElement(By.name("email"));
    WebElement reset = driver.findElement(By.name("commit"));	
    	//Scenario 3
    email.sendKeys("m.ie");
    		
    				reset.click();
          String textOnPassingincorrectemail= driver.findElement(By.xpath("//div[@class='container']")).getText();
          System.out.println(textOnPassingincorrectemail); 
       //Scenario 4  
          driver.findElement(By.name("commit")).click();	
          String textOnPassingnull= driver.findElement(By.xpath("//div[@class='container']")).getText();
    	  System.out.println(textOnPassingnull); 
    	//Scenario 5  
    	  if(textOnPassingnull.startsWith("Can't"))
    			  {
    		  System.out.println("Error message startswith Can't");
    			  }
    	
 // Scenario6  	
    driver.get(url);
    driver.findElement(By.linkText("Sign up")).click();  	
    
    String actualTitleafterSignup = driver.getTitle();
    String ExpectedTitleafterSignup="Join GitHub � GitHub";
    System.out.println(driver.getTitle());
    if(actualTitleafterSignup.equalsIgnoreCase(ExpectedTitleafterSignup))
    {
 	   System.out.println("Github page matched");
    }
    else
    {
 	   System.out.println("Github page doesnot match");
    } 
    
   //Scenario 7 
    String text = driver.findElement(By.tagName("h2")).getText();
    
    if(text.equalsIgnoreCase("Create your personal account"))
    {
    	 System.out.println("Create your personal account is present");	
    }
    else
    {
    	System.out.println("Create your personal account is not present");		
    }
    System.out.println(text);
    
		/*
		 * System.out.println("Element is Present"); }else{
		 * System.out.println("Element is Absent"); } List<WebElement> elements=
		 * driver.findElements(By.xpath("/html/body/div[4]/main/div/div")); if
		 * (elements.contains("Create your personal account")) {
		 * System.out.println("a"); }
		 */
    	  //  driver.close();
      
      /*
		 * // login without passing password login.sendKeys("******");
		 * password.sendKeys(""); sign.click(); String textOnPassingnulltoPassword=
		 * driver.findElement(By.xpath("//div[@class='container']")).getText();
		 * if(textOnPassingnulltoPassword.
		 * equalsIgnoreCase("Incorrect username or password.")) {
		 * System.out.println("Password are mandatory"); } //login without passing
		 * username
		 * 
		 * login.sendKeys(""); password.sendKeys("****"); sign.click(); String
		 * textOnPassingnulltoUser=
		 * driver.findElement(By.xpath("//div[@class='container']")).getText();
		 * if(textOnPassingnulltoUser.equalsIgnoreCase("Incorrect username or password."
		 * )) { System.out.println("UserId is mandatory"); }
		 */
      
     //  driver.findElement(By.linkText("Sign&nbsp;in"));
     //   driver.findElement(By.xpath("//a[contains(@href='/login')]"));
      //  driver.findElement(By.xpath("//a[@href='/login'][@class='HeaderMenu-link no-underline mr-3']"));
      //  driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]"));
        
        		
       // 		/a[@href="/login"]));

		/*
		 * driver.findElement(By.id("identifierId")).sendKeys("raj8805");
		 * 
		 * //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * 
		 * WebDriverWait wait=new WebDriverWait(driver, 20);
		 * 
		 * driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		 * 
		 * driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 * 
		 * driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys(
		 * "asassassa");
		 * 
		 * driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		 */

		// TODO Auto-generated method stub

	}

}
