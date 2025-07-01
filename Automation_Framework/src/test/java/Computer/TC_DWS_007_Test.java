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
public class TC_DWS_007_Test extends Baseclass{

	@Test
	
	public void clickonAccessories() {
		
		Homepage hp = new Homepage(driver);
		
		WebElement cmpaccess = hp.getComputerslink();
		wUtil.mousehover(driver, cmpaccess);
		hp.getAccessorieslink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Accessories","Accessories page is not loaded");
		test.log(Status.PASS, "Accessories page is not loaded");
	}
}
