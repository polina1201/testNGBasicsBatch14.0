package Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestAnnotation {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("I am before suit *_*");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("I am after suit *_*");
    }
    @BeforeTest
    public void BT(){
        System.out.println("I am Before Test---------------");
    }


    @AfterTest
    public void AT(){
        System.out.println("I am After Test----------------");
    }
}
