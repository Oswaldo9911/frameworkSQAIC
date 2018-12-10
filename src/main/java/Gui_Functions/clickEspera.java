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
public class clickEspera {

    public void clickEspera(String direccion, String nombreImagen) throws Exception {
        // el for lo que realiza es que busque varias veces la imagen
        try {

            for (int i = 0; i < 20; i++) {
                // Bloque try para capturar psoible error
                sr = new DesktopScreenRegion();
                tr = new ImageTarget(new File(direccion + nombreImagen));
                // tr = new ImageTarget(new File(ruta + "File.png"));
                sr.wait(tr, 5000);
                sr = sr.find(tr);
                if (sr.equals("") || sr == null) {
                    System.out.println("Continua");
                    i = 20;
                } else {
                    System.out.println("Cargando...");
                    mouse = new DesktopMouse();
                    mouse.click(sr.getCenter());
                    Thread.sleep(5000);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("s");
        }
    }
}
