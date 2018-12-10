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
public class marcarTodosCheck {

    public void marcarTodosCheckId(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.id(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (!element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void marcarTodosCheckName(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.name(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (!element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void marcarTodosCheckClassName(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.className(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (!element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void marcarTodosCheckXpath(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.xpath(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (!element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void marcarTodosCheckLinkText(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.linkText(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (!element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void marcarTodosCheckPartianLinkText(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.partialLinkText(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (!element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void marcarTodosCheckTagName(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.tagName(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (!element.isSelected()) {
                    element.click();
                }
            }
        }
    }

    public void marcarTodosCheckCssSelector(String IdValueElemento) throws Exception {
        List<WebElement> elements = driver.findElements(By.cssSelector(IdValueElemento));
        if (elements.size() > 0) {
            for (WebElement element : elements) {
                if (!element.isSelected()) {
                    element.click();
                }
            }
        }
    }
}
