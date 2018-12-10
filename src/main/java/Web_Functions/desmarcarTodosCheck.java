/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author SQA
 */
public class desmarcarTodosCheck {

    public void desmarcarTodosCheckId(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.id(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void desmarcarTodosCheckName(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.name(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void desmarcarTodosCheckClassName(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.className(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void desmarcarTodosCheckXpath(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.xpath(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void desmarcarTodosCheckLinkText(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.linkText(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void desmarcarTodosCheckPartianLinkText(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.partialLinkText(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void desmarcarTodosCheckTagName(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.tagName(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void desmarcarTodosCheckCssSelector(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.cssSelector(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (element.isSelected()) {
                    element.click();
                }
            }
        }
    }
}
