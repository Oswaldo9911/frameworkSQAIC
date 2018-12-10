/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author SQA
 */
public class DragAndDrop {

    public void DragAndDrop(WebElement Elemento1, WebElement Elemento2) throws Exception {
        WebElement element = Elemento1;
        WebElement target = Elemento2;
        (new Actions(driver)).dragAndDrop(element, target).perform();
    }
}
