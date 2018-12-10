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
public class RightClick {

    public void RightClickId(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.id(IdValueElemento));
        new Actions(driver).contextClick(Elemento).perform();

    }

    public void RightClickName(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.name(IdValueElemento));
        new Actions(driver).contextClick(Elemento).perform();
    }

    public void RightClickClassName(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.className(IdValueElemento));
        new Actions(driver).contextClick(Elemento).perform();
    }

    public void RightClickXpath(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.xpath(IdValueElemento));
        new Actions(driver).contextClick(Elemento).perform();
    }

    public void RightClickLinkText(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.linkText(IdValueElemento));
        new Actions(driver).contextClick(Elemento).perform();
    }

    public void RightClickPartianLinkText(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.partialLinkText(IdValueElemento));
        new Actions(driver).contextClick(Elemento).perform();
    }

    public void RightClickTagName(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.tagName(IdValueElemento));
        new Actions(driver).contextClick(Elemento).perform();
    }

    public void RightClickCssSelector(String IdValueElemento) throws Exception {
        Elemento = driver.findElement(By.cssSelector(IdValueElemento));
        new Actions(driver).contextClick(Elemento).perform();
    }
}
