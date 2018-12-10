/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

import static Gui_Functions.doChar.imprimirRobot;

/**
 *
 * @author SQA
 */
public class escribirRobot {

    public void escribirRobot(CharSequence characters) {
        int length = characters.length();
        for (int i = 0; i < length; i++) {
            char character = characters.charAt(i);
            imprimirRobot(character);
        }
    }
}
