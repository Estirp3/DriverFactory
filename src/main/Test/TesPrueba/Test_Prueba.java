package TesPrueba;

import Browser.BrowserFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Test_Prueba {
    WebDriver driver;

    @BeforeEach
    public void pruebaSet() throws Throwable {
        this.driver = BrowserFactory.getBrowser("1028,100", "IE");
    }

    @Test
    public void Test_01(){}
}
