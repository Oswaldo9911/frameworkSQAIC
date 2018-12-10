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
public class find {

    /**
     * Metodo para encontrar una imagen pero sin realizar ninguna otra accion
     *
     * @param direccion en este parametro ira la direccion donde va a guardar
     * las imagnes
     * @param nombreImagen en este para metro ira el nombre de la imagen con su
     * extencion pertinente
     * @return
     * @throws java.lang.Exception
     */
    public boolean find(String direccion, String nombreImagen) throws Exception {
        boolean estado = false;
        for (int i = 0; i < 5; i++) {
            sr = new DesktopScreenRegion();

            tr = new ImageTarget(new File(direccion + nombreImagen));
            // tr = new ImageTarget(new File(ruta + "Encontrar.png"));
            sr.wait(tr, 5000);
            sr = sr.find(tr);
            mouse = new DesktopMouse();
            mouse.move(sr.getCenter());
            System.out.println("imagen encontrada");
            estado = true;
            break;

        }
        return estado;
    }
}
