/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import java.io.IOException;

/**
 *
 * @author SQA
 */
public class borrarCookies {

    public void borrarCookies(String parametro) throws IOException {

        if (parametro.equalsIgnoreCase("All")) {
            driver.manage().deleteAllCookies();
            System.out.println("Se han eliminado todas las cookies.");
        } else {
            driver.manage().deleteCookieNamed(parametro);
            System.out.println("Se ha eliminado la cookie ${params." + parametro + "}.");
        }

    }
}
