/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

import static Gui_Functions.GetGui.clipboard;
import static Gui_Functions.GetGui.dataflavor;
import static Gui_Functions.GetGui.robot;
import static Gui_Functions.GetGui.transferable;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyEvent;

/**
 *
 * @author SQA
 */
public class copiAllRobot extends waitSeconds {

    /**
     * Metodo para realzar una copia a una cantidad de caracteres seleccionados
     *
     * @return devuevle una cadena de texto seleccionada
     * @throws java.lang.Exception
     */
    public String copiAllRobot() throws Exception {
        String texto = "";
        robot = new Robot();
        /*
			 * robot.keyPress(KeyEvent.VK_SHIFT);
			 * robot.keyPress(KeyEvent.VK_END);
			 * robot.keyRelease(KeyEvent.VK_END);
			 * robot.keyRelease(KeyEvent.VK_SHIFT);
         */
        waitSeconds(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        waitSeconds(2);
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        transferable = clipboard.getContents(this);
        dataflavor = new DataFlavor("application/x-java-serialized-object; class=java.lang.String");
        if (transferable.isDataFlavorSupported(dataflavor)) {
            texto = (String) transferable.getTransferData(dataflavor);
        }
        return texto;
    }
}
