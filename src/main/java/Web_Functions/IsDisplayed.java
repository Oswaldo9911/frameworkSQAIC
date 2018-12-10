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
public class IsDisplayed {

    public boolean IsDisplayedId(String IdValueElemento) throws Exception {
        return driver.findElement(By.id(IdValueElemento)).isDisplayed();
    }

    public boolean IsDisplayeName(String IdValueElemento) throws Exception {
        return driver.findElement(By.name(IdValueElemento)).isDisplayed();
    }

    public boolean IsDisplayeClassName(String IdValueElemento) throws Exception {
        return driver.findElement(By.className(IdValueElemento)).isDisplayed();
    }

    public boolean IsDisplayeXpath(String IdValueElemento) throws Exception {
        return driver.findElement(By.xpath(IdValueElemento)).isDisplayed();
    }

    public boolean IsDisplayeLinkText(String IdValueElemento) throws Exception {
        return driver.findElement(By.linkText(IdValueElemento)).isDisplayed();
    }

    public boolean IsDisplayePartianLinkText(String IdValueElemento) throws Exception {
        return driver.findElement(By.partialLinkText(IdValueElemento)).isDisplayed();
    }

    public boolean IsDisplayeTagName(String IdValueElemento) throws Exception {
        return driver.findElement(By.tagName(IdValueElemento)).isDisplayed();
    }

    public boolean IsDisplayeCssSelector(String IdValueElemento) throws Exception {
        return driver.findElement(By.cssSelector(IdValueElemento)).isDisplayed();
    }
}
