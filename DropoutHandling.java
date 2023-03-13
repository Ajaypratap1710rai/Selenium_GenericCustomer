package GenericCustomer.testscript;

import java.awt.AWTException;

//import java.awt.Robot;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.genericLib.BaseClass;

public class DropoutHandling extends BaseClass {
   @Test
   public void Handledropout() throws AWTException
   {
	   driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/div/div")).click();
       driver.findElement(By.xpath("//div[contains(text(),'Manage system settings & configure actiTIME')]")).click();
       WebElement dropdown=driver.findElement(By.xpath("//select[@id='firstHierarchyLevelCodeSelect']"));
       cu.getSelectByVisibleText(dropdown,"Product");
       String msg=driver.findElement(By.id("FormModifiedTextCell")).getText();
       System.out.println(msg);
   }
}
