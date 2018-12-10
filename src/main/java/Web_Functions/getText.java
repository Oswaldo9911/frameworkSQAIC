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
public class getText {

    public void getTextId(String IdValueElemento) throws Exception {
        driver.findElement(By.id(IdValueElemento)).getText();
    }

    public void getTextName(String IdValueElemento) throws Exception {
        driver.findElement(By.name(IdValueElemento)).getText();
    }

    public void getTextClassName(String IdValueElemento) throws Exception {
        driver.findElement(By.className(IdValueElemento)).getText();
    }

    public void getTextXpath(String IdValueElemento) throws Exception {
        driver.findElement(By.xpath(IdValueElemento)).getText();
    }

    public void getTextLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.linkText(IdValueElemento)).getText();
    }

    public void getTextPartianLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.partialLinkText(IdValueElemento)).getText();
    }

    public void getTextTagName(String IdValueElemento) throws Exception {
        driver.findElement(By.tagName(IdValueElemento)).getText();
    }

    public void getTextCssSelector(String IdValueElemento) throws Exception {
        driver.findElement(By.cssSelector(IdValueElemento)).getText();
    }
}
