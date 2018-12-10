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
public class Submit {

    public void SubmitId(String IdValueElemento) throws Exception {
        driver.findElement(By.id(IdValueElemento)).submit();
    }

    public void SubmitName(String IdValueElemento) throws Exception {
        driver.findElement(By.name(IdValueElemento)).submit();
    }

    public void SubmitClassName(String IdValueElemento) throws Exception {
        driver.findElement(By.className(IdValueElemento)).submit();
    }

    public void SubmitXpath(String IdValueElemento) throws Exception {
        driver.findElement(By.xpath(IdValueElemento)).submit();
    }

    public void SubmitLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.linkText(IdValueElemento)).submit();
    }

    public void SubmitPartianLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.partialLinkText(IdValueElemento)).submit();
    }

    public void SubmitTagName(String IdValueElemento) throws Exception {
        driver.findElement(By.tagName(IdValueElemento)).submit();
    }

    public void SubmitCssSelector(String IdValueElemento) throws Exception {
        driver.findElement(By.cssSelector(IdValueElemento)).submit();
    }
}
