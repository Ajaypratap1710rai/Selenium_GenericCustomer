package GenericCustomer.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.genericLib.CommounUtility;
import Generic.genericLib.DataUtility;

public class CreateCustmer {
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
	  DataUtility du=new DataUtility();
	  CommounUtility cu=new CommounUtility();
	  int num=cu.getRandom(10000);
	  String actualcustomer=du.getDataForExcelSheet("Sheet 1", 0, 0);
	  actualcustomer=actualcustomer+num;
	  
	  //Generic--------->
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(du.getDataFforPropertiesFile("url"));
		driver.findElement(By.id("username")).sendKeys(du.getDataFforPropertiesFile("username"));
		driver.findElement(By.name("pwd")).sendKeys(du.getDataFforPropertiesFile("password"));
		driver.findElement(By.id("loginButton")).click();
		
		//click on task------>
		driver.findElement(By.id("container-task")).click();
		
		//click on addnew----->
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		
		//click on new customer----->
		driver.findElement(By.className("createNewCustomer")).click();
		driver.findElement(By.className("newNameField")).sendKeys(actualcustomer);
		driver.findElement(By.xpath("//div[text()='createcustomer']")).click();
		}
}


















