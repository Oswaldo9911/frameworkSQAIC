/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author SQA
 */
public class pageLoadTimeout_SECONDS {

    public void pageLoadTimeout_SECONDS(int ParametroInt1) throws Exception {
        driver.manage().timeouts().pageLoadTimeout(ParametroInt1, TimeUnit.SECONDS);
    }
}
