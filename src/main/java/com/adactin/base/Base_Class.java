package com.adactin.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;
	public static WebDriver getBrowser(String type) {
	if (type.equalsIgnoreCase("chrome")) {
		System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}else if (type.equalsIgnoreCase("gecko")) {
		System.getProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\firefoxdriver.exe");
		 driver = new FirefoxDriver();
	}driver.manage().window().maximize();
	return driver;
	}

	//click
public static void clickOnElement(WebElement element) {
	element.click();
}

//Sendkeys
public static  void inputValueElement(WebElement element, String value) {// here we are using string value)
element.sendKeys(value);


}
//getUrl
		public static void getUrl(String Url) {
	driver.get(Url);

	}//checkBox
		public static void checkBox(WebElement element) {
			element.click();
		}
//getTitle
public static  void getTitle(String Title) {
	String title2 = driver.getTitle();
	System.out.println(title2);
}//getcurrenturl;

public static void getCurrentUrl(String Url) {
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
}//get text
public static  void getText(WebElement element ,String text) {
	String text2 = element .getText();
	System.out.println(text2);
}
//WEB ELEMENT METHODS
//is enabled
public static void isEnbaled(WebElement element) {
	boolean enabled = element.isEnabled();
	System.out.println(enabled);

}//is displayed
protected void isDisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
	System.out.println(displayed);
	}

//get attribute (value)
public static void getAttribut(WebElement element,String option , String value) {
	if (option.equalsIgnoreCase("value")) {
		String attribute = element.getAttribute(value);
		System.out.println("passed Value: "+attribute);
	}else if (option.equalsIgnoreCase("name")) {
		String attribute2 = element.getAttribute(value);
		System.out.println("Attbribute value:"+attribute2);
	}

}
	//is selected
public static  void isSelected(WebElement element) {
	boolean selected = element.isSelected();
System.out.println("isSelected:"+selected);
}
//clear
public static void clear(WebElement element) {
	element.clear();
}//navigation methods
public static void navigateTo(String Url) {
	driver.navigate().to(Url);
}
//move back
public static void navigateBack(String Url) {
	driver.navigate().back();
}
public static void navigateForward() {
	driver.navigate().forward();	

}
//refresh
public static  void navigateRefresh() {
	driver.navigate().refresh();

} //wait
public static void implicitWait(int w) {
	driver.manage().timeouts().implicitlyWait(w,TimeUnit.SECONDS);
}
public static void explicitWait(WebElement element, int w) {
	WebDriverWait wait = new WebDriverWait(driver, w);
	wait.until(ExpectedConditions.visibilityOf(element));
}
 
//close
public static  void close() {
	driver.close();
}//quit
public static void quit() {
	driver.quit();
}
 //Alert
public  static void alert(WebElement element,String option) {
	Alert element1 = driver.switchTo().alert();
	if (option.equalsIgnoreCase("accept")) {
		element1.accept();
	}else if (option.equalsIgnoreCase("dismiss")) {
		element1.dismiss();

	}else if (option.equalsIgnoreCase("text")) {
		String text = element1.getText();
		System.out.println(text);

	}
	
}
//actions
public static void mouseOver(WebElement element,String action) {
	try {
		Actions a=new Actions(driver);
		if (action.equalsIgnoreCase("move")) {
			a.moveToElement(element).build().perform();
		} 
		else if (action.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		
		}
		else if (action.equalsIgnoreCase("rightclick")) {
			a.contextClick(element).build().perform();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}}
//Robot Actions	
public   static void robotAction(WebElement element, String option ) throws AWTException {
	Robot r = new Robot();
	if (option.equalsIgnoreCase("down")){
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
	}else if (option.equalsIgnoreCase("up")) {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	
	else if (option.equalsIgnoreCase("enter")) {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
}	
//Screenshot	
public static  void takescreenshot(String filename) throws IOException {
 TakesScreenshot ts = (TakesScreenshot) driver;
 File source = ts.getScreenshotAs(OutputType.FILE);
 File destination = new File(filename+".png");
 FileUtils.copyFile(source, destination);
}
//scroll up and down
public static  void scrollup(WebElement element,String option) {

	JavascriptExecutor js=(JavascriptExecutor) driver;
	if (option.equalsIgnoreCase("view")) {
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	else if (option.equalsIgnoreCase("pixel")) {
		js.executeScript("window.scrollBy(0,1000)");
	}

}	

//frames
	public static void frames(WebElement element) {
		driver.switchTo().frame(element);
	}
	//mainframe
	public static void mainFrame() {
		driver.switchTo().defaultContent();
	}//switch to frame
public static void SwitchToFrame() {
	driver.switchTo().frame(0);

}

//singledropdown
	public static  void selectTheElement(WebElement element, String option,String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("text")) {
	s.selectByVisibleText(value);
		}else if (option.equalsIgnoreCase("Value")) {
			s.selectByValue(value);
		}else if (option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		}}
		//multidropdown
public static List<WebElement> getAllOptions (WebElement element,String size) {
		
	Select s=new Select(element);
	List<WebElement> options = s.getOptions();
for (WebElement geto : options) {
	String text = geto.getText();
	System.out.println( text);
}
	
int size1 = options.size();
System.out.println(size1);
return options;
}//all selected option

public static void getAllSelected(WebElement element,String options,String value) {
	Select s=new Select(element);
	if (options.equalsIgnoreCase("index")) {
		int parseInt = Integer.parseInt(value);
		s.selectByIndex(parseInt);
	}
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement selected : allSelectedOptions) {
		String text1 = selected.getText();
		System.out.println(text1);
	}
}
//getfirstselected
public static void getFirstSelected(WebElement element) {
	Select s=new Select(element);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());


}// ismultiple
public static void isMultiple(WebElement element) {

	Select s=new Select(element);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);

}
public static void particular_Data(String path,int sheetindex,int rowIndex,int cellIndex) throws Throwable  {
	File f= new File(path);	
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(sheetindex);
	Row row = sheetAt.getRow(rowIndex);
	Cell cell = row.getCell(cellIndex);
	CellType cellType = cell.getCellType();
	if (cellType.equals(CellType.STRING)) {
		
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);	
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		
		int value = (int) numericCellValue;//narrow casting
		
		System.out.println(value)	;
		
	}
}

	

//windowsHandle
public static void windowsHandles(String type,String destination ) {
	if (type.equalsIgnoreCase("singlewindow")) {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}else if (type.equalsIgnoreCase("multiplewindows")) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String all : windowHandles) {
			System.out.println("*******all window******");
			String title1 = driver.switchTo().window(all).getTitle();
			System.out.println(title1);
		} 
		String actualTitle = destination;
          for (String all : windowHandles) {
			if (driver.switchTo().window(all).getTitle().equals(actualTitle)) {
				break;	
			}
		}
         

	}
	
	
	
	
	
	
	
	
	
	
}




















































}
		
		
