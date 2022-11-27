package Class01;

import org.testng.annotations.Test;

public class EnableDisable {
    @Test(enabled = false) // disables the Test; it will not run
    public void Atest() {
        System.out.println("I am A test");
    }

    @Test
    public void Btest() {
        System.out.println("I am B test");
    }

    @Test (enabled = false)
    public void Ctest() {
        System.out.println("I am C test");
    }
}
