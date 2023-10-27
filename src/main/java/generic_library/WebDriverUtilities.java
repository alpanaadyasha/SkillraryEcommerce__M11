package generic_library;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities
{
	//1.Handles dropdown
    public void dropDown(WebElement ele,String text)
    {
 	   Select s=new Select(ele);
 	   s.selectByVisibleText(text); 
    }
    //2.Handling MouseOvering
    public void mouseOvering(WebDriver driver,WebElement ele)
    {
 	   Actions a=new Actions(driver);
 	   a.moveToElement(ele).perform();
    }
    //3.Handling Right Click
    public void rightclick(WebDriver driver,WebElement ele)
    {
 	   Actions a=new Actions(driver);
		   a.contextClick(ele).perform();
    }
    //4.Handling Double Click
    public void doubleclick(WebDriver driver,WebElement ele)
    {
 	   Actions a=new Actions(driver);
		   a.doubleClick(ele).perform();
    }
    //5.Handling Drag_nd_DRop
 	public void dragdrop(WebDriver driver,WebElement ele1,WebElement ele2)
 	{
 		Actions a=new Actions(driver);
 		a.dragAndDrop(ele1,ele2).perform();
 	}
 	//6.Handling Frame
 	public void frames(WebDriver driver,String value)
 	{
 		driver.switchTo().frame(value);
 	}
 	//7.Handling default content
 	public void frames(WebDriver driver)
 	{
 		driver.switchTo().defaultContent();
 	}
 	//8.Handling child browser
 	public void childBrowser(WebDriver driver)
 	{
 		Set<String> child = driver.getWindowHandles();
 		for(String b:child)
 		{
 			driver.switchTo().window(b);
 		}
 	}
 	//9.Handling Scrolling
 	public void Scrolling(WebDriver driver,WebElement ele)
 	{
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 		js.executeScript("arguments[0].scrollIntoView();", ele);
 	}
 	//10.Handling POP_UP
 	public void popup(WebDriver driver)
 	{
 		driver.switchTo().alert().accept();
 	}
}
