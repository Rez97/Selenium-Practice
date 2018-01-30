package com.org.learningMaven;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class HelloWorld {
	
	
	WebDriver driver;

	public void invokeBrowser() {

		try {
			POITesting ex=new POITesting("P:\\Rezhnd Folder\\Excel Data\\TestData.xlsx");
			
			
			
			System.setProperty("webdriver.chrome.driver", "P:\\Rezhnd Folder\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			
			String web=ex.getData(0,0,1);
			driver.get(web);
			System.out.println(web);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void Login() {
		
		try {
			POITesting ex=new POITesting("P:\\Rezhnd Folder\\Excel Data\\TestData.xlsx");
			
			String user= ex.getData(0,1,1);
			driver.findElement(By.cssSelector("input[name='email']")).sendKeys(user);
			
			String pass=ex.getData(0,2,1);
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys(pass);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			
		}catch(Exception e) {
			   e.printStackTrace();
		}
	}
	
	
	public void trans() {
		try {
			
			POITesting ex=new POITesting("P:\\Rezhnd Folder\\Excel Data\\TestData.xlsx");
			
			
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("button[class='button responsive-button new-transaction-button']")).click();
			//#main-wrapper > div > div.app-wrapper > div.fullwidth-layout.dashboard-layout > div > section > div > div > button
			
			
			String nm= ex.getData(0,3,1);
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys(nm);
			
			String descr= ex.getData(0,4,1);
			driver.findElement(By.cssSelector("textarea[id='description']")).sendKeys(descr);
			//body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.Select.is-searchable > div > div.Select-placeholder
			driver.findElement(By.cssSelector("div[class='Select-placeholder']")).click();
			
			//body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.Select.is-searchable > div > div.Select-input > input
			//driver.findElement(By.className("Select-input ")).sendKeys("ATC047 Template");
			
			
			
			
			String templ= ex.getData(0,5,1);
			driver.findElement(By.cssSelector("body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.Select.is-searchable > div > div.Select-input > input")).sendKeys(templ); // (6)
			//driver.findElement(By.cssSelector("body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.Select.is-searchable > div > div.Select-input > input")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			//driver.findElement(By.className("Select-input ")).sendKeys(Keys.ENTER);
			driver.findElement(By.cssSelector("body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.Select.is-searchable > div > div.Select-input > input")).sendKeys(Keys.ENTER);
			//driver.findElement(By.cssSelector("body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.row.transaction-advanced-settings > div:nth-child(1) > button")).click();
			
			//driver.findElement(By.cssSelector("body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.row.transaction-advanced-settings > div:nth-child(1)")).click();
			//driver.findElement(By.cssSelector("body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.Select.is-searchable.has-value > div > div.Select-placeholder")).click();
			
			//driver.findElement(By.cssSelector("body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.Select.is-searchable > div > div.Select-input")).click();
			
			//String selector="body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.Select.is-searchable.is-open.is-focused > div.Select-menu-outer > div > div";
			//driver.findElement(By.cssSelector(selector)).click();
			
			//driver.findElement(By.cssSelector(selector)).sendKeys("ATC047 Template");
		    //driver.findElement(By.cssSelector("body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.Select.is-searchable > div > span")).click();
			
			//driver.findElement(By.cssSelector("#btnCreate > div > div > span")).click();
			
			
			
			
		}catch(Exception e)	{
			   e.printStackTrace();
		}
	}
	
       public void settingIcon() {
		
		try {
			//"body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.row.transaction-advanced-settings > div:nth-child(1) > button
			driver.findElement(By.cssSelector("button[class='button text-button medium-icon link-button show-advanced-settings-button']")).click();
			//body > div:nth-child(12) > div > div:nth-child(2) > div > div > div > div > section > form > div.row.transaction-advanced-settings > div:nth-child(2) > div > div > div:nth-child(1) > div:nth-child(1) > div
			driver.findElement(By.cssSelector("div[class=field]")).click();
			//body > div:nth-child(13) > div > div:nth-child(2) > div > div > div > div:nth-child(1) > div > div:nth-child(3) > div:nth-child(3) > div > div > div:nth-child(4) > button:nth-child(4)
			//String currentDate= driver.findElement(By.cssSelector("span[style=\"position:relative;color:#2f94d0;\"]")).getText();
			
			driver.findElement(By.cssSelector("body > div:nth-child(13) > div > div:nth-child(2) > div > div > div > div:nth-child(1) > div > div:nth-child(3) > div:nth-child(3) > div > div > div:nth-child(4) > button:nth-child(7)")).click();
			
			DateFormat dateformat=new SimpleDateFormat("dd");
			
			Date date= new Date();
			
			String date1= dateformat.format(date);
			
			int nextValue=Integer.parseInt(date1) +1;
			
			String v=Integer.toString(nextValue);
			
			System.out.println(v);
			
			//driver.findElement(By.xpath("//span[contains(text(), v)]/..")).click();
			//come back to finding the xpath for the button.
		    Thread.sleep(2000);
		    
		    
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
       
       public void Not() {
   		try {
   			driver.findElement(By.cssSelector("button[class='button text-button medium-icon link-button show-advanced-settings-button']")).click();
   			driver.findElement(By.cssSelector("input[id='notarization']")).click();
   			Thread.sleep(2000);
   		}catch(Exception e) {
   			e.printStackTrace();
   		}
   	}
   	
   	public void button() {
   		try {
   			driver.findElement(By.cssSelector("button[id='btnCreate']")).click();
   			Thread.sleep(2000);
   		}catch(Exception e) {
   			e.printStackTrace();
   		}
   	}
   	
      public void VerifyName() {
		
		try {
			
			String str= driver.findElement(By.cssSelector("input[value='TestAutomation']")).getAttribute("value"); //how to get the attributes
			
		    if(str.equals("TestAutomation")) {
			System.out.println("The name is updated");
		      }else {
			System.out.println("The Name is not updated");
		}	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
        public void VerifyDescription() {
		
		   try {
			
		   String str= driver.findElement(By.className("description-field")).getText();   //how to get the attributes
			
		    if(str.equals("This is a description")) {
			System.out.println("The description is updated");
		      }else {
			System.out.println("The description is not updated");
		}	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
        
        
        public void TurnedOn() {
        	try {
        		
        		boolean option=driver.findElement(By.id("notarization")).isEnabled();
        		
        		if(option==true) {
        			System.out.println("The Enabled notarization is enabled");
        		}else {
        			System.out.println("The enabled notarization is not enabled");
        		}
        		
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }
        
        public void addRec() {
        	
        	try {
        		
        		POITesting ex=new POITesting("P:\\Rezhnd Folder\\Excel Data\\TestData.xlsx");
        		
        		String fn=ex.getData(0, 6, 1);
        	    //test
        		driver.findElement(By.cssSelector("input[role='combobox']")).sendKeys(fn);
        		Thread.sleep(1000);
        		driver.findElement(By.cssSelector("ul[aria-hidden='false']")).click();
        		Thread.sleep(1000);
        		
        		driver.findElement(By.cssSelector("#main-wrapper > div > div.app-wrapper > div.grid-layout.transaction-edit-layout > div > div > div.row > div:nth-child(3) > section > div > div > button > div > span")).click();
        	           
                String sn=ex.getData(0, 7, 1);
        		driver.findElement(By.cssSelector("div[class=signers] li[class=list-item] li[class=\"item-field firstname\"] input[role=combobox]")).sendKeys(sn);
        		Thread.sleep(1000);
        		driver.findElement(By.cssSelector("ul[id=react-typeahead-options-4] li[aria-selected=\"false\"]")).click();
        		Thread.sleep(1000);
        		
        		driver.findElement(By.cssSelector("#main-wrapper > div > div.app-wrapper > div.grid-layout.transaction-edit-layout > div > div > div.row > div:nth-child(3) > section > div > div > button > div > span")).click();
        		
        		String an=ex.getData(0, 8, 1);
        		driver.findElement(By.cssSelector("div[class=\"signer-item is-invalid\"] li[class=\"item-field firstname\"] input[role=\"combobox\"]")).sendKeys(an);
        		Thread.sleep(1000);
        		
        		driver.findElement(By.cssSelector("ul[id=\"react-typeahead-options-7\"] li[aria-selected=\"false\"]")).click();
        		Thread.sleep(1000);
        		
        		driver.findElement(By.cssSelector("#main-wrapper > div > div.app-wrapper > div.grid-layout.transaction-edit-layout > div > div > div.row > div:nth-child(3) > section > div > div > button > div > span")).click();
        		
        		String str=ex.getData(0, 9, 1);
        		driver.findElement(By.cssSelector("div[class=\"signer-item is-invalid\"] li[class=\"item-field firstname\"] input[role=\"combobox\"]")).sendKeys(str);
        		Thread.sleep(1000);
        		
        		driver.findElement(By.cssSelector("ul[id=react-typeahead-options-10] li[aria-selected=\"false\"]")).click();	
        		
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }
        
        public void NextButton() {
        	try {
        		
        		driver.findElement(By.cssSelector("div[class=\"fixed-button-wrapper\"] button[class=\"button responsive-button design-transaction-button\"]")).click();
        		Thread.sleep(1000);
        		
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }
        
       
        public void setSigningOrder() {
        	
        	try {
        		Thread.sleep(1000);
        		driver.findElement(By.cssSelector("div[class=col-md-2]")).click();
        		
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        	
        }
        
        
        public void uploadDocument() {
        	
        	try {
        		
        		POITesting ex=new POITesting("P:\\Rezhnd Folder\\Excel Data\\TestData.xlsx");
        		Thread.sleep(1000);
        		String doc=ex.getData(0, 10, 1);
        		driver.findElement(By.id("fileupload")).sendKeys(doc); //must be a input type for the id not the button
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }

        
        
        public void swapping() {
        	
        	try {
        		

        		//drag and drop method first parameter is source locator and the second locator is the destinator locator
        		
        		WebElement from=driver.findElement(By.cssSelector("ul[class='list list-decorated list-hover list-draggable signers-list'] > li:nth-child(4) div[class='drag-handle']"));  // source locator
        		    
        		
        		WebElement to=driver.findElement(By.cssSelector("ul[class='list list-decorated list-hover list-draggable signers-list'] > li:nth-child(1)"));   //destination
        		
        		Actions act=new Actions(driver);
        		
        		act.pause(5000).dragAndDrop(from, to).build().perform();
      
        		
        		Thread.sleep(1000);
        		
                 WebElement from1=driver.findElement(By.cssSelector("ul[class='list list-decorated list-hover list-draggable signers-list'] > li:nth-child(3) div[class='drag-handle']"));  // source locator
        		    
        		
        		WebElement to1=driver.findElement(By.cssSelector("ul[class='list list-decorated list-hover list-draggable signers-list'] > li:nth-child(2)"));   //destination
        		
        		//Actions act1=new Actions(driver);
        		
        		act.pause(5000).dragAndDrop(from1, to1).build().perform();
    
        		
        		
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }
        
        
        
       public void SignOrderEnabled() {
        	
        	try {
        		
               boolean option=driver.findElement(By.className("col-md-2")).isEnabled();
        		
        		if(option==true) {
        			System.out.println("The Sign order is enabled");
        		}else {
        			System.out.println("The Sign order is not enabled");
        		}
        		
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }
       
       
       public void addSignature() {
       	
       	try {
       	
       		Thread.sleep(1000);
       		
       		driver.findElement(By.cssSelector("section[id=\"signature-blocks\"] i[class=\"icon-pen\"]")).click();
       		
       		Thread.sleep(1000);
       		
       		driver.findElement(By.cssSelector("ul[class=\"list list-selectable\"] li[class=\"list-item roleColor2\"]")).click();
       		
       		Thread.sleep(1000);
       		
       		driver.findElement(By.cssSelector("section[id=\"signature-blocks\"] i[class=\"icon-pen\"]")).click();
       		
       		Thread.sleep(1000);
       		
       		driver.findElement(By.cssSelector("ul[class=\"list list-selectable\"] li[class=\"list-item roleColor3\"]")).click();
       		
       		Thread.sleep(1000);
       		
       		driver.findElement(By.cssSelector("section[id=\"signature-blocks\"] i[class=\"icon-pen\"]")).click();
       		
            Thread.sleep(1000);
       		
       		driver.findElement(By.cssSelector("ul[class=\"list list-selectable\"] li[class=\"list-item roleColor4\"]")).click();
       		
       		Thread.sleep(1000);
       		
       		driver.findElement(By.cssSelector("section[id=\"signature-blocks\"] i[class=\"icon-pen\"]")).click();
       		
       		
       	}catch(Exception e) {
       		e.printStackTrace();
       	}
       }
       
       
       public void saveLayout() {
       	
       	try {
       		
       		POITesting ex=new POITesting("P:\\Rezhnd Folder\\Excel Data\\TestData.xlsx");
       		
       		String template=ex.getData(0, 11, 1);
       		
       		driver.findElement(By.cssSelector("div[class=\"layout-actions-bar align-right\"] > span:nth-child(1) button[class=\"icon-button\"]")).click();
       		
       		driver.findElement(By.cssSelector("section[class=\"modal-content\"] input[maxlength=\"100\"]")).sendKeys(template); // CHANGE THIS NAME EVERYTIME YOU EXECUTE THE CODE.
       		
       		String description=ex.getData(0, 12, 1);
       		driver.findElement(By.cssSelector("section[class=\"modal-content\"] textarea[maxlength=\"255\"]")).sendKeys(description);
       		
       		driver.findElement(By.cssSelector("div[class=\"bottom-bar\"] div:nth-child(2) button[class=\"button\"]")).click();
       		
       		
       	}catch(Exception e ) {
       		
       	}
       }
       
       public void applyLayout() {
       	
       	try {
       		
       		POITesting ex=new POITesting("P:\\Rezhnd Folder\\Excel Data\\TestData.xlsx");
       		
       		Thread.sleep(1000);
       		driver.findElement(By.cssSelector("div[class=\"layout-actions-bar align-right\"] > span:nth-child(2) button[id=\"btnApplyLayout\"]")).click();
       		
       		Thread.sleep(1000);
       		
       		driver.findElement(By.cssSelector("div[class=\"Select is-searchable\"]")).click();
       		
       		Thread.sleep(1000);
       		
       		String sampName=ex.getData(0, 13, 1);
       		driver.findElement(By.cssSelector("div[class=\"Select-input \"] input[value]")).sendKeys(sampName);
       		
       		Thread.sleep(1000);
       		//div[class=\"Select-menu-outer\"] div[class=\"Select-menu\"] div[class=\"Select-option is-selected is-focused\"]
       		driver.findElement(By.cssSelector("div[class=\"Select-menu-outer\"] div[class=\"Select-menu\"]")).click();
       		Thread.sleep(1000);
       		
       		//driver.findElement(By.cssSelector("div[class=\"Select-input \"]")).sendKeys("Sample Layout");
       		
       		// click the "apply" button which applies the layout onto the documents.
       		driver.findElement(By.cssSelector("div[class=\"bottom-bar\"] button[class=\"button\"]")).click();
       		
       		Thread.sleep(1000);
       		
       	}catch(Exception e) {
       		e.printStackTrace();
       	}
       }
       
       
       public void sendToSign() {
       	
       	try {
       		
       		Thread.sleep(1000);
       		driver.findElement(By.cssSelector("div[class=\"send-button-container\"] button[class=\"button responsive-button send-transaction-button\"]")).click();
       		
       		//confirm sending the transaction
       		//driver.findElement(By.cssSelector("div[class=\"bottom-bar\"] button[class=\"button\"]")).click();
       		
       	}catch(Exception e) {
       		e.printStackTrace();
       	}
       }
       
    
       public void visibility() {
    	   
    	   try {
    		   Thread.sleep(1000);
    		   driver.findElement(By.cssSelector("div[class=\"layout-actions-bar align-right\"] > button:nth-child(3)")).click();
    		   
    	   }catch(Exception e) {
    		   e.printStackTrace();
    	   }
       }
	
	
	
	
	public static void main(String[] args) {

		HelloWorld myObj = new HelloWorld();
		myObj.invokeBrowser();
		myObj.Login();
		myObj.trans();
		//myObj.settingIcon();
		//myObj.Not();
		myObj.button();
		myObj.VerifyName();
		myObj.VerifyDescription();
	    //myObj.TurnedOn();
		myObj.uploadDocument();
		myObj.addRec();
		myObj.swapping();
		myObj.SignOrderEnabled();
		myObj.NextButton(); //this works
		myObj.addSignature();
		myObj.saveLayout();
		myObj.applyLayout();
		//myObj.visibility();
	    myObj.sendToSign();
		
	}
	

	
	
	
	
}
