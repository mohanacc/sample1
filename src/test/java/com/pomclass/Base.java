package com.pomclass;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import    org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {


	 static WebDriver driver;
	


	public static void Browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	public static void loadurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public WebElement Findelement_id(String id) {
		WebElement Fid=driver.findElement(By.id(id));
		return Fid;
	}
	public WebElement Findelement_name(String name) {
		WebElement Fname=driver.findElement(By.id(name));
		return Fname;
	}
	public WebElement Findelement_class(String classname) {
		WebElement Fclass=driver.findElement(By.id(classname));
		return Fclass;
	}

	public WebElement Findelement_Xpath(String Xpath) {
		WebElement Fxpath=driver.findElement(By.id(Xpath));
		return Fxpath;
	}
	public List<WebElement> findElements(String id) {
		List<WebElement> findElements = driver.findElements(By.id(id));
		return findElements;
	}

	public void sendvalues(WebElement element,String data) {
		element.sendKeys(data);

	}
	public String Gettext(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String  Getattributes(WebElement element,String name) {
		String attribute = element.getAttribute(name);
		return attribute;
	}
	public String  Getattribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public void closebrowser() {
		driver.close();
	}
	//
	public void quitbrowser() {
		driver.quit();
	}
	//getTitle();
	public String Title() {
		String title = driver.getTitle();
		return title;

	}
	//Currenturl();
	public String Currenturl() {
		String current = driver.getCurrentUrl();
		return current;
	}
	//click()
	public void Clickable(WebElement element) {
		element.click();   
	}

	public String Windowhandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}
	public Set<String> Windowhandles() {
		Set<String> handles = driver.getWindowHandles();
		return handles;
	}


	public WebDriver Switch_to_window(String name) {
		WebDriver window = driver.switchTo().window(name);
		return window;

	}


	public String pagesource() {
		String source = driver.getPageSource();
		return source;
	}

	public void JavaScriptinsert(WebElement element,String text) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;

		executor.executeScript("arguments[0].setAttribute('value','"+text+"')",element);


	}
	public void Javascriptclick(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);

	}

	public Object getattributejs(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		Object script = executor.executeScript("return.arguments[0].getAttribute('value')",element);
		return script;
	}

	public void rightclk(WebElement element) {
		
		 Actions actions = new Actions(driver);
		 actions.contextClick(element).perform();
		 
	}   
	 
	 public void moveelement(WebElement element) {
			
		 Actions actions = new Actions(driver);
		 actions.moveToElement(element).perform();
		 
	}   
	    
	 public void draganddrop(WebElement source,WebElement target) {
			
		 Actions actions = new Actions(driver);
		 actions.dragAndDrop(source, target);
		 
	}      
	 
	 public void doubleclk(WebElement element) {
			
		 Actions actions = new Actions(driver);
		 actions.doubleClick(element).perform();
		 
	}   
	
	public void KeysEnter(String text) {
		Actions actions=new Actions(driver);
		Actions enterkey = actions.sendKeys(text,Keys.ENTER);
		
	}


	public void Selectbytext(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	

	public void Selectbyindex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void Selectbyvalue(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void deselectall(WebElement element) {
		Select select=new Select(element);
		select.deselectAll();

	}
	public void deselectindex(WebElement element,int index) {
		Select select=new Select(element);
		select.deselectByIndex(index);

	}
	public void deselectvalue(WebElement element,String value) {
		Select select=new Select(element);
		select.deselectByValue(value);

	}
	public void deselectvtext(WebElement element,String text) {
		Select select=new Select(element);
		select.deselectByVisibleText(text);

	}
	public void selectindex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);

	}
	public void selectvalue(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);

	}

	public void Alertok() {
		Alert Ok = driver.switchTo().alert();
		Ok.accept();


	}
	public void Alertcancel() {
		Alert cancel = driver.switchTo().alert();
		cancel.dismiss();
	}
	public void SendAlert(String data) {
		Alert sendkeyalert = driver.switchTo().alert();
		sendkeyalert.sendKeys(data);


	}
	public static void refresh() {

		driver.navigate().refresh();
	}

	public 	void impwait() {
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		


	}
	public WebElement expwait(String text) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(text)));
		return until;
	}
	 public void jsscrollup(WebElement element ) {
			
		 JavascriptExecutor executor =(JavascriptExecutor)driver;
		    
		    executor.executeScript("arguments[0].scrollIntoView(false)", element);
		    
		 } 
	 
	 public void jsscrolldoWn(WebElement element ) {
			
		 JavascriptExecutor executor =(JavascriptExecutor)driver;
		    
		    executor.executeScript("arguments[0].scrollIntoView(true)", element);
		    
		 }
	 public void fluentwaitclick(int sec,int sec1,String name) {
			
		  Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(sec)).pollingEvery(Duration.ofSeconds(sec1)).ignoring(Throwable.class);
		 
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.name(name)));
			 
		 }

	public WebDriver Framesindex(int index) {
		WebDriver frame = driver.switchTo().frame(index);
		return frame;
	}


	public WebDriver frameid(String nameOrId) {
		WebDriver framein = driver.switchTo().frame(nameOrId);
		return framein;
	}
	public WebDriver framepath(String Xpath) {
		WebDriver frameX = driver.switchTo().frame(Xpath);
		return frameX;
	}

	public void minimize() {
		driver.manage().window().minimize();
	}
	public void fullscreen() {
		driver.manage().window().fullscreen();
	}
	public void frameparent() {
		
		 
		 driver.switchTo().parentFrame();
	}
	public void keyaction(int keycode) throws Throwable {

		Robot robot = new Robot();
		robot.keyPress(keycode);
		robot.keyRelease(keycode);

		}

	public void takescreenshot(WebElement element,String pathname) throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot)driver; 
		File s=element.getScreenshotAs(OutputType.FILE);
		File d=new File(pathname);
		FileUtils.copyFile(s,d);
	}
	public void takescreenshotp(String pathname) throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot)driver; {
			File s=screenshot.getScreenshotAs(OutputType.FILE);
			File d=new File(pathname);
			FileUtils.copyFile(s, d);
		}
	}
	public void Writedatas(String namepath,String sheetname,int rowno,int cellno,String data) throws IOException {

		File file = new File(namepath);
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook= new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet(sheetname);
		
		Row row = sheet.getRow(rowno);
		
		Cell cell = row.createCell(cellno);
		
		cell.setCellValue(data);
		
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);

	}	
	public String getdatas(String namepath,String sheetname,int rowno,int cellno) throws IOException {
		String data=null;

		File file = new File(namepath);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(stream);
		Sheet sheetAt = workbook.getSheet(sheetname);
		Row row = sheetAt.getRow(rowno);
		Cell cell = row.getCell(cellno);
		
    CellType Type = cell.getCellType();
	
		
		switch (Type) {
		case STRING:
		data = cell.getStringCellValue();
			
			break;
		case NUMERIC:
			
			if (DateUtil.isCellDateFormatted(cell)) {
				
			Date date = cell.getDateCellValue();
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
				
				 data = dateFormat.format(date);
			} 
			
			else {
				
				double d = cell.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(d);
				 data = b.toString();
				
				}
			
			break;
			
			default:
			break;
			}
		
		return data;
	}
	
	public void updatedatas(String filenamepath,String sheetname,int rowno,int cellno,String olddata,String newdata) throws IOException {
		
		File file = new File(filenamepath);
				
				FileInputStream stream = new FileInputStream(file);
				
				Workbook workbook= new XSSFWorkbook(stream);
				
				Sheet sheet = workbook.getSheet(sheetname);
				
				Row row = sheet.getRow(rowno);
				
				Cell cell = row.getCell(cellno);
				
				String value = cell.getStringCellValue();
				
				if (value.equals(olddata)) {
					
					cell.setCellValue(newdata);
				}
				
				FileOutputStream o = new FileOutputStream(file);
				workbook.write(o);

			}
	
	
public void createworkbook(String filenamepath,String sheetname,int rowno,int cellno,String data) throws IOException {
		
		File file = new File(filenamepath);
				
			Workbook workbook= new XSSFWorkbook();
				
				Sheet sheet = workbook.createSheet(sheetname);
				
				Row row = sheet.getRow(rowno);
				
				Cell cell = row.createCell(cellno);
				
				cell.setCellValue(data);
				
				
				FileOutputStream o = new FileOutputStream(file);
				workbook.write(o);

			}
	
	
		
	}	



