/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author SQA
 */
public class RightClickWindow {

    public void RightClickWindow() throws Exception {
        new Actions(driver).contextClick().perform();
    }
}
