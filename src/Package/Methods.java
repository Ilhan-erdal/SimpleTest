package Package;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Methods {
	
	
	WebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);
	WebDriverWait element = (new WebDriverWait(driver, 10));
	
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
			
		}
		
		public void HomePage() {
		String url = "www.google.se";
		String button = "//*[@name='q']";
		String title = "Google";

		driver.get("http://google.se");
		String expected = driver.getTitle();
		driver.findElement(By.xpath(button)).click();
		
		assertEquals(title, expected);

		}
		
		public void makeASearch() {
			String Word = "Alphabet";
			String searchpath = "//*[@name='q']"; 
			String clickOnButton = "//*[@name='btnK']";
			String xpathExpression = "//*[(@data-attrid='title')]";
			
			action.moveToElement(driver.findElement(By.xpath(searchpath)));
			driver.findElement(By.xpath(searchpath)).click();
			driver.findElement(By.xpath(searchpath)).sendKeys(Word);
			element.until(ExpectedConditions.elementToBeClickable(By.xpath(clickOnButton)));
			driver.findElement(By.xpath(clickOnButton)).click();
			
			String titleContains = driver.findElement(By.xpath(xpathExpression)).getText();
			System.out.println(Word+" "+titleContains);
			Assert.assertEquals(Word, titleContains);
		}
		
		public void moveToElement() {
			String expected = "";
			String xpath = "";
			String target = "";
			
			driver.findElement(By.xpath(xpath)).click();
			action.build();
			action.moveToElement(driver.findElement(By.xpath(xpath)));
			action.perform();
		}
		
		public void theBigList() {
			String listXpathExpression = "";
			
			List<WebElement> elementName = driver.findElements(By.xpath(listXpathExpression));
			
		}
		
		
		
		@AfterTest
		public void closeBrowser() {
			System.out.println("Closing down the Browser");
			driver.close();
			System.out.println("Browser closed");
			
		}
		
	}

