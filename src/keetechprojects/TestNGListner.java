package keetechprojects;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("testcasaes finshed and details are"+result.getName());
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("testcasaes start and details are"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("testcasaes failed and details are"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcasaes ontestfailed and details are"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("testcasaes ontestskipped and details are"+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("testcasaes onstart and details are"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("testcasaes success and details are"+result.getName());
	}

}
