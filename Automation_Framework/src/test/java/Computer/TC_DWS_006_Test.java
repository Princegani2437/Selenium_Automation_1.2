package Computer;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic_utility.Baseclass;
import generic_utility.Listener_utility;
import object_repository.Homepage;
@Listeners(Listener_utility.class)
public class TC_DWS_006_Test extends Baseclass{

	@Test
	public void clickonnotebook() {
		Homepage hp = new Homepage(driver);
		WebElement notebookclik = hp.getComputerslink();
		wUtil.mousehover(driver, notebookclik);
		hp.getClickonnotebooklink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Notebooks","Notebook page is not loaded");
		test.log(Status.PASS, "Notebook page is loaded");
		
	}
}
