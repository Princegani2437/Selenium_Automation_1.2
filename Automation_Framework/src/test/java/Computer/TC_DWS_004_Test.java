package Computer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic_utility.Baseclass;
import generic_utility.Listener_utility;
import object_repository.Homepage;

@Listeners(Listener_utility.class)
public class TC_DWS_004_Test  extends Baseclass {

	@Test
	public void clickondropdownofcomputer() throws IOException {
		
		Homepage hp = new Homepage(driver);
		WebElement computerdrpdwn = hp.getComputerslink();
		wUtil.mousehover(driver, computerdrpdwn);
		wUtil.getPhoto(driver);
		hp.getClickondropdownofcomputerlink().click();
		
		
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Desktops","computer page is not loaded");
		test.log(Status.PASS, "computer page is loaded");
		
		
	}
}
