package Review;

import org.testng.annotations.Test;

public class AnnotationExample {
    @Test
    public void myFirstTestCase(){
        System.out.println("This is my first test case");
    }
    @Test
    public void anotherTestcase(){
        System.out.println("This is my second test case and will execute first bc it starts with a");
    }

}
