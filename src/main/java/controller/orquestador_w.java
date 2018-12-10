/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Usuario
 */
import controller.Class_Gui.ActionGui;
import controller.Class_Web.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.LeerExcel;

public class orquestador_w {

    ActionWeb action = new ActionWeb();
    ActionGui ag = new ActionGui();
    NewActionWeb mAdd = new NewActionWeb();
    static String dateW;
    static boolean exeW;
    static int contW;

    public static LeerExcel leer;

    static Date dateCapturas;
    static DateFormat dateFormat;
    static String date2;
    static String rutaEvidencia;

    public orquestador_w() {
        contW = 0;
        exeW = true;
        leer = new LeerExcel(System.getProperty("user.dir") + "/DataDriven/DataDrivenFBWeb.xlsx");
    }

    public orquestador_w(String date) {
        this.dateW = date;
        contW = 0;
        exeW = true;
        leer = new LeerExcel(System.getProperty("user.dir") + "/DataDriven/DataDrivenFBWeb.xlsx");
    }

    public void actions(String actionW, String explorer, String tipoIdentificador, String valueIdentificador, String parametro, String value1, String value2, int fila) throws Exception {
        try {
            dateCapturas = new Date();
            dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
            date2 = dateFormat.format(dateCapturas);
            int value01;
            int value02;
            if (value1.equals("") || value2.equals("")) {
                value1 = value2 = "0";
            }
            value1.trim();
            value2.trim();
            value01 = Integer.parseInt(value1);
            value02 = Integer.parseInt(value2);
            contW++;

            switch (actionW) {
                case "Ingresar URL":
                    action.AbrirNavegador(explorer, parametro);
                    break;

                case "Click":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.ClickId(valueIdentificador);
                            break;

                        case "Name":
                            action.ClickName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.ClickClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.ClickXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.ClickCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.ClickLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.ClickPartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.ClickTagName(valueIdentificador);
                            break;

                    }

                    break;
                case "Click JS":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.ClickJSId(valueIdentificador);
                            break;

                        case "Name":
                            action.ClickJSName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.ClickJSClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.ClickJSXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.ClickJSCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.ClickJSLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.ClickJSPartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.ClickJSTagName(valueIdentificador);
                            break;

                    }
                    break;
                case "Click Mouse":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.ClickMouseId(valueIdentificador);
                            break;

                        case "Name":
                            action.ClickMouseName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.ClickMouseClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.ClickMouseXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.ClickMouseCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.ClickMouseLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.ClickMousePartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.ClickMouseTagName(valueIdentificador);
                            break;

                    }

                    break;
                case "Click Robot":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.ClickRobotId(valueIdentificador);
                            break;

                        case "Name":
                            action.ClickRobotName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.ClickRobotClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.ClickRobotXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.ClickRobotCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.ClickRobotLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.ClickRobotPartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.ClickRobotTagName(valueIdentificador);
                            break;

                    }

                    break;

                case "Desmarcar Checkbox":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.desmarcarCheckId(valueIdentificador);
                            break;

                        case "Name":
                            action.desmarcarCheckName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.desmarcarCheckClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.desmarcarCheckXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.desmarcarCheckCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.desmarcarCheckLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.desmarcarCheckPartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.desmarcarCheckTagName(valueIdentificador);
                            break;

                    }

                    break;
                case "Desmarcar Todos Checkbox":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.desmarcarTodosCheckId(valueIdentificador);
                            break;

                        case "Name":
                            action.desmarcarTodosCheckName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.desmarcarTodosCheckClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.desmarcarTodosCheckXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.desmarcarTodosCheckCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.desmarcarTodosCheckLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.desmarcarTodosCheckPartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.desmarcarTodosCheckTagName(valueIdentificador);
                            break;

                    }

                    break;
                case "Funcion de teclado":
                    switch (tipoIdentificador) {
                        case "Enter":
                            ag.enter();
                            break;
                        case "Escape":
                            ag.escape();
                            break;
                        case "Tab":
                            System.out.println("tab");
                            ag.tab();
                            break;
                        case "BackSpace":
                            ag.backSpace();
                            break;
                        case "Home":
                            ag.home();
                            break;
                        case "End":
                            ag.end();
                            break;
                        case "Delete":
                            ag.delete();
                            break;
                        case "Copy":
                            ag.copy();
                            break;
                        case "Cut":
                            ag.cut();
                            break;
                        case "Paste":
                            ag.paste();
                            break;
                        case "Seleccionar todo (A)":
                            ag.selectAllA();
                            break;
                        case "Seleccionar todo (E)":
                            ag.selectAllE();
                            break;
                        case "Find (F)":
                            ag.findF();
                            break;
                        case "Find (B)":
                            ag.findB();
                            break;
                        case "Close Tab":
                            ag.closeTab();
                            break;
                        case "Next":
                            ag.next();
                            break;
                        case "Back":
                            ag.back();
                            break;
                        case "Close All":
                            ag.closeAll();
                            break;
                        case "AvPag":
                            ag.AvPag();
                            break;
                        case "RePag":
                            ag.RePag();
                            break;
                    }
                    break;
                case "Marcar Todos CheckBox":
                    switch (tipoIdentificador) {

                        case "ID":
                            action.marcarTodosCheckId(valueIdentificador);
                            break;

                        case "Name":
                            action.marcarTodosCheckName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.marcarTodosCheckClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.marcarTodosCheckXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.marcarTodosCheckCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.marcarTodosCheckLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.marcarTodosCheckPartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.marcarTodosCheckTagName(valueIdentificador);
                            break;

                    }

                    break;

                case "SendKey":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.SendkeyId(valueIdentificador, parametro);
                            break;

                        case "Name":
                            action.SendkeyName(valueIdentificador, parametro);
                            break;

                        case "Class Name":
                            action.SendKeyClassName(valueIdentificador, parametro);
                            break;

                        case "XPath":
                            action.SendKeyXpath(valueIdentificador, parametro);
                            break;

                        case "CssSelecctor":
                            action.SendKeyCssSelector(valueIdentificador, parametro);
                            break;

                        case "linkText":
                            action.SendKeyLinkText(valueIdentificador, parametro);
                            break;

                        case "Partial Link Text":
                            action.SendKeyPartianLinkText(valueIdentificador, parametro);
                            break;

                        case "Tag Name":
                            action.SendKeyTagName(valueIdentificador, parametro);
                            break;
                    }

                    break;
                case "SendKey Gui":
                    ag.pegarGui(parametro);
                    break;
                case "SendKey Robot":
                    ag.escribirRobot(parametro);
                    break;

                case "SendKey Excel":
                    switch (tipoIdentificador) {

                        case "ID":
                            action.SendkeyId(valueIdentificador, leer.getCellData("FrameworkSQA", parametro, fila));
                            break;

                        case "Name":
                            action.SendkeyName(valueIdentificador, leer.getCellData("FrameworkSQA", parametro, fila));
                            break;

                        case "Class Name":
                            action.SendKeyClassName(valueIdentificador, leer.getCellData("FrameworkSQA", parametro, fila));
                            break;

                        case "XPath":
                            action.SendKeyXpath(valueIdentificador, leer.getCellData("FrameworkSQA", parametro, fila));
                            break;

                        case "CssSelecctor":
                            action.SendKeyCssSelector(valueIdentificador, leer.getCellData("FrameworkSQA", parametro, fila));
                            break;

                        case "linkText":
                            action.SendKeyLinkText(valueIdentificador, leer.getCellData("FrameworkSQA", parametro, fila));
                            break;

                        case "Partial Link Text":
                            action.SendKeyPartianLinkText(valueIdentificador, leer.getCellData("FrameworkSQA", parametro, fila));
                            break;

                        case "Tag Name":
                            action.SendKeyTagName(valueIdentificador, leer.getCellData("FrameworkSQA", parametro, fila));
                            break;
                    }

                    break;
                case "SendKey Excel Robot":
                    ag.pegarGui(leer.getCellData("FrameworkSQA", parametro, fila));
                    break;
                case "SendKey Excel Gui":
                    ag.pegarGui(leer.getCellData("FrameworkSQA", parametro, fila));
                    break;
                case "Loop":
                    System.out.println("Loop");
                    break;

                case "EndLoop":
                    System.out.println("EndLoop");
                    break;

                case "Fila Inicial Excel":
                    System.out.println("Fila Inicial Excel");
                    break;

                case "Limpiar Campo":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.ClearId(valueIdentificador);
                            break;

                        case "Name":
                            action.ClearName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.ClearClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.ClearXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.ClearCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.ClearLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.ClearPartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.ClearTagName(valueIdentificador);
                            break;
                    }

                    break;
                case "Esperar (Millisegundos)":
                    try {
                        Thread.sleep(Integer.parseInt(parametro));
                        System.out.println("ESPERA");
                    } catch (InterruptedException e) {
                        System.out.println("El metodo no se ejecuto [espera] " + e.getMessage());
                    }
                    break;

                case "Enviar formulario":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.SubmitId(valueIdentificador);
                            break;

                        case "Name":
                            action.SubmitName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.SubmitClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.SubmitXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.SubmitCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.SubmitLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.SubmitPartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.SubmitTagName(valueIdentificador);
                            break;
                    }

                    break;
                case "Finalizar Ejecucion":
                    action.finalizarProcesos();
                    break;
                case "Ejecutar Javascript":
                    action.executeJs(parametro);
                    break;
                case "Cerrar Aplicacion":
                    action.cerrarAplicacion();
                    break;

                case "Tomar Evidencia":
                    action.CaptureFullScreen(dateW, date2);
                    break;

                case "Click Boton \"Aceptar\"":
                    action.SwitchToAlertAccept();
                    break;

                case "Tomar Evidencia Elemento":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.CaptureRegionScreenId(valueIdentificador, dateW, date2);
                            break;

                        case "Name":
                            action.CaptureRegionScreenName(valueIdentificador, dateW, date2);
                            break;

                        case "Class Name":
                            action.CaptureRegionScreenclassName(valueIdentificador, dateW, date2);
                            break;

                        case "XPath":
                            action.CaptureRegionScreenxpath(valueIdentificador, dateW, date2);
                            break;

                        case "CssSelecctor":
                            action.CaptureRegionScreencssSelector(valueIdentificador, dateW, date2);
                            break;

                        case "linkText":
                            action.CaptureRegionScreenlinkText(valueIdentificador, dateW, date2);
                            break;

                        case "Partial Link Text":
                            action.CaptureRegionScreenpartialLinkText(valueIdentificador, dateW, date2);
                            break;

                        case "Tag Name":
                            action.CaptureRegionScreentagName(valueIdentificador, dateW, date2);
                            break;
                    }

                    break;
                case "Doble Click":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.DobleClickId(valueIdentificador);
                            break;

                        case "Name":
                            action.DobleClickName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.DobleClickClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.DobleClickXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.DobleClickCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.DobleClickLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.DobleClickPartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.DobleClickTagName(valueIdentificador);
                            break;

                    }

                    break;

                case "Click Derecho":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.RightClickId(valueIdentificador);
                            break;

                        case "Name":
                            action.RightClickName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.RightClickClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.RightClickXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.RightClickCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.RightClickLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.RightClickPartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.RightClickTagName(valueIdentificador);
                            break;

                    }

                    break;

                case "Mover A Elemento":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.MoveToElementId(valueIdentificador);
                            break;

                        case "Name":
                            action.MoveToElementName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.MoveToElementClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.MoveToElementXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.MoveToElementCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.MoveToElementLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.MoveToElementPartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.MoveToElementTagName(valueIdentificador);
                            break;

                    }

                    break;
                case "Mover A Elemento Coordenadas":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.MoveToElementCoordId(valueIdentificador, value01, value02);
                            break;

                        case "Name":
                            action.MoveToElementCoordName(valueIdentificador, value01, value02);
                            break;

                        case "Class Name":
                            action.MoveToElementCoordClassName(valueIdentificador, value01, value02);
                            break;

                        case "XPath":
                            action.MoveToElementCoordXpath(valueIdentificador, value01, value02);
                            break;

                        case "CssSelecctor":
                            action.MoveToElementCoordCssSelector(valueIdentificador, value01, value02);
                            break;

                        case "linkText":
                            action.MoveToElementCoordLinkText(valueIdentificador, value01, value02);
                            break;

                        case "Partial Link Text":
                            action.MoveToElementCoordPartianLinkText(valueIdentificador, value01, value02);
                            break;

                        case "Tag Name":
                            action.MoveToElementCoordTagName(valueIdentificador, value01, value02);
                            break;

                    }

                    break;

                case "Ingresar Texto Alert":
                    action.SwitchToAlertText(parametro);
                    break;

                case "Click Boton \"Cancelar\"":
                    action.SwitchToAlertDismiss();
                    break;

                case "Cambiar Pestana":
                    action.SwitchToNewTab();
                    break;
                case "Cambiar a Frame Principal":
                    action.SwitchToAlertDesfaultContent();
                    break;

                case "Nueva Pestana":
                    action.AbrirPestana(parametro);
                    break;

                case "Volver a Ventana Original":
                    action.SwitchToBackTab();
                    break;
                case "Borrar Cookies":
                    action.borrarCookies(parametro);
                    break;
                case "Scroll":
                    action.Scroll(value01, value02);
                    break;
                case "Esperar Poliedro":
                    action.validarModal();
                    break;
                case "Cambiar Frame":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.switchToFrameId(valueIdentificador);
                            break;

                        case "Name":
                            action.switchToFrameName(valueIdentificador);
                            break;

                        case "Class Name":
                            action.switchToFrameClassName(valueIdentificador);
                            break;

                        case "XPath":
                            action.switchToFrameXpath(valueIdentificador);
                            break;

                        case "CssSelecctor":
                            action.switchToFrameCssSelector(valueIdentificador);
                            break;

                        case "linkText":
                            action.switchToFrameLinkText(valueIdentificador);
                            break;

                        case "Partial Link Text":
                            action.switchToFramePartianLinkText(valueIdentificador);
                            break;

                        case "Tag Name":
                            action.switchToFrameTagName(valueIdentificador);
                            break;

                    }

                    break;
                case "Sikuli":
                    switch (tipoIdentificador) {
                        case "Click":
                            ag.click(valueIdentificador, parametro);
                            break;
                        case "Doble Click":
                            ag.doubleClick(valueIdentificador, parametro);
                            break;
                        case "Click Especial":
                            ag.clickEspecial(valueIdentificador, parametro, Integer.parseInt(value1), Integer.parseInt(value2));
                            break;
                        case "Doble Click Especial":
                            ag.doubleClickEspecial(valueIdentificador, parametro, Integer.parseInt(value1), Integer.parseInt(value2));
                            break;
                        case "Click Con Robot":
                            ag.clickWithRobot(valueIdentificador, parametro);
                            break;
                        case "Click Derecho":
                            ag.clickRight(valueIdentificador, parametro);
                            break;
                        case "Click Espera":
                            ag.clickEspera(valueIdentificador, parametro);
                            break;
                        case "Pegar Texto":
                            ag.escribirGui(parametro);
                            break;
                        case "Escribir Robot":
                            ag.escribirRobot(parametro);
                            break;
                        case "Encontrar":
                            ag.find(valueIdentificador, parametro);
                            break;
                    }
                    break;

                case "Esperar elemento":

                    switch (tipoIdentificador) {

                        case "ID":
                            action.waitId(valueIdentificador, parametro);
                            break;

                        case "Name":
                            action.waitName(valueIdentificador, parametro);
                            break;

                        case "Class Name":
                            action.waitClassName(valueIdentificador, parametro);
                            break;

                        case "XPath":
                            action.waitXpath(valueIdentificador, parametro);
                            break;

                        case "CssSelecctor":
                            action.waitCssSelector(valueIdentificador, parametro);
                            break;

                        case "linkText":
                            action.waitLinkText(valueIdentificador, parametro);
                            break;

                        case "Partial Link Text":
                            action.waitPartianLinkText(valueIdentificador, parametro);
                            break;

                        case "Tag Name":
                            action.waitTagName(valueIdentificador, parametro);
                            break;

                    }

                    break;

                case "Ir Atras":
                    action.BackPage();
                    break;
                case "Click Derecho en pagina":
                    action.RightClickWindow();
                    break;

                case "Ir Adelante":
                    action.forwardPage();
                    break;

                case "Refrescar":
                    action.f5Page();
                    break;

                case "Cerrar Navegador":
                    action.Close();
                    action.QuitDriver();
                    break;
                case "metodo":
                    mAdd.dfgfdg(valueIdentificador);
                    break;
            }
//            if (actionW.equals("Tomar Evidencia")) {
//                rutaEvidencia = System.getProperty("user.dir") + "\\" + "Evidencia" + "\\" + "capturas" + "\\" + FxmlNewSuitTestController.nombre + "\\" + dateW + "\\" + FxmlNewSuitTestController.nombre + "_full_" + date2 + ".png";
//                System.out.println("RutaEvidencia: " + rutaEvidencia);
//            } else if (actionW.equals("Tomar Evidencia Elemento")) {
//                rutaEvidencia = System.getProperty("user.dir") + "\\" + "Evidencia" + "\\" + "capturas" + "\\" + FxmlNewSuitTestController.nombre + "\\" + dateW + "\\" + FxmlNewSuitTestController.nombre + "_" + valueIdentificador + "_" + date2 + ".png";
//                System.out.println("RutaEvidencia: " + rutaEvidencia);
//            } else {
//                rutaEvidencia = "display:none";
//            }
            //LogController.Update_Report("executed", contW, actionW, valueIdentificador, parametro, dateW, rutaEvidencia);
//            date2 = "";
//            rutaEvidencia = "";
        } catch (Exception exception) {
            System.out.println("Error" + actionW + ": " + exception.getMessage());
            setExeW(false);
            //LogController.Update_Report("failed", contW, actionW, valueIdentificador, parametro, dateW, rutaEvidencia);
//            date2 = "";
//            rutaEvidencia = "";
        }

    }

    public static String getDateW() {
        return dateW;
    }

    public static void setDateW(String dateW) {
        orquestador_w.dateW = dateW;
    }

    public static boolean isExeW() {
        return exeW;
    }

    public static void setExeW(boolean exeW) {
        orquestador_w.exeW = exeW;
    }

}
