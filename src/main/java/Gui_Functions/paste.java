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
public class paste extends validateNull {

    /**
     * Metodo que va a inserta en un campo un valor copiado anteriormente
     *
     * @param valor
     * @throws java.lang.Exception
     */
    public void paste(String valor) throws Exception {
        Keyboard kb = new DesktopKeyboard();
        kb.paste(validateNull(valor));
    }
}
