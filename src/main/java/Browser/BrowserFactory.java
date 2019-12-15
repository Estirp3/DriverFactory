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
                String part1 = parts[0];
                String part2 = parts[1];
                int valor = Integer.parseInt(part1);
                int valor2 = Integer.parseInt(part2);
                desiredBrowser = FireFoxBrowser.buildFireFoxDriver(valor,valor2);

                break;
            default:
                // TODO: 9/26/19 pgtoopx
                break;
        }
        return desiredBrowser;
    }
}

