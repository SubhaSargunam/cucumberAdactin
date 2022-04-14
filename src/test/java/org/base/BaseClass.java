package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
		public static WebDriver driver;
		public static void getDriver(String browserName) {
			switch(browserName) {
			
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;
			default:
				System.out.println("Invalid Browser");
			
			}

		}
		
		public static void launchUrl(String Url) {
			driver.get(Url);
		}
		public static WebElement findElements(String locator,String value) {
			WebElement element=null;
			switch(locator) {
			case "id":
			    element=driver.findElement(By.id(value));
				break;
			case "name":
			    element=driver.findElement(By.name(value));
				break;
			case "xpath":
				element=driver.findElement(By.xpath(value));
				break;
			default:
				System.out.println("Invalid Locator");
					
			}
			return element;
			
		}
		public static void typeText(WebElement element,String value) {
			element.sendKeys(value);
		}
		public static void btnClick(WebElement element) {
			element.click();
		}
		
			
		
		public static void takingScreenshot(String methodName) throws IOException {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs,new File(methodName+".png"));
		}
	
	}


