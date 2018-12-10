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
public class MoveToElementCoord {

    public void MoveToElementCoordId(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        Elemento = driver.findElement(By.id(IdValueElemento));
        new Actions(driver).moveToElement(Elemento, ParametroInt1, ParametroInt2).build().perform();

    }

    public void MoveToElementCoordName(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        Elemento = driver.findElement(By.name(IdValueElemento));
        new Actions(driver).moveToElement(Elemento, ParametroInt1, ParametroInt2).build().perform();

    }

    public void MoveToElementCoordClassName(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        Elemento = driver.findElement(By.className(IdValueElemento));
        new Actions(driver).moveToElement(Elemento, ParametroInt1, ParametroInt2).build().perform();
    }

    public void MoveToElementCoordXpath(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        Elemento = driver.findElement(By.xpath(IdValueElemento));
        new Actions(driver).moveToElement(Elemento, ParametroInt1, ParametroInt2).build().perform();
    }

    public void MoveToElementCoordLinkText(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        Elemento = driver.findElement(By.linkText(IdValueElemento));
        new Actions(driver).moveToElement(Elemento, ParametroInt1, ParametroInt2).build().perform();
    }

    public void MoveToElementCoordPartianLinkText(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        Elemento = driver.findElement(By.partialLinkText(IdValueElemento));
        new Actions(driver).moveToElement(Elemento, ParametroInt1, ParametroInt2).build().perform();
    }

    public void MoveToElementCoordTagName(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        Elemento = driver.findElement(By.tagName(IdValueElemento));
        new Actions(driver).moveToElement(Elemento, ParametroInt1, ParametroInt2).build().perform();
    }

    public void MoveToElementCoordCssSelector(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        Elemento = driver.findElement(By.cssSelector(IdValueElemento));
        new Actions(driver).moveToElement(Elemento, ParametroInt1, ParametroInt2).build().perform();
    }

}
