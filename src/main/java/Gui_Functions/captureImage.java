/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

import static Gui_Functions.GetGui.Dt_Fecha;
import static Gui_Functions.GetGui.Obj_Carpeta;
import static Gui_Functions.GetGui.Str_Nombre_Archivo;
import static Gui_Functions.GetGui.Str_Ruta;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

/**
 *
 * @author SQA
 */
public class captureImage {

    /**
     * Metodo que captura una imagen y la guarda en una carpeta correspondiente
     *
     * @throws java.lang.Exception
     */
    public void captureImage() throws Exception {

        Dt_Fecha = new SimpleDateFormat("dd-M-yyyy");
        Str_Ruta += Dt_Fecha.format(new Date()) + "\\";
        Str_Ruta = Str_Ruta.replaceAll("-", "_");
        Obj_Carpeta = new File(Str_Ruta);
        if (!Obj_Carpeta.isDirectory()) {
            Obj_Carpeta.mkdirs();
        }
        Dt_Fecha = new SimpleDateFormat("dd-M-yyyy hh:mm:ss mmm");
        Str_Nombre_Archivo += Dt_Fecha.format(new Date());
        Str_Nombre_Archivo = Str_Nombre_Archivo.replaceAll(":", "_");
        Str_Nombre_Archivo = Str_Nombre_Archivo.replaceAll("-", "_");
        Dimension Obj_Dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle Obj_Rectangulo = new Rectangle(Obj_Dimension);
        Robot Obj_Robot = new Robot();
        BufferedImage Obj_Imagen = Obj_Robot.createScreenCapture(Obj_Rectangulo);
        ImageIO.write(Obj_Imagen, "jpg", new File(Str_Ruta + Str_Nombre_Archivo + "GUI.jpg"));
        String Str_Ruta_ScreenShot = Str_Ruta + Str_Nombre_Archivo + "GUI.jpg";
    }
}
