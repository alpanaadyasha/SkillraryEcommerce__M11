package generic_library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	public WebDriver driver;
	public PropertyFile pdata=new PropertyFile();
	public WebDriverUtilities utilities = new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "F:\\JAVA eclipse\\QCO-SOEJVD-M11\\src\\main\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(pdata.getPropertydata("url"));
	    
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws Throwable
	{
		int status=res.getStatus();
		String name=res.getName();
		if(status==2)
		{
			Photo p=new Photo();
			p.getPhoto(driver, name);
		}
		driver.quit();
	}
}
