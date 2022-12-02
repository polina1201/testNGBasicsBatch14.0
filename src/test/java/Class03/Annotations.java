package Class03;

import org.testng.annotations.*;

public class Annotations {
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am Before Class");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("I am Before Method");
    }
    @Test
    public void AfirstTest(){
        System.out.println("I am A 1 Test");
    }

    @Test
    public void BSecondTest(){
        System.out.println("I am B 2 Test");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("I am After Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am After Class");
    }
}
