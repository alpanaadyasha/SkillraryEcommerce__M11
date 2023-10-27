package scripts;

import org.testng.annotations.Test;

import generic_library.BaseClass;
import pom.DemoSkillraryPage;
import pom.SkillraryHomepage;
import pom.TestingPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1() throws Throwable
	{
		SkillraryHomepage s=new SkillraryHomepage(driver);
		s.gearsButton(); //business library of gears in SkillraryHomepage
		s.skillraryDemoApp();//business libary of skillraryDemoApp in SkillraryHomepage
		utilities.childBrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		utilities.dropDown(ds.getSelectDd(),pdata.getPropertydata("coursedd"));
		TestingPage t=new TestingPage(driver);
		utilities.Scrolling(driver, t.getFacebook());
		Thread.sleep(3000);
		t.FacebookWebElement();//business library of FacebookElement in TestingPage
	}
}
