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
public class ContainsElements {

    public boolean ContainsElementsId(String IdValueElemento, Object Objeto) throws Exception {
        return driver.findElements(By.id(IdValueElemento)).contains(Objeto);
    }

    public boolean ContainsElementsName(String IdValueElemento, Object Objeto) throws Exception {
        return driver.findElements(By.name(IdValueElemento)).contains(Objeto);
    }

    public boolean ContainsElementsClassName(String IdValueElemento, Object Objeto) throws Exception {
        return driver.findElements(By.className(IdValueElemento)).contains(Objeto);
    }

    public boolean ContainsElementsXpath(String IdValueElemento, Object Objeto) throws Exception {
        return driver.findElements(By.xpath(IdValueElemento)).contains(Objeto);
    }

    public boolean ContainsElementsLinkText(String IdValueElemento, Object Objeto) throws Exception {
        return driver.findElements(By.linkText(IdValueElemento)).contains(Objeto);
    }

    public boolean ContainsElementsPartianLinkText(String IdValueElemento, Object Objeto) throws Exception {
        return driver.findElements(By.partialLinkText(IdValueElemento)).contains(Objeto);
    }

    public boolean ContainsElementsTagName(String IdValueElemento, Object Objeto) throws Exception {
        return driver.findElements(By.tagName(IdValueElemento)).contains(Objeto);
    }

    public boolean ContainsElementsCssSelector(String IdValueElemento, Object Objeto) throws Exception {
        return driver.findElements(By.cssSelector(IdValueElemento)).contains(Objeto);
    }
}
