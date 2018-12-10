/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

import static Gui_Functions.GetGui.robot;
import static Gui_Functions.GetGui.sr;
import static Gui_Functions.GetGui.tr;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.File;
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;

/**
 *
 * @author SQA
 */
public class clickWithRobot {

    /**
     * Metodo que permite dar un click pero con el robot ya que con Sikuli
     * algunas veces toca referenciarlo asi para que funcione
     *
     * @param direccion en este parametro ira la direccion donde va a guardar
     * las imagnes
     * @param nombreImagen en este para metro ira el nombre de la imagen con su
     * extencion pertinente
     * @throws java.lang.Exception
     */
    public void clickWithRobot(String direccion, String nombreImagen) throws Exception {

        for (int i = 0; i < 10; i++) {
            robot = new Robot();
            sr = new DesktopScreenRegion();
            tr = new ImageTarget(new File(direccion + nombreImagen));
            // tr = new ImageTarget(new File(ruta + "clickConRobot.png"));
            sr.wait(tr, 5000);
            sr = sr.find(tr);
            robot.mouseMove(sr.getCenter().getX(), sr.getCenter().getY());
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            break;
        }
    }
}
