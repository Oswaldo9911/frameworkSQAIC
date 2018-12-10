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
public class desmarcarCheck {

    public void desmarcarCheckId(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.id(IdValueElemento));
        if (element.isSelected() == true) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    }

    public void desmarcarCheckName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.name(IdValueElemento));
        if (element.isSelected() == true) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    }

    public void desmarcarCheckClassName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.className(IdValueElemento));
        if (element.isSelected() == true) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    }

    public void desmarcarCheckXpath(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.xpath(IdValueElemento));
        if (element.isSelected() == true) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    }

    public void desmarcarCheckLinkText(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.linkText(IdValueElemento));
        if (element.isSelected() == true) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    }

    public void desmarcarCheckPartianLinkText(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.partialLinkText(IdValueElemento));
        if (element.isSelected() == true) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    }

    public void desmarcarCheckTagName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.tagName(IdValueElemento));
        if (element.isSelected() == true) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    }

    public void desmarcarCheckCssSelector(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.cssSelector(IdValueElemento));
        if (element.isSelected() == true) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    }
}
