/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

/**
 *
 * @author SQA
 */
public class Sendkey {

    public void SendkeyId(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.id(IdValueElemento)).sendKeys(ParametroString1);
    }

    public void SendkeyName(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.name(IdValueElemento)).sendKeys(ParametroString1);
    }

    public void SendKeyClassName(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.className(IdValueElemento)).sendKeys(ParametroString1);
    }

    public void SendKeyXpath(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.xpath(IdValueElemento)).sendKeys(ParametroString1);

    }

    public void SendKeyLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.linkText(IdValueElemento)).sendKeys(ParametroString1);

    }

    public void SendKeyPartianLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.partialLinkText(IdValueElemento)).sendKeys(ParametroString1);

    }

    public void SendKeyTagName(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.tagName(IdValueElemento)).sendKeys(ParametroString1);
    }

    public void SendKeyCssSelector(String IdValueElemento, String ParametroString1) throws Exception {
        driver.findElement(By.cssSelector(IdValueElemento)).sendKeys(ParametroString1);
    }

    public void sendKeyJsId(String identificador, String parametro) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('" + identificador + "').value('" + parametro + "')");
    }
}
