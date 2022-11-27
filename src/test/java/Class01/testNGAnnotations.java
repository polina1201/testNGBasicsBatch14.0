package Class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAnnotations {
    //first test case
    @Test
    public void AfirstTestCase(){
        System.out.println("I am the first test case");
    }
    @Test
    public void BSecondTestCase(){
        System.out.println("I am the second test case");
    }
    @Test
    public void CThirdTestCase(){
        System.out.println("I am the third test case");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am Before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am After method");
    }
}
