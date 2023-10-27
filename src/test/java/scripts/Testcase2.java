package scripts;

import org.testng.annotations.Test;

import generic_library.BaseClass;
import pom.DemoSkillraryPage;
import pom.DownloadInvoicePage;
import pom.SkillraryHomepage;

public class Testcase2 extends BaseClass
{
	@Test
	public void tc2()
	{
		SkillraryHomepage s=new SkillraryHomepage(driver);
		s.gearsButton(); //business library of gears from SkillraryHomepage
		s.skillraryDemoApp();//business libary of skillraryDemoApp from SkillraryHomepage
		utilities.childBrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		ds.feedBckbtn();//business library of feedBckbtn from DemoSkillraryPage
		DownloadInvoicePage dI=new DownloadInvoicePage(driver);
		dI.downloadInvoiceButton();// business library of downloadInvoiceButton from DownloadInvoicePage
	}
}
