/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author SQA
 */
public class AbrirNavegador {

    public void AbrirNavegador(String Navegador, String Url) throws Exception {
        switch (Navegador) {
            case "Chrome":
                System.setProperty("webDriver.chrome.Driver", System.getProperty("user.dir") + "\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(Url); // URL utilizada        
                break;

            case "Mozilla":
                System.setProperty("webDriver.gecko.Driver", System.getProperty("user.dir") + "\\geckoDriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get(Url); // URL utilizada
                break;

            case "Iexplorer":
                DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                capabilities.setCapability("InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION", true);
                capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                capabilities.setCapability("ignoreZoomSetting", true);
                capabilities.setCapability("ignoreProtectedModeSettings", true);
                capabilities.setCapability("initialBrowserUrl", Url);
                driver = new InternetExplorerDriver(capabilities);
                driver.getWindowHandle();
                driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                break;

        }
        Actions action = new Actions(driver);
    }
    
    
}
