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
public class IsSelected {

    public boolean IsSelectedId(String IdValueElemento) throws Exception {
        return driver.findElement(By.id(IdValueElemento)).isSelected();
    }

    public boolean IsSelectedName(String IdValueElemento) throws Exception {
        return driver.findElement(By.name(IdValueElemento)).isSelected();
    }

    public boolean IsSelectedClassName(String IdValueElemento) throws Exception {
        return driver.findElement(By.className(IdValueElemento)).isSelected();
    }

    public boolean IsSelectedXpath(String IdValueElemento) throws Exception {
        return driver.findElement(By.xpath(IdValueElemento)).isSelected();
    }

    public boolean IsSelectedLinkText(String IdValueElemento) throws Exception {
        return driver.findElement(By.linkText(IdValueElemento)).isSelected();
    }

    public boolean IsSelectedPartianLinkText(String IdValueElemento) throws Exception {
        return driver.findElement(By.partialLinkText(IdValueElemento)).isSelected();
    }

    public boolean IsSelectedTagName(String IdValueElemento) throws Exception {
        return driver.findElement(By.tagName(IdValueElemento)).isSelected();
    }

    public boolean IsSelectedCssSelector(String IdValueElemento) throws Exception {
        return driver.findElement(By.cssSelector(IdValueElemento)).isSelected();
    }
}
