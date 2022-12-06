package Review;

import org.testng.annotations.DataProvider;

public class AnotherDataProviderDemo {
    @DataProvider(name = "credentials")
    public Object[][] data() {
        Object[][] loginData = {
                {"admin", "1234"},
                {"ABCD", "Hum@nhrm123"},
                {"Admin", " "},
                {"", "5897"},
        };
        return loginData;
    }
}
