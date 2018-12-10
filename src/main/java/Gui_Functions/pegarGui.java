/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;

/**
 *
 * @author SQA
 */
public class pegarGui {

    public void pegarGui(String texto) throws Exception {
        Keyboard kb = new DesktopKeyboard();
        kb.paste(texto);
    }
}
