/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

import static Gui_Functions.GetGui.clipboard;
import static Gui_Functions.GetGui.robot;
import static Gui_Functions.GetGui.seleccion;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;

/**
 *
 * @author SQA
 */
public class spell extends validateNull {

    /**
     * Metodo que permite colocar en un campo tipo input lo que desea escribir
     *
     * @param valor en este parametro debe ir lo que quiere escribir
     * @throws java.lang.Exception
     */
    public void spell(String valor) throws Exception {
        for (int i = 0; i < 5; i++) {
            Keyboard kb = new DesktopKeyboard();
            kb.paste(validateNull(valor));
            // }
            break;
        }
    }

    /**
     * Metodo que permite escribir con el robot de Sikuli para diligenciar algun
     * campo
     *
     * @param valor n este parametro debe ir lo que quiere escribir
     * @throws java.lang.Exception
     */
    public void spellRobot(String valor) throws Exception {
        for (int i = 0; i < 5; i++) {
            robot = new Robot();
            seleccion = new StringSelection(validateNull(valor));
            clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(seleccion, null);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(86);
            robot.keyRelease(17);
            robot.keyRelease(86);

            break;
        }
    }

    /**
     * Metodo para escribir vocales con sus respectivas tildes
     *
     * @param valor cadena inicial
     * @param antiguo caracter que se desea reemplazar
     * @param nuevo caracter a introducir en la cadena
     * @throws java.lang.Exception
     */
    public void spellRobotEspecial(String valor, String antiguo, String nuevo) throws Exception {
        robot = new Robot();
        Keyboard kb = new DesktopKeyboard();
        int tam = validateNull(valor).replaceAll(antiguo, nuevo).length();
        if (tam > 0) {
            String[] array = valor.toString().replaceAll(antiguo, nuevo).split("");
            for (int i = 0; i < tam; i++) {
                switch (array[i]) {
                    case "prueba1":
                        robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
                        robot.keyPress(KeyEvent.VK_A);

                        robot.keyRelease(KeyEvent.VK_A);
                        robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);
                        break;
                    case "prueba2":
                        robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
                        robot.keyPress(KeyEvent.VK_E);

                        robot.keyRelease(KeyEvent.VK_E);
                        robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);
                        break;
                    case "prueba3":

                        robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
                        robot.keyPress(KeyEvent.VK_I);

                        robot.keyRelease(KeyEvent.VK_I);
                        robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);
                        break;
                    case "prueba4":

                        robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
                        robot.keyPress(KeyEvent.VK_O);

                        robot.keyRelease(KeyEvent.VK_O);
                        robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);
                        break;
                    case "prueba5":
                        robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
                        robot.keyPress(KeyEvent.VK_U);

                        robot.keyRelease(KeyEvent.VK_U);
                        robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);
                        break;
                    default:
                        kb.type(array[i]);
                }
                // esperarSegundos(1);
            }
        }
    }
}
