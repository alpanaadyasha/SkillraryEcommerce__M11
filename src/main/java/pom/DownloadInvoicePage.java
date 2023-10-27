package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage 
{
	//Declaration
		 //address of download invoice
		@FindBy(xpath="//input[@name='downloadInvoice']")
		private WebElement downloadInvoicebtn;

		//intialiazation
	    public  DownloadInvoicePage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    	
	    }
	    //Utilization
		public WebElement getDownloadInvoicebtn() {
			return downloadInvoicebtn;
		}
		//Business Library
		public void downloadInvoiceButton()
		{
			downloadInvoicebtn.click();
		}
}
