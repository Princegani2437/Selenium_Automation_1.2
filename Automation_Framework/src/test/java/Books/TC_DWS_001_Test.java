package Books;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import generic_utility.Baseclass;
import generic_utility.Listener_utility;
import object_repository.Homepage;
@Listeners(Listener_utility.class)
public class TC_DWS_001_Test extends Baseclass {

	@Test
	
	public void clickonBooks() {
		
		
		Homepage hp = new Homepage(driver);
		hp.getBookslinks().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books","books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
		driver.close();
	}
	
}
