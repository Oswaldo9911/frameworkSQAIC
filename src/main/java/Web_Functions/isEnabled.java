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
public class isEnabled {

    public boolean isEnabledId(String IdValueElemento) throws Exception {
        return driver.findElement(By.id(IdValueElemento)).isEnabled();
    }

    public boolean isEnabledName(String IdValueElemento) throws Exception {
        return driver.findElement(By.name(IdValueElemento)).isEnabled();
    }

    public boolean isEnabledClassName(String IdValueElemento) throws Exception {
        return driver.findElement(By.className(IdValueElemento)).isEnabled();
    }

    public boolean isEnabledXpath(String IdValueElemento) throws Exception {
        return driver.findElement(By.xpath(IdValueElemento)).isEnabled();
    }

    public boolean isEnabledLinkText(String IdValueElemento) throws Exception {
        return driver.findElement(By.linkText(IdValueElemento)).isEnabled();
    }

    public boolean isEnabledPartianLinkText(String IdValueElemento) throws Exception {
        return driver.findElement(By.partialLinkText(IdValueElemento)).isEnabled();
    }

    public boolean isEnabledTagName(String IdValueElemento) throws Exception {
        return driver.findElement(By.tagName(IdValueElemento)).isEnabled();
    }

    public boolean isEnabledCssSelector(String IdValueElemento) throws Exception {
        return driver.findElement(By.cssSelector(IdValueElemento)).isEnabled();
    }
}
