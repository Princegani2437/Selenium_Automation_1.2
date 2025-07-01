package electronics;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic_utility.Baseclass;
import generic_utility.Listener_utility;
import object_repository.Homepage;
@Listeners(Listener_utility.class)
public class TC_DWS_003_Test extends Baseclass{
@Test
	public void clickonelectronics() {
		
		
		Homepage hp = new Homepage(driver);
		hp.getElectronicslink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics","Electronics page is not displayed");
		test.log(Status.PASS, "Electronics page is  displayed");
		
		driver.close();
	}
}
