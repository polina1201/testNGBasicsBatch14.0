package Class04;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class implementationOfListeners implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("The test case has Successfully passed"+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("The test case has Succesffully failed"+result.getName());
    }
}
