package generic_utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_utility {

	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void mousehover (WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void rightClick(WebDriver driver, WebElement element) {
	Actions act = new Actions(driver);
	act.contextClick(element).perform();
}

public void doubleClick(WebDriver driver, WebElement element) {
Actions act = new Actions(driver);
act.doubleClick(element).perform();
}

public void ClickandHold(WebDriver driver, WebElement element) {
Actions act = new Actions(driver);
act.clickAndHold(element).perform();

}

public void scrolling(WebDriver driver, WebElement element) {
Actions act = new Actions(driver);
act.scrollToElement(element).perform();

}
public void dragAndDrop(WebDriver driver, WebElement srcelement, WebElement tarelement) {
Actions act = new Actions(driver);
act.dragAndDrop(srcelement, tarelement).perform();

}

public void selectbyindex(WebElement element, int index) {
	Select sel = new Select(element);
	sel.selectByIndex(index);
}

public void selectbyvalue(WebElement element, String value) {
	Select sel = new Select(element);
	sel.selectByValue(value);
}

public void selectbyvisibletext(WebElement element, String Text) {
	Select sel = new Select(element);
	sel.selectByVisibleText(Text);

}
public void getallOptions(WebElement elemens) {
	Select ref = new Select(elemens);
	List<WebElement> alloptions = ref.getOptions();
	List<String> options = new ArrayList<>();
	for (String opt : options) {
		
	}
}


public void switchTo(WebDriver driver, int index) {
	driver.switchTo().frame(index);
}

public void switchTo(WebDriver driver, String NameorId) {
	driver.switchTo().frame(NameorId);
}
public void switchTo(WebDriver driver, WebElement element) {
	driver.switchTo().frame(element);
	
}

public void switchbacktomainpage(WebDriver driver) {
	driver.switchTo().defaultContent();
}

public Alert switchtoalert(WebDriver driver) {
	return driver.switchTo().alert();
}

public void switchtowindow(WebDriver driver,String expurl) {
	Set<String> allids = driver.getWindowHandles();
	for (String ids : allids) {
		driver.switchTo().window(ids);
		String url = driver.getCurrentUrl();
		if (url.contains(expurl)) {
			break;
		}
	}
}
public void getPhoto(WebDriver driver) throws IOException {
	Java_utility jUtil = new Java_utility();
	TakesScreenshot ts = (TakesScreenshot) driver;
	File tmp=ts.getScreenshotAs(OutputType.FILE);
	File dst = new File("./Screenshot/"+jUtil.getSystemtime()+".png");
	FileHandler.copy(tmp, dst);
}

public void jsscrollby(WebDriver driver, int x, int y) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	
}

public void jsscrollto(WebDriver driver, int x, int y) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo("+x+","+y+")");
	
}
}