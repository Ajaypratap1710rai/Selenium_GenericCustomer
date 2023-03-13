package GenericCustomer.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.genericLib.BaseClass;

public class AlertHandling extends BaseClass{
  @Test
  public void handleAlert() throws EncryptedDocumentException, IOException
  {
	  driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/div/div")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Types of Work')]")).click();
	  driver.findElement(By.className("i")).click();
	  driver.findElement(By.id("name")).sendKeys(du.getDataForExcelSheet("Sheet 1", 2, 1));
	  driver.findElement(By.xpath("input[@onclick='handleCnacel();']")).click();
	  String msg=cu.getAlertMsgFetch(driver);
	  System.out.println(msg);
	  cu.getAlertMsgOK(driver);
  }
}
