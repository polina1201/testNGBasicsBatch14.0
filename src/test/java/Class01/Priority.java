package Class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 3, groups = "regression")
    public void Atest() {
        System.out.println("I am A test");
    }

    @Test(priority = 1)
    public void Btest() {
        System.out.println("I am B test");
    }

    @Test(priority = 2)
    public void Ctest() {
        System.out.println("I am C test");
    }

    @Test
    public void Dtest() { //no priority, which makes it 0 (zero) by default
        System.out.println("I am D test");
    }

    @Test //if no priority or with the similar name, it goes automatically
    public void ABtest() {
        System.out.println("I am AB test");
    }
}
