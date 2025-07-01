package generic_utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

public class Listener_utility extends Baseclass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		test=ereport.createTest(result.getName());
		test.log(Status.INFO, "Test execution Statrted");
	}

//	@Override
//	public void onTestSuccess(ITestResult result) {
//		test.log(Status.PASS, "Test script is passed");
//	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test script is failed");
		TakesScreenshot ts = (TakesScreenshot) driver;
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
		try {
			wUtil.getPhoto(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
