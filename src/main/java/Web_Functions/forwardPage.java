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
public class forwardPage {

    public void forwardPage() throws Exception {
        driver.navigate().forward();
    }
}
