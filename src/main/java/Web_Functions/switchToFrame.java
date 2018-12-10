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
public class switchToFrame {

    public void switchToFrameId(String IdValueElemento) throws Exception {
        driver.switchTo().frame(driver.findElement(By.id(IdValueElemento)));
    }

    public void switchToFrameName(String IdValueElemento) throws Exception {
        driver.switchTo().frame(driver.findElement(By.name(IdValueElemento)));
    }

    public void switchToFrameClassName(String IdValueElemento) throws Exception {
        driver.switchTo().frame(driver.findElement(By.className(IdValueElemento)));
    }

    public void switchToFrameXpath(String IdValueElemento) throws Exception {
        driver.switchTo().frame(driver.findElement(By.xpath(IdValueElemento)));
    }

    public void switchToFrameLinkText(String IdValueElemento) throws Exception {
        driver.switchTo().frame(driver.findElement(By.linkText(IdValueElemento)));
    }

    public void switchToFramePartianLinkText(String IdValueElemento) throws Exception {
        driver.switchTo().frame(driver.findElement(By.partialLinkText(IdValueElemento)));
    }

    public void switchToFrameTagName(String IdValueElemento) throws Exception {
        driver.switchTo().frame(driver.findElement(By.tagName(IdValueElemento)));
    }

    public void switchToFrameCssSelector(String IdValueElemento) throws Exception {
        driver.switchTo().frame(driver.findElement(By.cssSelector(IdValueElemento)));
    }
}
