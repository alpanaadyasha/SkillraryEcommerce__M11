package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage 
{
	//Declaration
		//address of select category
		@FindBy(name="addresstype")
		private WebElement selectDd;
		
		//address of feedback
		@FindBy(xpath="//a[text()='FEEDBACK']")
		private WebElement feedBckbtn;
		
		//intialiazation
		public DemoSkillraryPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		public WebElement getSelectDd() {
			return selectDd;
		}

		public WebElement getFeedBckbtn() {
			return feedBckbtn;
		}
	 
		//Business Library
		public void feedBckbtn()
		{
			feedBckbtn.click();
		}
}
