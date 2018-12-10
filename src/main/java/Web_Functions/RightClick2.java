/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.api.robot.Key;

/**
 *
 * @author SQA
 */
public class RightClick2 {

    public void RightClick(String ParametroString1) throws Exception {
        WebElement elemento = driver.findElement(By.className(ParametroString1));
        Actions acccion = new Actions(driver);
        acccion.keyDown(elemento, Key.ENTER);
        acccion.keyUp(elemento, Key.ENTER);
//        new Actions(driver).keyDown(Key.ENTER).perform();
//        new Actions(driver).keyUp(ParametroString1).perform();

    }
}
