package testPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Hadrian Wall was successfully breached.");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Hadrian Wall could not be breached." + result.getName());
	}
}
