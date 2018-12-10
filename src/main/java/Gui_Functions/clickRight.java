/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

import static Gui_Functions.GetGui.mouse;
import static Gui_Functions.GetGui.sr;
import static Gui_Functions.GetGui.tr;
import java.io.File;
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.robot.desktop.DesktopMouse;

/**
 *
 * @author SQA
 */
public class clickRight {

    /**
     * Metodo que permite realizar la funcion de un click derecho
     *
     * @param direccion en este parametro ira la direccion donde va a guardar
     * las imagnes
     * @param nombreImagen en este para metro ira el nombre de la imagen con su
     * extencion pertinente
     * @throws java.lang.Exception
     */
    public void clickRight(String direccion, String nombreImagen) throws Exception {
        // el for lo que realiza es que busque varias veces la imagen
        for (int i = 0; i < 5; i++) {
            // Bloque try para capturar psoible error

            sr = new DesktopScreenRegion();
            tr = new ImageTarget(new File(direccion + nombreImagen));
            // tr = new ImageTarget(new File(ruta + "File.png"));
            sr.wait(tr, 5000);
            sr = sr.find(tr);
            mouse = new DesktopMouse();
            mouse.rightClick(sr.getCenter());
            break;
        }

    }
}
