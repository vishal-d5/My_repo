package FullSite;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class WebListenerJbk implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println(result.getName()+"Test is ready to execute..");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ "Test is Successfully Completed..");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"Test is failed..");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"Test is skipped..");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName()+"Test Suit is ready to start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+"Test Suit is Finished..");
	}

}
