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
public class doubleClickEspecial {

    /**
     * Metodo que permite realizar un dobleclick referente a una imagen como
     * pocision inicial y despues se desplazara de esa pocision con las
     * coordenadas enviadas
     *
     * @param direccion en este parametro ira la direccion donde va a guardar
     * las imagnes
     * @param nombreImagen en este para metro ira el nombre de la imagen con su
     * extencion pertinente
     * @param x cantidad que desea desplazar el mouse en la posicion x
     * @param y cantidad que desea desplazar el mouse en la posicion y
     * @throws java.lang.Exception
     */
    public void doubleClickEspecial(String direccion, String nombreImagen, int x, int y) throws Exception {
        for (int i = 0; i < 10; i++) {
            sr = new DesktopScreenRegion();
            tr = new ImageTarget(new File(direccion + nombreImagen));
            // tr = new ImageTarget(new File(ruta + "clickEspecial2.png"));
            sr.wait(tr, 5000);
            sr = sr.find(tr);
            mouse = new DesktopMouse();
            mouse.doubleClick(sr.getCenter().getRelativeScreenLocation(x, y));
            break;
        }

    }
}
