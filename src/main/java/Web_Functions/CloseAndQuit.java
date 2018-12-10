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
public class CloseAndQuit {

    public void Close() throws Exception {
        driver.close();
    }

    public void QuitDriver() throws IOException {
        // cierra las sesiones de Chrome driver
        String command = "TASKKILL /F /IM chromedriver.exe";
        Process child = Runtime.getRuntime().exec(command);
        child = Runtime.getRuntime().exec(command);
        //Driver.quit();       
    }

}
