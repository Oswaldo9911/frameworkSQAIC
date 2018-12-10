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
public class Clear {

    public void ClearId(String IdValueElemento) throws Exception {
        driver.findElement(By.id(IdValueElemento)).clear();

    }

    public void ClearName(String IdValueElemento) throws Exception {
        driver.findElement(By.name(IdValueElemento)).clear();

    }

    public void ClearClassName(String IdValueElemento) throws Exception {
        driver.findElement(By.className(IdValueElemento)).clear();

    }

    public void ClearXpath(String IdValueElemento) throws Exception {
        driver.findElement(By.xpath(IdValueElemento)).clear();

    }

    public void ClearLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.linkText(IdValueElemento)).clear();

    }

    public void ClearPartianLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.partialLinkText(IdValueElemento)).clear();

    }

    public void ClearTagName(String IdValueElemento) throws Exception {
        driver.findElement(By.tagName(IdValueElemento)).clear();
    }

    public void ClearCssSelector(String IdValueElemento) throws Exception {
        driver.findElement(By.cssSelector(IdValueElemento)).clear();
    }
}
