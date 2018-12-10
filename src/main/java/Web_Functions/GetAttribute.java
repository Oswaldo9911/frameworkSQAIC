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
public class GetAttribute {

    public void GetAttributeId(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.id(IdValueElemento)).getAttribute(ParametroString1);
    }

    public void GetAttributeName(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.name(IdValueElemento)).getAttribute(ParametroString1);
    }

    public void GetAttributeClassName(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.className(IdValueElemento)).getAttribute(ParametroString1);
    }

    public void GetAttributeXpath(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.xpath(IdValueElemento)).getAttribute(ParametroString1);

    }

    public void GetAttributeLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.linkText(IdValueElemento)).getAttribute(ParametroString1);
    }

    public void GetAttributePartianLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.partialLinkText(IdValueElemento)).getAttribute(ParametroString1);
    }

    public void GetAttributeTagName(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.tagName(IdValueElemento)).getAttribute(ParametroString1);
    }

    public void GetAttributeCssSelector(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.cssSelector(IdValueElemento)).getAttribute(ParametroString1);
    }
}
