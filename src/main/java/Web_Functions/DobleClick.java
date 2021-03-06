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
public class DobleClick {

    public void DobleClickId(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.id(IdValueElemento));
        new Actions(driver).doubleClick(Elemento).perform();

    }

    public void DobleClickName(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.name(IdValueElemento));
        new Actions(driver).doubleClick(Elemento).perform();
    }

    public void DobleClickClassName(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.className(IdValueElemento));
        new Actions(driver).doubleClick(Elemento).perform();
    }

    public void DobleClickXpath(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.xpath(IdValueElemento));
        new Actions(driver).doubleClick(Elemento).perform();
    }

    public void DobleClickLinkText(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.linkText(IdValueElemento));
        new Actions(driver).doubleClick(Elemento).perform();
    }

    public void DobleClickPartianLinkText(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.partialLinkText(IdValueElemento));
        new Actions(driver).doubleClick(Elemento).perform();
    }

    public void DobleClickTagName(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.tagName(IdValueElemento));
        new Actions(driver).doubleClick(Elemento).perform();
    }

    public void DobleClickCssSelector(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.cssSelector(IdValueElemento));
        new Actions(driver).doubleClick(Elemento).perform();
    }
}
