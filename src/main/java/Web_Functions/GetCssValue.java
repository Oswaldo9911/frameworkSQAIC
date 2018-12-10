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
public class GetCssValue {

    public void GetCssValueId(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.id(IdValueElemento)).getCssValue(ParametroString1);
    }

    public void GetCssValueeName(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.name(IdValueElemento)).getCssValue(ParametroString1);
    }

    public void GetCssValueeClassName(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.className(IdValueElemento)).getCssValue(ParametroString1);
    }

    public void GetCssValueeXpath(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.xpath(IdValueElemento)).getCssValue(ParametroString1);
    }

    public void GetCssValueeLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.linkText(IdValueElemento)).getCssValue(ParametroString1);
    }

    public void GetCssValueePartianLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.partialLinkText(IdValueElemento)).getCssValue(ParametroString1);
    }

    public void GetCssValueeTagName(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.tagName(IdValueElemento)).getCssValue(ParametroString1);
    }

    public void GetCssValueeCssSelector(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.cssSelector(IdValueElemento)).getCssValue(ParametroString1);
    }
}
