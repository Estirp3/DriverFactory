package Browser;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    public static WebDriver getBrowser(String pantalla, String navegador) throws Throwable {
        String desiredBrowserName =  System.getProperty("browser" , navegador);
        WebDriver desiredBrowser = null;
        switch (desiredBrowserName){
            case "chrome":
                desiredBrowser = ChromeBrowser.buildChromeBrowser(pantalla);
            case "FireFox":
                String[] parts = pantalla.split(",");
                String height = parts[0];
                String width = parts[1];
                int valor = Integer.parseInt(height);
                int valor2 = Integer.parseInt(width);
                desiredBrowser = FireFoxBrowser.buildFireFoxDriver(valor,valor2);

                break;
            default:
                // TODO: 9/26/19 pgtoopx
                break;
        }
        return desiredBrowser;
    }
}

