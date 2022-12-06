package Review;

import org.testng.annotations.*;

public class AnnotationTestNG {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This is after class");
    }
    @Test
    public void actualTestCase(){
        System.out.println("This is my actual test case");
    }
    @Test
    public void secondTestCase(){
        System.out.println("This is my second test case");
    }
}
