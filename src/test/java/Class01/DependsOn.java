package Class01;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void Login(){
        System.out.println(4/0); //must be a String in order to pass; i.e. ("Sample")

    }
    @Test (dependsOnMethods = {"Login"}) //this method will only execute if "Login" passes
    public void DashBoardVerification(){
        System.out.println("After login, I am verifying the dashboard page");
    }
}
