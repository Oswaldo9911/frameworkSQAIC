/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author SQA
 */
public class ClickMouse {

    public void ClickMouseId(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.id(IdValueElemento));
        Actions action = new Actions(driver);
        action.moveToElement(element).click(element).build().perform();
    }

    public void ClickMouseName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.name(IdValueElemento));
        Actions action = new Actions(driver);
        action.moveToElement(element).click(element).build().perform();
    }

    public void ClickMouseClassName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.className(IdValueElemento));
        Actions action = new Actions(driver);
        action.moveToElement(element).click(element).build().perform();
    }

    public void ClickMouseXpath(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.xpath(IdValueElemento));
        Actions action = new Actions(driver);
        action.moveToElement(element).click(element).build().perform();
    }

    public void ClickMouseLinkText(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.linkText(IdValueElemento));
        Actions action = new Actions(driver);
        action.moveToElement(element).click(element).build().perform();
    }

    public void ClickMousePartianLinkText(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.partialLinkText(IdValueElemento));
        Actions action = new Actions(driver);
        action.moveToElement(element).click(element).build().perform();
    }

    public void ClickMouseTagName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.tagName(IdValueElemento));
        Actions action = new Actions(driver);
        action.moveToElement(element).click(element).build().perform();
    }

    public void ClickMouseCssSelector(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.cssSelector(IdValueElemento));
        Actions action = new Actions(driver);
        action.moveToElement(element).click(element).build().perform();
    }
}
