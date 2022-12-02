package Class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("The test case has Passed");
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("The test case has Failed");
    }
}
