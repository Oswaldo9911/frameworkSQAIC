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
public class GetTagName {

    public void GetTagNameId(String IdValueElemento) throws Exception {
        driver.findElement(By.id(IdValueElemento)).getTagName();
    }

    public void GetTagNameName(String IdValueElemento) throws Exception {
        driver.findElement(By.name(IdValueElemento)).getTagName();
    }

    public void GetTagNameClassName(String IdValueElemento) throws Exception {
        driver.findElement(By.className(IdValueElemento)).getTagName();
    }

    public void GetTagNameXpath(String IdValueElemento) throws Exception {
        driver.findElement(By.xpath(IdValueElemento)).getTagName();
    }

    public void GetTagNameLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.linkText(IdValueElemento)).getTagName();
    }

    public void GetTagNamePartianLinkText(String IdValueElemento) throws Exception {
        driver.findElement(By.partialLinkText(IdValueElemento)).getTagName();
    }

    public void GetTagNameTagName(String IdValueElemento) throws Exception {
        driver.findElement(By.tagName(IdValueElemento)).getTagName();
    }

    public void GetTagNameCssSelector(String IdValueElemento) throws Exception {
        driver.findElement(By.cssSelector(IdValueElemento)).getTagName();
    }
}
