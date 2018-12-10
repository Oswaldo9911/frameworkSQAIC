/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Class_Web;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import Web_Functions.AbrirNavegador;
import Web_Functions.AbrirPestana;
import Web_Functions.BackPage;
import Web_Functions.Captures;
import Web_Functions.Clear;
import Web_Functions.Click;
import Web_Functions.borrarCookies;
import Web_Functions.ClickJS;
import Web_Functions.ClickMouse;
import Web_Functions.ClickRobot;
import Web_Functions.CloseAndQuit;
import Web_Functions.ContainsElements;
import Web_Functions.DobleClick;
import Web_Functions.DragAndDrop;
import Web_Functions.GetAttribute;
import Web_Functions.GetCssValue;
import Web_Functions.validarModal;
import Web_Functions.Sendkey;
import Web_Functions.GetTagName;
import Web_Functions.IsDisplayed;
import Web_Functions.IsSelected;
import Web_Functions.RightClick;
import Web_Functions.RightClickWindow;
import Web_Functions.Submit;
import Web_Functions.SwitchToAlertAccept;
import Web_Functions.SwitchToAlertDesfaultContent;
import Web_Functions.SwitchToAlertDismiss;
import Web_Functions.SwitchToAlertText;
import Web_Functions.SwitchToNewTab;
import Web_Functions.cerrarAplicacion;
import Web_Functions.desmarcarCheck;
import Web_Functions.desmarcarTodosCheck;
import Web_Functions.finalizarProcesos;
import Web_Functions.forwardPage;
import Web_Functions.marcarTodosCheck;
import Web_Functions.switchToFrame;
import Web_Functions.wait;
import Web_Functions.MoveToElement;
import Web_Functions.MoveToElementCoord;
import Web_Functions.RightClick2;
import Web_Functions.Scroll;
import Web_Functions.SwitchToAlert;
import Web_Functions.SwitchToBackTab;
import Web_Functions.executeJs;
import Web_Functions.f5Page;
import Web_Functions.getLocation;
import Web_Functions.getText;
import Web_Functions.implicitlyWait_SECONDS;
import Web_Functions.isEnabled;
import Web_Functions.pageLoadTimeout_SECONDS;

/**
 *
 * @author Usuario
 */
public class ActionWeb {

    /**
     * ***************************************************************************
     * Método Para realizar la accion Click
     * ***************************************************************************
     * @param Url Direccion URl de busqueda
     * @param Navegador Navegador a ejecutar
     */
    public void AbrirNavegador(String Navegador, String Url) throws Exception {
        try {
            AbrirNavegador navegador = new AbrirNavegador();
            navegador.AbrirNavegador(Navegador, Url);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void validarModal() throws Exception {
        try {
            validarModal modal = new validarModal();
            modal.validarModal();
        } catch (InterruptedException ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion Click con java Script
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void ClickJSId(String IdValueElemento) throws Exception {
        try {
            ClickJS clickJSId = new ClickJS();
            clickJSId.ClickJSId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickJSName(String IdValueElemento) throws Exception {
        try {
            ClickJS clickJSName = new ClickJS();
            clickJSName.ClickJSName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void ClickJSClassName(String IdValueElemento) throws Exception {
        try {
            ClickJS clickJSClassName = new ClickJS();
            clickJSClassName.ClickJSClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickJSXpath(String IdValueElemento) throws Exception {
        try {
            ClickJS clickJSXpath = new ClickJS();
            clickJSXpath.ClickJSXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickJSLinkText(String IdValueElemento) throws Exception {
        try {
            ClickJS clickJSLinkText = new ClickJS();
            clickJSLinkText.ClickJSLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickJSPartianLinkText(String IdValueElemento) throws Exception {
        try {
            ClickJS clickJSPartianLinkText = new ClickJS();
            clickJSPartianLinkText.ClickJSPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickJSTagName(String IdValueElemento) throws Exception {
        try {
            ClickJS clickJSTagName = new ClickJS();
            clickJSTagName.ClickJSTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickJSCssSelector(String IdValueElemento) throws Exception {
        try {
            ClickJS clickCssSelector = new ClickJS();
            clickCssSelector.ClickJSCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion Click integral
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
//    public void ClickIntegralId(String IdValueElemento) throws Exception {
//        WebElement element = driver.findElement(By.id(IdValueElemento));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", element);
//        
//        
//    } 
//    public void ClickIntegralName(String IdValueElemento) throws Exception {
//        WebElement element = driver.findElement(By.name(IdValueElemento));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", element);
//    }  
//
//    public void ClickIntegralClassName(String IdValueElemento) throws Exception {
//        WebElement element = driver.findElement(By.className(IdValueElemento));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", element);
//    }
//
//    public void ClickIntegralXpath(String IdValueElemento) throws Exception {
//        WebElement element = driver.findElement(By.xpath(IdValueElemento));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", element);
//    }
//
//    public void ClickIntegralLinkText(String IdValueElemento) throws Exception {
//        WebElement element = driver.findElement(By.linkText(IdValueElemento));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", element);
//    }
//
//    public void ClickIntegralPartianLinkText(String IdValueElemento) throws Exception {
//        WebElement element = driver.findElement(By.partialLinkText(IdValueElemento));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", element);
//    }
//
//    public void ClickIntegralTagName(String IdValueElemento) throws Exception {
//        WebElement element = driver.findElement(By.tagName(IdValueElemento));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", element);
//    }
//
//    public void ClickIntegralCssSelector(String IdValueElemento) throws Exception {
//        WebElement element = driver.findElement(By.cssSelector(IdValueElemento));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", element);
//    }
    /**
     * ***************************************************************************
     * Métodos Para realizar la accion Click
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void ClickId(String IdValueElemento) throws Exception {
        try {
            Click clickId = new Click();
            clickId.ClickId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickName(String IdValueElemento) throws Exception {
        try {
            Click clickName = new Click();
            clickName.ClickName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickClassName(String IdValueElemento) throws Exception {
        try {
            Click clickClassName = new Click();
            clickClassName.ClickClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickXpath(String IdValueElemento) throws Exception {
        try {
            Click clickXpath = new Click();
            clickXpath.ClickXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickLinkText(String IdValueElemento) throws Exception {
        try {
            Click clickLinkText = new Click();
            clickLinkText.ClickLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickPartianLinkText(String IdValueElemento) throws Exception {
        try {
            Click clickPartianLinkText = new Click();
            clickPartianLinkText.ClickPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickTagName(String IdValueElemento) throws Exception {
        try {
            Click clickTagName = new Click();
            clickTagName.ClickTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickCssSelector(String IdValueElemento) throws Exception {
        try {
            Click clickCssSelector = new Click();
            clickCssSelector.ClickCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion Click
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void ClickMouseId(String IdValueElemento) throws Exception {
        try {
            ClickMouse ClickMouseId = new ClickMouse();
            ClickMouseId.ClickMouseId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickMouseName(String IdValueElemento) throws Exception {
        try {
            ClickMouse ClickMouseName = new ClickMouse();
            ClickMouseName.ClickMouseName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickMouseClassName(String IdValueElemento) throws Exception {
        try {
            ClickMouse ClickMouseClassName = new ClickMouse();
            ClickMouseClassName.ClickMouseClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickMouseXpath(String IdValueElemento) throws Exception {
        try {
            ClickMouse ClickMouseXpath = new ClickMouse();
            ClickMouseXpath.ClickMouseXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickMouseLinkText(String IdValueElemento) throws Exception {
        try {
            ClickMouse ClickMouseLinkText = new ClickMouse();
            ClickMouseLinkText.ClickMouseLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickMousePartianLinkText(String IdValueElemento) throws Exception {
        try {
            ClickMouse ClickMousePartianLinkText = new ClickMouse();
            ClickMousePartianLinkText.ClickMousePartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickMouseTagName(String IdValueElemento) throws Exception {
        try {
            ClickMouse ClickMouseTagName = new ClickMouse();
            ClickMouseTagName.ClickMouseTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickMouseCssSelector(String IdValueElemento) throws Exception {
        try {
            ClickMouse ClickMouseCssSelector = new ClickMouse();
            ClickMouseCssSelector.ClickMouseCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion Click
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void ClickRobotId(String IdValueElemento) throws Exception {
        try {
            ClickRobot ClickRobotId = new ClickRobot();
            ClickRobotId.ClickRobotId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickRobotName(String IdValueElemento) throws Exception {
        try {
            ClickRobot ClickRobotName = new ClickRobot();
            ClickRobotName.ClickRobotName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickRobotClassName(String IdValueElemento) throws Exception {
        try {
            ClickRobot ClickRobotClassName = new ClickRobot();
            ClickRobotClassName.ClickRobotClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickRobotXpath(String IdValueElemento) throws Exception {
        try {
            ClickRobot ClickRobotXpath = new ClickRobot();
            ClickRobotXpath.ClickRobotXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickRobotLinkText(String IdValueElemento) throws Exception {
        try {
            ClickRobot ClickRobotLinkText = new ClickRobot();
            ClickRobotLinkText.ClickRobotLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickRobotPartianLinkText(String IdValueElemento) throws Exception {
        try {
            ClickRobot ClickRobotPartianLinkText = new ClickRobot();
            ClickRobotPartianLinkText.ClickRobotPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickRobotTagName(String IdValueElemento) throws Exception {
        try {
            ClickRobot ClickRobotTagName = new ClickRobot();
            ClickRobotTagName.ClickRobotTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClickRobotCssSelector(String IdValueElemento) throws Exception {
        try {
            ClickRobot ClickRobotCssSelector = new ClickRobot();
            ClickRobotCssSelector.ClickRobotCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion SendKey
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     * @param ParametroString1 Texto a ingresar
     * @throws java.lang.Exception
     */
    public void SendkeyId(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            Sendkey SendkeyId = new Sendkey();
            SendkeyId.SendkeyId(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SendkeyName(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            Sendkey SendkeyName = new Sendkey();
            SendkeyName.SendkeyName(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SendKeyClassName(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            Sendkey SendKeyClassName = new Sendkey();
            SendKeyClassName.SendKeyClassName(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void SendKeyXpath(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            Sendkey SendKeyXpath = new Sendkey();
            SendKeyXpath.SendKeyXpath(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SendKeyLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            Sendkey SendKeyLinkText = new Sendkey();
            SendKeyLinkText.SendKeyLinkText(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SendKeyPartianLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            Sendkey SendKeyPartianLinkText = new Sendkey();
            SendKeyPartianLinkText.SendKeyPartianLinkText(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SendKeyTagName(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            Sendkey SendKeyTagName = new Sendkey();
            SendKeyTagName.SendKeyTagName(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SendKeyCssSelector(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            Sendkey SendKeyCssSelector = new Sendkey();
            SendKeyCssSelector.SendKeyCssSelector(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion Clear
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void ClearId(String IdValueElemento) throws Exception {
        try {
            Clear ClearId = new Clear();
            ClearId.ClearId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClearName(String IdValueElemento) throws Exception {
        try {
            Clear ClearName = new Clear();
            ClearName.ClearName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClearClassName(String IdValueElemento) throws Exception {
        try {
            Clear ClearClassName = new Clear();
            ClearClassName.ClearClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClearXpath(String IdValueElemento) throws Exception {
        try {
            Clear ClearXpath = new Clear();
            ClearXpath.ClearXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClearLinkText(String IdValueElemento) throws Exception {
        try {
            Clear ClearLinkText = new Clear();
            ClearLinkText.ClearLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClearPartianLinkText(String IdValueElemento) throws Exception {
        try {
            Clear ClearPartianLinkText = new Clear();
            ClearPartianLinkText.ClearPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClearTagName(String IdValueElemento) throws Exception {
        try {
            Clear ClearTagName = new Clear();
            ClearTagName.ClearTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void ClearCssSelector(String IdValueElemento) throws Exception {
        try {
            Clear ClearCssSelector = new Clear();
            ClearCssSelector.ClearCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion Submit
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void SubmitId(String IdValueElemento) throws Exception {
        try {
            Submit SubmitId = new Submit();
            SubmitId.SubmitId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SubmitName(String IdValueElemento) throws Exception {
        try {
            Submit SubmitName = new Submit();
            SubmitName.SubmitName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SubmitClassName(String IdValueElemento) throws Exception {
        try {
            Submit SubmitClassName = new Submit();
            SubmitClassName.SubmitClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SubmitXpath(String IdValueElemento) throws Exception {
        try {
            Submit SubmitXpath = new Submit();
            SubmitXpath.SubmitXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SubmitLinkText(String IdValueElemento) throws Exception {
        try {
            Submit SubmitLinkText = new Submit();
            SubmitLinkText.SubmitLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SubmitPartianLinkText(String IdValueElemento) throws Exception {
        try {
            Submit SubmitPartianLinkText = new Submit();
            SubmitPartianLinkText.SubmitPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SubmitTagName(String IdValueElemento) throws Exception {
        try {
            Submit SubmitTagName = new Submit();
            SubmitTagName.SubmitTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SubmitCssSelector(String IdValueElemento) throws Exception {
        try {
            Submit SubmitCssSelector = new Submit();
            SubmitCssSelector.SubmitCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para desmarcar los checkbox
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void desmarcarCheckId(String IdValueElemento) throws Exception {
        try {
            desmarcarCheck desmarcarCheckId = new desmarcarCheck();
            desmarcarCheckId.desmarcarCheckId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarCheckName(String IdValueElemento) throws Exception {
        try {
            desmarcarCheck desmarcarCheckName = new desmarcarCheck();
            desmarcarCheckName.desmarcarCheckName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarCheckClassName(String IdValueElemento) throws Exception {
        try {
            desmarcarCheck desmarcarCheckClassName = new desmarcarCheck();
            desmarcarCheckClassName.desmarcarCheckClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarCheckXpath(String IdValueElemento) throws Exception {
        try {
            desmarcarCheck desmarcarCheckXpath = new desmarcarCheck();
            desmarcarCheckXpath.desmarcarCheckXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarCheckLinkText(String IdValueElemento) throws Exception {
        try {
            desmarcarCheck desmarcarCheckLinkText = new desmarcarCheck();
            desmarcarCheckLinkText.desmarcarCheckLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarCheckPartianLinkText(String IdValueElemento) throws Exception {
        try {
            desmarcarCheck desmarcarCheckPartianLinkText = new desmarcarCheck();
            desmarcarCheckPartianLinkText.desmarcarCheckPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarCheckTagName(String IdValueElemento) throws Exception {
        try {
            desmarcarCheck desmarcarCheckTagName = new desmarcarCheck();
            desmarcarCheckTagName.desmarcarCheckTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarCheckCssSelector(String IdValueElemento) throws Exception {
        try {
            desmarcarCheck desmarcarCheckCssSelector = new desmarcarCheck();
            desmarcarCheckCssSelector.desmarcarCheckCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para desmarcar todos los checkbox
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void desmarcarTodosCheckId(String IdValueElemento) throws Exception {
        try {
            desmarcarTodosCheck desmarcarTodosCheckId = new desmarcarTodosCheck();
            desmarcarTodosCheckId.desmarcarTodosCheckId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarTodosCheckName(String IdValueElemento) throws Exception {
        try {
            desmarcarTodosCheck desmarcarTodosCheckName = new desmarcarTodosCheck();
            desmarcarTodosCheckName.desmarcarTodosCheckName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarTodosCheckClassName(String IdValueElemento) throws Exception {
        try {
            desmarcarTodosCheck desmarcarTodosCheckClassName = new desmarcarTodosCheck();
            desmarcarTodosCheckClassName.desmarcarTodosCheckClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarTodosCheckXpath(String IdValueElemento) throws Exception {
        try {
            desmarcarTodosCheck desmarcarTodosCheckXpath = new desmarcarTodosCheck();
            desmarcarTodosCheckXpath.desmarcarTodosCheckXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarTodosCheckLinkText(String IdValueElemento) throws Exception {
        try {
            desmarcarTodosCheck desmarcarTodosCheckLinkText = new desmarcarTodosCheck();
            desmarcarTodosCheckLinkText.desmarcarTodosCheckLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarTodosCheckPartianLinkText(String IdValueElemento) throws Exception {
        try {
            desmarcarTodosCheck desmarcarTodosCheckPartianLinkText = new desmarcarTodosCheck();
            desmarcarTodosCheckPartianLinkText.desmarcarTodosCheckPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarTodosCheckTagName(String IdValueElemento) throws Exception {
        try {
            desmarcarTodosCheck desmarcarTodosCheckTagName = new desmarcarTodosCheck();
            desmarcarTodosCheckTagName.desmarcarTodosCheckTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void desmarcarTodosCheckCssSelector(String IdValueElemento) throws Exception {
        try {
            desmarcarTodosCheck desmarcarTodosCheckCssSelector = new desmarcarTodosCheck();
            desmarcarTodosCheckCssSelector.desmarcarTodosCheckCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para marcar todos los checkbox
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void marcarTodosCheckId(String IdValueElemento) throws Exception {
        try {
            marcarTodosCheck marcarTodosCheckId = new marcarTodosCheck();
            marcarTodosCheckId.marcarTodosCheckId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void marcarTodosCheckName(String IdValueElemento) throws Exception {
        try {
            marcarTodosCheck marcarTodosCheckName = new marcarTodosCheck();
            marcarTodosCheckName.marcarTodosCheckName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void marcarTodosCheckClassName(String IdValueElemento) throws Exception {
        try {
            marcarTodosCheck marcarTodosCheckClassName = new marcarTodosCheck();
            marcarTodosCheckClassName.marcarTodosCheckClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void marcarTodosCheckXpath(String IdValueElemento) throws Exception {
        try {
            marcarTodosCheck marcarTodosCheckXpath = new marcarTodosCheck();
            marcarTodosCheckXpath.marcarTodosCheckXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void marcarTodosCheckLinkText(String IdValueElemento) throws Exception {
        try {
            marcarTodosCheck marcarTodosCheckLinkText = new marcarTodosCheck();
            marcarTodosCheckLinkText.marcarTodosCheckLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void marcarTodosCheckPartianLinkText(String IdValueElemento) throws Exception {
        try {
            marcarTodosCheck marcarTodosCheckPartianLinkText = new marcarTodosCheck();
            marcarTodosCheckPartianLinkText.marcarTodosCheckPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void marcarTodosCheckTagName(String IdValueElemento) throws Exception {
        try {
            marcarTodosCheck marcarTodosCheckTagName = new marcarTodosCheck();
            marcarTodosCheckTagName.marcarTodosCheckTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void marcarTodosCheckCssSelector(String IdValueElemento) throws Exception {
        try {
            marcarTodosCheck marcarTodosCheckCssSelector = new marcarTodosCheck();
            marcarTodosCheckCssSelector.marcarTodosCheckCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion getAttribute
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     * @param ParametroString1 Valor del parametro a obtener
     */
    public void GetAttributeId(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetAttribute GetAttributeId = new GetAttribute();
            GetAttributeId.GetAttributeId(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetAttributeName(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetAttribute GetAttributeName = new GetAttribute();
            GetAttributeName.GetAttributeName(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetAttributeClassName(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetAttribute GetAttributeClassName = new GetAttribute();
            GetAttributeClassName.GetAttributeClassName(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetAttributeXpath(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetAttribute GetAttributeXpath = new GetAttribute();
            GetAttributeXpath.GetAttributeXpath(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetAttributeLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetAttribute GetAttributeLinkText = new GetAttribute();
            GetAttributeLinkText.GetAttributeLinkText(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetAttributePartianLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetAttribute GetAttributePartianLinkText = new GetAttribute();
            GetAttributePartianLinkText.GetAttributePartianLinkText(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetAttributeTagName(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetAttribute GetAttributeTagName = new GetAttribute();
            GetAttributeTagName.GetAttributeTagName(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetAttributeCssSelector(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetAttribute GetAttributeCssSelector = new GetAttribute();
            GetAttributeCssSelector.GetAttributeCssSelector(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion getCssValue
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     * @param ParametroString1 Valor del parametro a obtener
     */
    public void GetCssValueId(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetCssValue GetCssValueId = new GetCssValue();
            GetCssValueId.GetCssValueId(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetCssValueeName(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetCssValue GetCssValueeName = new GetCssValue();
            GetCssValueeName.GetCssValueeName(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetCssValueeClassName(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetCssValue GetCssValueeClassName = new GetCssValue();
            GetCssValueeClassName.GetCssValueeClassName(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetCssValueeXpath(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetCssValue GetCssValueeXpath = new GetCssValue();
            GetCssValueeXpath.GetCssValueeXpath(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetCssValueeLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetCssValue GetCssValueeLinkText = new GetCssValue();
            GetCssValueeLinkText.GetCssValueeLinkText(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetCssValueePartianLinkText(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetCssValue GetCssValueePartianLinkText = new GetCssValue();
            GetCssValueePartianLinkText.GetCssValueePartianLinkText(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetCssValueeTagName(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetCssValue GetCssValueeTagName = new GetCssValue();
            GetCssValueeTagName.GetCssValueeTagName(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetCssValueeCssSelector(String IdValueElemento, String ParametroString1) throws Exception {
        try {
            GetCssValue GetCssValueeCssSelector = new GetCssValue();
            GetCssValueeCssSelector.GetCssValueeCssSelector(IdValueElemento, ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion IsDisplayed
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     * @return
     */
    public boolean IsDisplayedId(String IdValueElemento) throws Exception {
        try {
            IsDisplayed IsDisplayedId = new IsDisplayed();
            return IsDisplayedId.IsDisplayedId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsDisplayeName(String IdValueElemento) throws Exception {
        try {
            IsDisplayed IsDisplayeName = new IsDisplayed();
            return IsDisplayeName.IsDisplayeName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;

        }
    }

    public boolean IsDisplayeClassName(String IdValueElemento) throws Exception {
        try {
            IsDisplayed IsDisplayeClassName = new IsDisplayed();
            return IsDisplayeClassName.IsDisplayeClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsDisplayeXpath(String IdValueElemento) throws Exception {
        try {
            IsDisplayed IsDisplayeXpath = new IsDisplayed();
            return IsDisplayeXpath.IsDisplayeXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsDisplayeLinkText(String IdValueElemento) throws Exception {
        try {
            IsDisplayed IsDisplayeLinkText = new IsDisplayed();
            return IsDisplayeLinkText.IsDisplayeLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsDisplayePartianLinkText(String IdValueElemento) throws Exception {
        try {
            IsDisplayed IsDisplayePartianLinkText = new IsDisplayed();
            return IsDisplayePartianLinkText.IsDisplayePartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsDisplayeTagName(String IdValueElemento) throws Exception {
        try {
            IsDisplayed IsDisplayeTagName = new IsDisplayed();
            return IsDisplayeTagName.IsDisplayeTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsDisplayeCssSelector(String IdValueElemento) throws Exception {
        try {
            IsDisplayed IsDisplayeCssSelector = new IsDisplayed();
            return IsDisplayeCssSelector.IsDisplayeCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion isSelected
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     * @return
     */
    public boolean IsSelectedId(String IdValueElemento) throws Exception {
        try {
            IsSelected IsSelectedId = new IsSelected();
            return IsSelectedId.IsSelectedId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsSelectedName(String IdValueElemento) throws Exception {
        try {
            IsSelected IsSelectedName = new IsSelected();
            return IsSelectedName.IsSelectedName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsSelectedClassName(String IdValueElemento) throws Exception {
        try {
            IsSelected IsSelectedClassName = new IsSelected();
            return IsSelectedClassName.IsSelectedClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsSelectedXpath(String IdValueElemento) throws Exception {
        try {
            IsSelected IsSelectedXpath = new IsSelected();
            return IsSelectedXpath.IsSelectedXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsSelectedLinkText(String IdValueElemento) throws Exception {
        try {
            IsSelected IsSelectedLinkText = new IsSelected();
            return IsSelectedLinkText.IsSelectedLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsSelectedPartianLinkText(String IdValueElemento) throws Exception {
        try {
            IsSelected IsSelectedPartianLinkText = new IsSelected();
            return IsSelectedPartianLinkText.IsSelectedPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsSelectedTagName(String IdValueElemento) throws Exception {
        try {
            IsSelected IsSelectedTagName = new IsSelected();
            return IsSelectedTagName.IsSelectedTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean IsSelectedCssSelector(String IdValueElemento) throws Exception {
        try {
            IsSelected IsSelectedCssSelector = new IsSelected();
            return IsSelectedCssSelector.IsSelectedCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion isEnabled
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     * @return
     */
    public boolean isEnabledId(String IdValueElemento) throws Exception {
        try {
            isEnabled isEnabledId = new isEnabled();
            return isEnabledId.isEnabledId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isEnabledName(String IdValueElemento) throws Exception {
        try {
            isEnabled isEnabledName = new isEnabled();
            return isEnabledName.isEnabledName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isEnabledClassName(String IdValueElemento) throws Exception {
        try {
            isEnabled isEnabledClassName = new isEnabled();
            return isEnabledClassName.isEnabledClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isEnabledXpath(String IdValueElemento) throws Exception {
        try {
            isEnabled isEnabledXpath = new isEnabled();
            return isEnabledXpath.isEnabledXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isEnabledLinkText(String IdValueElemento) throws Exception {
        try {
            isEnabled isEnabledLinkText = new isEnabled();
            return isEnabledLinkText.isEnabledLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isEnabledPartianLinkText(String IdValueElemento) throws Exception {
        try {
            isEnabled isEnabledPartianLinkText = new isEnabled();
            return isEnabledPartianLinkText.isEnabledPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isEnabledTagName(String IdValueElemento) throws Exception {
        try {
            isEnabled isEnabledTagName = new isEnabled();
            return isEnabledTagName.isEnabledTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean isEnabledCssSelector(String IdValueElemento) throws Exception {
        try {
            isEnabled isEnabledCssSelector = new isEnabled();
            return isEnabledCssSelector.isEnabledCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion isSelected
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void getTextId(String IdValueElemento) throws Exception {
        try {
            getText getTextId = new getText();
            getTextId.getTextId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getTextName(String IdValueElemento) throws Exception {
        try {
            getText getTextName = new getText();
            getTextName.getTextName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getTextClassName(String IdValueElemento) throws Exception {
        try {
            getText getTextClassName = new getText();
            getTextClassName.getTextClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getTextXpath(String IdValueElemento) throws Exception {
        try {
            getText getTextXpath = new getText();
            getTextXpath.getTextXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getTextLinkText(String IdValueElemento) throws Exception {
        try {
            getText getTextLinkText = new getText();
            getTextLinkText.getTextLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getTextPartianLinkText(String IdValueElemento) throws Exception {
        try {
            getText getTextPartianLinkText = new getText();
            getTextPartianLinkText.getTextPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getTextTagName(String IdValueElemento) throws Exception {
        try {
            getText getTextTagName = new getText();
            getTextTagName.getTextTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getTextCssSelector(String IdValueElemento) throws Exception {
        try {
            getText getTextCssSelector = new getText();
            getTextCssSelector.getTextCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion GetTagName
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void GetTagNameId(String IdValueElemento) throws Exception {
        try {
            GetTagName GetTagNameId = new GetTagName();
            GetTagNameId.GetTagNameId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetTagNameName(String IdValueElemento) throws Exception {
        try {
            GetTagName GetTagNameName = new GetTagName();
            GetTagNameName.GetTagNameName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetTagNameClassName(String IdValueElemento) throws Exception {
        try {
            GetTagName GetTagNameClassName = new GetTagName();
            GetTagNameClassName.GetTagNameClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetTagNameXpath(String IdValueElemento) throws Exception {
        try {
            GetTagName GetTagNameXpath = new GetTagName();
            GetTagNameXpath.GetTagNameXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetTagNameLinkText(String IdValueElemento) throws Exception {
        try {
            GetTagName GetTagNameLinkText = new GetTagName();
            GetTagNameLinkText.GetTagNameLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetTagNamePartianLinkText(String IdValueElemento) throws Exception {
        try {
            GetTagName GetTagNamePartianLinkText = new GetTagName();
            GetTagNamePartianLinkText.GetTagNamePartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetTagNameTagName(String IdValueElemento) throws Exception {
        try {
            GetTagName GetTagNameTagName = new GetTagName();
            GetTagNameTagName.GetTagNameTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void GetTagNameCssSelector(String IdValueElemento) throws Exception {
        try {
            GetTagName GetTagNameCssSelector = new GetTagName();
            GetTagNameCssSelector.GetTagNameCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * /**
     * ***************************************************************************
     * Métodos Para realizar la accion ContainsElementsId
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     * @param Objeto elemento que se desea comparar con la lista
     * @return
     */
    public boolean ContainsElementsId(String IdValueElemento, Object Objeto) throws Exception {
        try {
            ContainsElements ContainsElementsId = new ContainsElements();
            return ContainsElementsId.ContainsElementsId(IdValueElemento, Objeto);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean ContainsElementsName(String IdValueElemento, Object Objeto) throws Exception {
        try {
            ContainsElements ContainsElementsName = new ContainsElements();
            return ContainsElementsName.ContainsElementsName(IdValueElemento, Objeto);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean ContainsElementsClassName(String IdValueElemento, Object Objeto) throws Exception {
        try {
            ContainsElements ContainsElementsClassName = new ContainsElements();
            return ContainsElementsClassName.ContainsElementsClassName(IdValueElemento, Objeto);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean ContainsElementsXpath(String IdValueElemento, Object Objeto) throws Exception {
        try {
            ContainsElements ContainsElementsXpath = new ContainsElements();
            return ContainsElementsXpath.ContainsElementsXpath(IdValueElemento, Objeto);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean ContainsElementsLinkText(String IdValueElemento, Object Objeto) throws Exception {
        try {
            ContainsElements ContainsElementsLinkText = new ContainsElements();
            return ContainsElementsLinkText.ContainsElementsLinkText(IdValueElemento, Objeto);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean ContainsElementsPartianLinkText(String IdValueElemento, Object Objeto) throws Exception {
        try {
            ContainsElements ContainsElementsPartianLinkText = new ContainsElements();
            return ContainsElementsPartianLinkText.ContainsElementsPartianLinkText(IdValueElemento, Objeto);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean ContainsElementsTagName(String IdValueElemento, Object Objeto) throws Exception {
        try {
            ContainsElements ContainsElementsTagName = new ContainsElements();
            return ContainsElementsTagName.ContainsElementsTagName(IdValueElemento, Objeto);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean ContainsElementsCssSelector(String IdValueElemento, Object Objeto) throws Exception {
        try {
            ContainsElements ContainsElementsCssSelector = new ContainsElements();
            return ContainsElementsCssSelector.ContainsElementsCssSelector(IdValueElemento, Objeto);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion DobleClickId
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void DobleClickId(String IdValueElemento) throws Exception {
        try {
            DobleClick DobleClickId = new DobleClick();
            DobleClickId.DobleClickId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void DobleClickName(String IdValueElemento) throws Exception {
        try {
            DobleClick DobleClickName = new DobleClick();
            DobleClickName.DobleClickName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void DobleClickClassName(String IdValueElemento) throws Exception {
        try {
            DobleClick DobleClickClassName = new DobleClick();
            DobleClickClassName.DobleClickClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void DobleClickXpath(String IdValueElemento) throws Exception {
        try {
            DobleClick DobleClickXpath = new DobleClick();
            DobleClickXpath.DobleClickXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void DobleClickLinkText(String IdValueElemento) throws Exception {
        try {
            DobleClick DobleClickLinkText = new DobleClick();
            DobleClickLinkText.DobleClickLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void DobleClickPartianLinkText(String IdValueElemento) throws Exception {
        try {
            DobleClick DobleClickPartianLinkText = new DobleClick();
            DobleClickPartianLinkText.DobleClickPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void DobleClickTagName(String IdValueElemento) throws Exception {
        try {
            DobleClick DobleClickTagName = new DobleClick();
            DobleClickTagName.DobleClickTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void DobleClickCssSelector(String IdValueElemento) throws Exception {
        try {
            DobleClick DobleClickCssSelector = new DobleClick();
            DobleClickCssSelector.DobleClickCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion RightClickId
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void RightClickId(String IdValueElemento) throws Exception {
        try {
            RightClick RightClickId = new RightClick();
            RightClickId.RightClickId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void RightClickName(String IdValueElemento) throws Exception {
        try {
            RightClick RightClickName = new RightClick();
            RightClickName.RightClickName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void RightClickClassName(String IdValueElemento) throws Exception {
        try {
            RightClick RightClickClassName = new RightClick();
            RightClickClassName.RightClickClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void RightClickXpath(String IdValueElemento) throws Exception {
        try {
            RightClick RightClickXpath = new RightClick();
            RightClickXpath.RightClickXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void RightClickLinkText(String IdValueElemento) throws Exception {
        try {
            RightClick RightClickLinkText = new RightClick();
            RightClickLinkText.RightClickLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void RightClickPartianLinkText(String IdValueElemento) throws Exception {
        try {
            RightClick RightClickPartianLinkText = new RightClick();
            RightClickPartianLinkText.RightClickPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void RightClickTagName(String IdValueElemento) throws Exception {
        try {
            RightClick RightClickTagName = new RightClick();
            RightClickTagName.RightClickTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void RightClickCssSelector(String IdValueElemento) throws Exception {
        try {
            RightClick RightClickCssSelector = new RightClick();
            RightClickCssSelector.RightClickCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void RightClickWindow() throws Exception {
        try {
            RightClickWindow RightClickWindow = new RightClickWindow();
            RightClickWindow.RightClickWindow();
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion Keypress
     * ***************************************************************************
     * @param ParametroString1 Valor del elemento
     */
    public void RightClick(String ParametroString1) throws Exception {
        try {
            RightClick2 RightClick = new RightClick2();
            RightClick.RightClick(ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion MoveToElement
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void MoveToElementId(String IdValueElemento) throws Exception {
        try {
            MoveToElement MoveToElementId = new MoveToElement();
            MoveToElementId.MoveToElementId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementName(String IdValueElemento) throws Exception {
        try {
            MoveToElement MoveToElementName = new MoveToElement();
            MoveToElementName.MoveToElementName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementClassName(String IdValueElemento) throws Exception {
        try {
            MoveToElement MoveToElementClassName = new MoveToElement();
            MoveToElementClassName.MoveToElementClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementXpath(String IdValueElemento) throws Exception {
        try {
            MoveToElement MoveToElementXpath = new MoveToElement();
            MoveToElementXpath.MoveToElementXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementLinkText(String IdValueElemento) throws Exception {
        try {
            MoveToElement MoveToElementLinkText = new MoveToElement();
            MoveToElementLinkText.MoveToElementLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementPartianLinkText(String IdValueElemento) throws Exception {
        try {
            MoveToElement MoveToElementPartianLinkText = new MoveToElement();
            MoveToElementPartianLinkText.MoveToElementPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementTagName(String IdValueElemento) throws Exception {
        try {
            MoveToElement MoveToElementTagName = new MoveToElement();
            MoveToElementTagName.MoveToElementTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementCssSelector(String IdValueElemento) throws Exception {
        try {
            MoveToElement MoveToElementCssSelector = new MoveToElement();
            MoveToElementCssSelector.MoveToElementCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion MoveToElementCoord
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     * @param ParametroInt1 Valor x
     * @param ParametroInt2 Valor Y
     */
    public void MoveToElementCoordId(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        try {
            MoveToElementCoord MoveToElementCoordId = new MoveToElementCoord();
            MoveToElementCoordId.MoveToElementCoordId(IdValueElemento, ParametroInt1, ParametroInt2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementCoordName(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        try {
            MoveToElementCoord MoveToElementCoordName = new MoveToElementCoord();
            MoveToElementCoordName.MoveToElementCoordName(IdValueElemento, ParametroInt1, ParametroInt2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementCoordClassName(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        try {
            MoveToElementCoord MoveToElementCoordClassName = new MoveToElementCoord();
            MoveToElementCoordClassName.MoveToElementCoordClassName(IdValueElemento, ParametroInt1, ParametroInt2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementCoordXpath(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        try {
            MoveToElementCoord MoveToElementCoordXpath = new MoveToElementCoord();
            MoveToElementCoordXpath.MoveToElementCoordXpath(IdValueElemento, ParametroInt1, ParametroInt2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementCoordLinkText(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        try {
            MoveToElementCoord MoveToElementCoordLinkText = new MoveToElementCoord();
            MoveToElementCoordLinkText.MoveToElementCoordLinkText(IdValueElemento, ParametroInt1, ParametroInt2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementCoordPartianLinkText(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        try {
            MoveToElementCoord MoveToElementCoordPartianLinkText = new MoveToElementCoord();
            MoveToElementCoordPartianLinkText.MoveToElementCoordPartianLinkText(IdValueElemento, ParametroInt1, ParametroInt2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementCoordTagName(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        try {
            MoveToElementCoord MoveToElementCoordTagName = new MoveToElementCoord();
            MoveToElementCoordTagName.MoveToElementCoordTagName(IdValueElemento, ParametroInt1, ParametroInt2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void MoveToElementCoordCssSelector(String IdValueElemento, int ParametroInt1, int ParametroInt2) throws Exception {
        try {
            MoveToElementCoord MoveToElementCoordCssSelector = new MoveToElementCoord();
            MoveToElementCoordCssSelector.MoveToElementCoordCssSelector(IdValueElemento, ParametroInt1, ParametroInt2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion SwitchTo
     * ***************************************************************************
     */
    public void SwitchToAlert() throws Exception {
        try {
            SwitchToAlert SwitchToAlert = new SwitchToAlert();
            SwitchToAlert.SwitchToAlert();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SwitchToAlertText(String ParametroString1) throws Exception {
        try {
            SwitchToAlertText SwitchToAlertText = new SwitchToAlertText();
            SwitchToAlertText.SwitchToAlertText(ParametroString1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SwitchToAlertAccept() throws Exception {
        try {
            SwitchToAlertAccept SwitchToAlertAccept = new SwitchToAlertAccept();
            SwitchToAlertAccept.SwitchToAlertAccept();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SwitchToAlertDismiss() throws Exception {
        try {
            SwitchToAlertDismiss SwitchToAlertDismiss = new SwitchToAlertDismiss();
            SwitchToAlertDismiss.SwitchToAlertDismiss();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SwitchToAlertDesfaultContent() throws Exception {
        try {
            SwitchToAlertDesfaultContent SwitchToAlertDesfaultContent = new SwitchToAlertDesfaultContent();
            SwitchToAlertDesfaultContent.SwitchToAlertDesfaultContent();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SwitchToNewTab() throws Exception {
        try {
            SwitchToNewTab SwitchToNewTab = new SwitchToNewTab();
            SwitchToNewTab.SwitchToNewTab();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void AbrirPestana(String url) throws Exception {
        try {
            AbrirPestana AbrirPestana = new AbrirPestana();
            AbrirPestana.AbrirPestana(url);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void SwitchToBackTab() throws Exception {
        try {
            SwitchToBackTab SwitchToBackTab = new SwitchToBackTab();
            SwitchToBackTab.SwitchToBackTab();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void Scroll(int ParametroInt1, int ParametroInt2) throws Exception {
        try {
            Scroll Scroll = new Scroll();
            Scroll.Scroll(ParametroInt1, ParametroInt2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void switchToFrameId(String IdValueElemento) throws Exception {
        try {
            switchToFrame switchToFrameId = new switchToFrame();
            switchToFrameId.switchToFrameId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void switchToFrameName(String IdValueElemento) throws Exception {
        try {
            switchToFrame switchToFrameName = new switchToFrame();
            switchToFrameName.switchToFrameName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void switchToFrameClassName(String IdValueElemento) throws Exception {
        try {
            switchToFrame switchToFrameClassName = new switchToFrame();
            switchToFrameClassName.switchToFrameClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void switchToFrameXpath(String IdValueElemento) throws Exception {
        try {
            switchToFrame switchToFrameXpath = new switchToFrame();
            switchToFrameXpath.switchToFrameXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void switchToFrameLinkText(String IdValueElemento) throws Exception {
        try {
            switchToFrame switchToFrameLinkText = new switchToFrame();
            switchToFrameLinkText.switchToFrameLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void switchToFramePartianLinkText(String IdValueElemento) throws Exception {
        try {
            switchToFrame switchToFramePartianLinkText = new switchToFrame();
            switchToFramePartianLinkText.switchToFramePartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void switchToFrameTagName(String IdValueElemento) throws Exception {
        try {
            switchToFrame switchToFrameTagName = new switchToFrame();
            switchToFrameTagName.switchToFrameTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void switchToFrameCssSelector(String IdValueElemento) throws Exception {
        try {
            switchToFrame switchToFrameCssSelector = new switchToFrame();
            switchToFrameCssSelector.switchToFrameCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void implicitlyWait_SECONDS(int ParametroInt1) throws Exception {
        try {
            implicitlyWait_SECONDS implicitlyWait_SECONDS = new implicitlyWait_SECONDS();
            implicitlyWait_SECONDS.implicitlyWait_SECONDS(ParametroInt1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void pageLoadTimeout_SECONDS(int ParametroInt1) throws Exception {
        try {
            pageLoadTimeout_SECONDS pageLoadTimeout_SECONDS = new pageLoadTimeout_SECONDS();
            pageLoadTimeout_SECONDS.pageLoadTimeout_SECONDS(ParametroInt1);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion wait
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     * @param espera
     */
    public void waitId(String IdValueElemento, String espera) throws Exception {
        try {
            wait waitId = new wait();
            waitId.waitId(IdValueElemento, espera);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void waitName(String IdValueElemento, String espera) throws Exception {
        try {
            wait waitName = new wait();
            waitName.waitName(IdValueElemento, espera);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void waitClassName(String IdValueElemento, String espera) throws Exception {
        try {
            wait waitClassName = new wait();
            waitClassName.waitClassName(IdValueElemento, espera);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void waitXpath(String IdValueElemento, String espera) throws Exception {
        try {
            wait waitXpath = new wait();
            waitXpath.waitXpath(IdValueElemento, espera);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void waitLinkText(String IdValueElemento, String espera) throws Exception {
        try {
            wait waitLinkText = new wait();
            waitLinkText.waitLinkText(IdValueElemento, espera);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void waitPartianLinkText(String IdValueElemento, String espera) throws Exception {
        try {
            wait waitPartianLinkText = new wait();
            waitPartianLinkText.waitPartianLinkText(IdValueElemento, espera);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void waitTagName(String IdValueElemento, String espera) throws Exception {
        try {
            wait waitTagName = new wait();
            waitTagName.waitTagName(IdValueElemento, espera);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void waitCssSelector(String IdValueElemento, String espera) throws Exception {
        try {
            wait waitCssSelector = new wait();
            waitCssSelector.waitCssSelector(IdValueElemento, espera);
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * ***************************************************************************
     * Métodos Para realizar la accion getLocation
     * ***************************************************************************
     * @param IdValueElemento Valor del elemento a buscar
     */
    public void getLocationId(String IdValueElemento) throws Exception {
        try {
            getLocation getLocationId = new getLocation();
            getLocationId.getLocationId(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getLocationName(String IdValueElemento) throws Exception {
        try {
            getLocation getLocationName = new getLocation();
            getLocationName.getLocationName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getLocationClassName(String IdValueElemento) throws Exception {
        try {
            getLocation getLocationClassName = new getLocation();
            getLocationClassName.getLocationClassName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getLocationXpath(String IdValueElemento) throws Exception {
        try {
            getLocation getLocationXpath = new getLocation();
            getLocationXpath.getLocationXpath(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getLocationLinkText(String IdValueElemento) throws Exception {
        try {
            getLocation getLocationLinkText = new getLocation();
            getLocationLinkText.getLocationLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getLocationPartianLinkText(String IdValueElemento) throws Exception {
        try {
            getLocation getLocationPartianLinkText = new getLocation();
            getLocationPartianLinkText.getLocationPartianLinkText(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getLocationTagName(String IdValueElemento) throws Exception {
        try {
            getLocation getLocationTagName = new getLocation();
            getLocationTagName.getLocationTagName(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void getLocationCssSelector(String IdValueElemento) throws Exception {
        try {
            getLocation getLocationCssSelector = new getLocation();
            getLocationCssSelector.getLocationCssSelector(IdValueElemento);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void CaptureRegionScreenId(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {
        try {
            Captures CaptureRegionScreenId = new Captures();
            CaptureRegionScreenId.CaptureRegionScreenId(IdValueElemento, DateToStr, DateToStr2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void CaptureRegionScreenName(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {
        try {
            Captures CaptureRegionScreenName = new Captures();
            CaptureRegionScreenName.CaptureRegionScreenName(IdValueElemento, DateToStr, DateToStr2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void CaptureRegionScreenclassName(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {
        try {
            Captures CaptureRegionScreenclassName = new Captures();
            CaptureRegionScreenclassName.CaptureRegionScreenclassName(IdValueElemento, DateToStr, DateToStr2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void CaptureRegionScreenxpath(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {
        try {
            Captures CaptureRegionScreenxpath = new Captures();
            CaptureRegionScreenxpath.CaptureRegionScreenxpath(IdValueElemento, DateToStr, DateToStr2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void CaptureRegionScreenlinkText(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {
        try {
            Captures CaptureRegionScreenlinkText = new Captures();
            CaptureRegionScreenlinkText.CaptureRegionScreenlinkText(IdValueElemento, DateToStr, DateToStr2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void CaptureRegionScreenpartialLinkText(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {
        try {
            Captures CaptureRegionScreenpartialLinkText = new Captures();
            CaptureRegionScreenpartialLinkText.CaptureRegionScreenpartialLinkText(IdValueElemento, DateToStr, DateToStr2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void CaptureRegionScreentagName(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {
        try {
            Captures CaptureRegionScreentagName = new Captures();
            CaptureRegionScreentagName.CaptureRegionScreentagName(IdValueElemento, DateToStr, DateToStr2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void CaptureRegionScreencssSelector(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {
        try {
            Captures CaptureRegionScreencssSelector = new Captures();
            CaptureRegionScreencssSelector.CaptureRegionScreencssSelector(IdValueElemento, DateToStr, DateToStr2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void CaptureFullScreen(String DateToStr, String DateToStr2) throws Exception {
        try {
            Captures CaptureFullScreen = new Captures();
            CaptureFullScreen.CaptureFullScreen(DateToStr, DateToStr2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void BackPage() throws Exception {
        try {
            BackPage BackPage = new BackPage();
            BackPage.BackPage();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void forwardPage() throws Exception {
        try {
            forwardPage forwardPage = new forwardPage();
            forwardPage.forwardPage();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void f5Page() throws Exception {
        try {
            f5Page f5Page = new f5Page();
            f5Page.f5Page();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void Close() throws Exception {
        try {
            CloseAndQuit close = new CloseAndQuit();
            close.Close();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void DragAndDrop(WebElement Elemento1, WebElement Elemento2) throws Exception {
        try {
            DragAndDrop DragAndDrop = new DragAndDrop();
            DragAndDrop.DragAndDrop(Elemento1, Elemento2);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void finalizarProcesos() throws Exception {
        try {
            finalizarProcesos finalizarProcesos = new finalizarProcesos();
            finalizarProcesos.finalizarProcesos();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void cerrarAplicacion() throws Exception {
        try {
            cerrarAplicacion cerrarAplicacion = new cerrarAplicacion();
            cerrarAplicacion.cerrarAplicacion();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void QuitDriver() throws Exception {
        try {
            CloseAndQuit quitDriver = new CloseAndQuit();
            quitDriver.QuitDriver();
        } catch (IOException ex) {
            throw ex;
        }
    }

//Cookies
    public void borrarCookies(String parametro) throws Exception {
        borrarCookies borraCookies = new borrarCookies();
        try {
            borraCookies.borrarCookies(parametro);
        } catch (IOException ex) {
            throw ex;
        }
    }

    public void executeJs(String parametro) throws Exception {
        try {
            executeJs executeJs = new executeJs();
            executeJs.executeJs(parametro);
        } catch (IOException ex) {
            throw ex;
        }
    }

    // FUNCIONES JAVA SCRIPT
    public void sendKeyJsId(String identificador, String parametro) throws Exception {
        try {
            Sendkey sendKeyJsId = new Sendkey();
            sendKeyJsId.sendKeyJsId(identificador, parametro);
        } catch (Exception ex) {
            throw ex;
        }
    }
}
