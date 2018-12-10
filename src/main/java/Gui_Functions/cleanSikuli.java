/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

import org.sikuli.api.robot.Key;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;

/**
 *
 * @author SQA
 */
public class cleanSikuli {

    /**
     * Metodo que se utiliza para borrar una cantidad de caracteres que haya en
     * un campo
     *
     * @param Pulsar entero que se utiliza para borrar una cantidad de
     * caracteres
     * @throws java.lang.Exception
     */
    public void cleanSikuli(int Pulsar) throws Exception {
        Keyboard kb = new DesktopKeyboard();

        for (int i = 1; i <= Pulsar; i++) {
            kb.type(Key.BACKSPACE);
        }
    }
}
