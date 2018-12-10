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
public class getLocation {

    public void getLocationId(String IdValueElemento) throws Exception {
        driver.findElement(By.id(IdValueElemento)).getLocation();
    }

    public void getLocationName(String IdValueElemento) throws Exception {
        driver.findElement(By.name(IdValueElemento)).getLocation();
    }

    public void getLocationClassName(String IdValueElemento) throws Exception {
        driver.findElement(By.className(IdValueElemento)).getLocation();
    }

    public void getLocationXpath(String IdValueElemento) throws Exception {
        driver.findElement(By.xpath(IdValueElemento)).getLocation();
    }

    public void getLocationLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.linkText(IdValueElemento)).getLocation();
    }

    public void getLocationPartianLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.partialLinkText(IdValueElemento)).getLocation();
    }

    public void getLocationTagName(String IdValueElemento) throws Exception {
        driver.findElement(By.tagName(IdValueElemento)).getLocation();
    }

    public void getLocationCssSelector(String IdValueElemento) throws Exception {
        driver.findElement(By.cssSelector(IdValueElemento)).getLocation();
    }

}
