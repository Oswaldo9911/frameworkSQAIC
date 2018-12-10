/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 *
 * @author SQA
 */
public class ClickJS {

    public void ClickJSId(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.id(IdValueElemento));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void ClickJSName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.name(IdValueElemento));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void ClickJSClassName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.className(IdValueElemento));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void ClickJSXpath(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.xpath(IdValueElemento));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void ClickJSLinkText(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.linkText(IdValueElemento));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void ClickJSPartianLinkText(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.partialLinkText(IdValueElemento));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void ClickJSTagName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.tagName(IdValueElemento));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void ClickJSCssSelector(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.cssSelector(IdValueElemento));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}
