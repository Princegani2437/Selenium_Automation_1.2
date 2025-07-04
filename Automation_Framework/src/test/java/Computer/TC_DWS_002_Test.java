package Computer;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import generic_utility.Baseclass;
import generic_utility.Listener_utility;
import object_repository.Homepage;
@Listeners(Listener_utility.class)
public class TC_DWS_002_Test extends Baseclass {

	@Test
	public void clickonComputer() {
		
		
		Homepage hp = new Homepage(driver);
		hp.getComputerslink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computerss","Computer page is not loaded");
		test.log(Status.PASS, "Computer page is loaded");
		
		}
	
}
