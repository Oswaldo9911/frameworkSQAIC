/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;

/**
 *
 * @author SQA
 */
public class SwitchToAlertText {

    public void SwitchToAlertText(String ParametroString1) throws Exception {
        driver.switchTo().alert();
        driver.switchTo().alert().sendKeys(ParametroString1);
    }
}
