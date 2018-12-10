package tests;

import Web_Functions.GetDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.ActionGui;
import pages.LeerExcel;

/**
 *
 * @author Oswaldo Buitrago SQA S.A - fabio.betancourt@sqasa.com
 */
public class BaseTest {

   
    public static ActionGui as = new ActionGui();
    public static GetDriver driver;

    @BeforeClass
    public void setup() {
        //Crea un controlador de Chrome. Todas las clases de prueba usan esto.
        // Instancia de Data Driven
        LeerExcel leer = new LeerExcel(System.getProperty("user.dir") + "\\excel\\DataDriven.xlsx");
        String valor = leer.getCellData("ColsubsidioOpera", "Numero De Habitacion", 2);
        as = new ActionGui();
        System.out.println("Prueba Excel: " + valor);
        driver = new GetDriver();
    }

    @AfterClass
    public void teardown() {
        driver.getDriver().quit();
    }

    public static GetDriver getDriver() {
        return driver;
    }

    public static void setDriver(GetDriver driver) {
        BaseTest.driver = driver;
    }
    
    



}
