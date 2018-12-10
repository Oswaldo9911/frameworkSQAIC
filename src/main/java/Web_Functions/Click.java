/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import org.openqa.selenium.By;

/**
 *
 * @author SQA
 */
public class Click {

    public void ClickId(String IdValueElemento) throws Exception {
        driver.findElement(By.id(IdValueElemento)).click();
    }

    public void ClickName(String IdValueElemento) throws Exception {
        driver.findElement(By.name(IdValueElemento)).click();
    }

    public void ClickClassName(String IdValueElemento) throws Exception {
        driver.findElement(By.className(IdValueElemento)).click();
    }

    public void ClickXpath(String IdValueElemento) throws Exception {
        driver.findElement(By.xpath(IdValueElemento)).click();
    }

    public void ClickLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.linkText(IdValueElemento)).click();
    }

    public void ClickPartianLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.partialLinkText(IdValueElemento)).click();
    }

    public void ClickTagName(String IdValueElemento) throws Exception {
        driver.findElement(By.tagName(IdValueElemento)).click();
    }

    public void ClickCssSelector(String IdValueElemento) throws Exception {
        driver.findElement(By.cssSelector(IdValueElemento)).click();
    }

}
