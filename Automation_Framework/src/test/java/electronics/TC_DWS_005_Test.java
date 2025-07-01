package electronics;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic_utility.Baseclass;
import generic_utility.Listener_utility;
import object_repository.Homepage;

@Listeners(Listener_utility.class)
public class TC_DWS_005_Test extends Baseclass{

	@Test
	
	public void clickonCellphones() {
		Homepage hp = new Homepage(driver);
		WebElement elemhover = hp.getElectronicslink();
		wUtil.mousehover(driver, elemhover);
		
		
	}
}
