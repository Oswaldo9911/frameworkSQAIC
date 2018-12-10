package controller.Class_Gui;

import Gui_Functions.click;
import static Gui_Functions.GetGui.robot;
import Gui_Functions.captureImage;
import Gui_Functions.cleanSikuli;
import Gui_Functions.clickEspecial;
import Gui_Functions.clickEspera;
import Gui_Functions.clickRight;
import Gui_Functions.clickWithRobot;
import Gui_Functions.copiAllRobot;
import Gui_Functions.doubleClick;
import Gui_Functions.doubleClickEspecial;
import Gui_Functions.escribirGui;
import Gui_Functions.escribirRobot;
import Gui_Functions.find;
import Gui_Functions.keyboard;
import Gui_Functions.paste;
import Gui_Functions.pegarGui;
import Gui_Functions.spell;
import Gui_Functions.waitSeconds;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActionGui {

    public ActionGui() {
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(ActionGui.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void pegarGui(String texto) throws Exception {
        try {
            pegarGui pegarGui = new pegarGui();
            pegarGui.pegarGui(texto);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void escribirGui(String texto) throws Exception {
        try {
            escribirGui escribirGui = new escribirGui();
            escribirGui.escribirGui(texto);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void enter() {
        keyboard enter = new keyboard();
        enter.enter();
    }

    public void escape() {
        keyboard escape = new keyboard();
        escape.escape();
    }

    public void tab() {
        keyboard tab = new keyboard();
        tab.tab();
    }

    public void backSpace() {
        keyboard backSpace = new keyboard();
        backSpace.backSpace();
    }

    public void home() {
        keyboard home = new keyboard();
        home.home();
    }

    public void end() {
        keyboard end = new keyboard();
        end.end();
    }

    public void delete() {
        keyboard delete = new keyboard();
        delete.delete();
    }

    public void copy() {
        keyboard copy = new keyboard();
        copy.copy();
    }

    public void cut() {
        keyboard cut = new keyboard();
        cut.cut();
    }

    public void paste() {
        keyboard paste = new keyboard();
        paste.paste();
    }

    public void selectAllA() {
        keyboard selectAllA = new keyboard();
        selectAllA.selectAllA();
    }

    public void selectAllE() {
        keyboard selectAllE = new keyboard();
        selectAllE.selectAllE();
    }

    public void findF() {
        keyboard findF = new keyboard();
        findF.findF();
    }

    public void findB() {
        keyboard findB = new keyboard();
        findB.findB();
    }

    public void closeTab() {
        keyboard closeTab = new keyboard();
        closeTab.closeTab();
    }

    public void next() {
        keyboard next = new keyboard();
        next.next();
    }

    public void back() {
        keyboard back = new keyboard();
        back.back();
    }

    public void closeAll() {
        keyboard closeAll = new keyboard();
        closeAll.closeAll();
    }

    public void AvPag() {
        keyboard AvPag = new keyboard();
        AvPag.AvPag();
    }

    public void RePag() {
        keyboard RePag = new keyboard();
        RePag.RePag();
    }

    /**
     * Metodo para encontrar una imagen pero sin realizar ninguna otra accion
     *
     * @param direccion en este parametro ira la direccion donde va a guardar
     * las imagnes
     * @param nombreImagen en este para metro ira el nombre de la imagen con su
     * extencion pertinente
     * @return
     */
    public boolean find(String direccion, String nombreImagen) throws Exception {
        try {
            find find = new find();
            return find.find(direccion, nombreImagen);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void escribirRobot(CharSequence characters) throws Exception {
        try {
            escribirRobot escribirRobot = new escribirRobot();
            escribirRobot.escribirRobot(characters);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void click(String direccion, String nombreImagen) throws Exception {
        try {
            click click = new click();
            click.click(direccion, nombreImagen);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickEspera(String direccion, String nombreImagen) throws Exception {
        try {
            clickEspera clickEspera = new clickEspera();
            clickEspera.clickEspera(direccion, nombreImagen);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void doubleClick(String direccion, String nombreImagen) throws Exception {
        try {
            doubleClick doubleClick = new doubleClick();
            doubleClick.doubleClick(direccion, nombreImagen);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickEspecial(String direccion, String nombreImagen, int x, int y) throws Exception {
        try {
            clickEspecial clickEspecial = new clickEspecial();
            clickEspecial.clickEspecial(direccion, nombreImagen, x, y);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void doubleClickEspecial(String direccion, String nombreImagen, int x, int y) throws Exception {
        try {
            doubleClickEspecial doubleClickEspecial = new doubleClickEspecial();
            doubleClickEspecial.doubleClickEspecial(direccion, nombreImagen, x, y);
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void clickWithRobot(String direccion, String nombreImagen) throws Exception {
        try {
            clickWithRobot clickWithRobot = new clickWithRobot();
            clickWithRobot.clickWithRobot(direccion, nombreImagen);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void spell(String valor) throws Exception {
        try {
            spell spell = new spell();
            spell.spell(valor);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void spellRobot(String valor) throws Exception {
        try {
            spell spellRobot = new spell();
            spellRobot.spellRobot(valor);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void spellRobotEspecial(String valor, String antiguo, String nuevo) throws Exception {
        try {
            spell spellRobotEspecial = new spell();
            spellRobotEspecial.spellRobotEspecial(valor, antiguo, nuevo);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void paste(String valor) throws Exception {
        try {
            paste paste = new paste();
            paste.paste(valor);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void waitSeconds(int segundos) throws Exception {
        try {
            waitSeconds waitSeconds = new waitSeconds();
            waitSeconds.waitSeconds(segundos);
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void cleanSikuli(int Pulsar) throws Exception {
        try {
            cleanSikuli cleanSikuli = new cleanSikuli();
            cleanSikuli.cleanSikuli(Pulsar);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public String copiAllRobot() throws Exception {
        try {
            copiAllRobot copiAllRobot = new copiAllRobot();
            return copiAllRobot.copiAllRobot();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void clickRight(String direccion, String nombreImagen) throws Exception {
        try {
            clickRight clickRight = new clickRight();
            clickRight.clickRight(direccion, nombreImagen);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void captureImage() throws Exception {
        try {
            captureImage captureImage = new captureImage();
            captureImage.captureImage();
        } catch (Exception ex) {
            throw ex;
        }
    }
}
