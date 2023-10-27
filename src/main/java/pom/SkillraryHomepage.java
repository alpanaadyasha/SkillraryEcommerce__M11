package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomepage
{
	//Declaration
		//address of gears
		@FindBy(xpath="//a[text()=' GEARS ']")
		private WebElement gearsbtn;
		
		//address of skillraray demo app
		@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
		private WebElement skillrarydemoapp;
		
		//address of search text field
		@FindBy(xpath="//input[@name='q']")
		private WebElement searchTf;
		
		//address of search icon
		@FindBy(xpath="//input[@value='go']")
		private WebElement searchIcon;
		
		//Intialization
		public SkillraryHomepage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		//Utilization

		public WebElement getGearsbtn() {
			return gearsbtn;
		}

		
		public WebElement getSkillrarydemoapp() {
			return skillrarydemoapp;
		}

		
		public WebElement getSearchTf() {
			return searchTf;
		}

		

		public WebElement getSearchIcon() {
			return searchIcon;
		}

		//business libraries
		public void  gearsButton()
		{
			gearsbtn.click();
		}
		public void skillraryDemoApp()
		{
			skillrarydemoapp.click();
		}
		public void searchTextField(String data)
		{
			searchTf.sendKeys(data);
		}
		public void searchIconWebElement()
		{
			searchIcon.click();
		}
}
