/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;

/**
 *
 * @author SQA
 */
public class executeJs {

    public void executeJs(String parametro) throws IOException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(parametro);
    }
}
