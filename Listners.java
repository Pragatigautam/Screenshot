package Screenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners extends Utility implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test start");
		System.out.println("Test started: " + result.getName());
		
	}

    public void onTestSuccess(ITestResult result) {
    	System.out.println("on test success");
        System.out.println("Test passed: " + result.getName());
    }
    
    public void onTestFailure(ITestResult result) {
    	System.out.println("on test failure.....");
        System.out.println("Test failed: " + result.getName());
        if (result.getStatus() == ITestResult.FAILURE) {
        	 captureScreenshot(result.getName());
        }
        
    }

}
