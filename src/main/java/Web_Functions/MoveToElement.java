/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.Elemento;
import static Web_Functions.GetDriver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author SQA
 */
public class MoveToElement {

    public void MoveToElementId(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.id(IdValueElemento));
        new Actions(driver).moveToElement(Elemento).build().perform();

    }

    public void MoveToElementName(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.name(IdValueElemento));
        new Actions(driver).moveToElement(Elemento).build().perform();

    }

    public void MoveToElementClassName(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.className(IdValueElemento));
        new Actions(driver).moveToElement(Elemento).build().perform();
    }

    public void MoveToElementXpath(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.xpath(IdValueElemento));
        new Actions(driver).moveToElement(Elemento).build().perform();
    }

    public void MoveToElementLinkText(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.linkText(IdValueElemento));
        new Actions(driver).moveToElement(Elemento).build().perform();
    }

    public void MoveToElementPartianLinkText(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.partialLinkText(IdValueElemento));
        new Actions(driver).moveToElement(Elemento).build().perform();
    }

    public void MoveToElementTagName(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.tagName(IdValueElemento));
        new Actions(driver).moveToElement(Elemento).build().perform();
    }

    public void MoveToElementCssSelector(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.cssSelector(IdValueElemento));
        new Actions(driver).moveToElement(Elemento).build().perform();
    }
}
