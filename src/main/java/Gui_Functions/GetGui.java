/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

import java.awt.Robot;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.text.SimpleDateFormat;
import org.sikuli.api.ScreenLocation;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.Mouse;

/**
 *
 * @author SQA
 */
public class GetGui {

    /**
     * Definicion de variables
     */
    public static ScreenRegion sr;
    public static ScreenLocation sl;
    public static Target tr;
    public static Mouse mouse;

    public static Robot robot;
    public static StringSelection seleccion;
    public static Clipboard clipboard;
    public static Transferable transferable;
    public static DataFlavor dataflavor;

    // STATIC MODIFICT
    public static Keyboard kb;
    // String ruta = "C:\\Users\\Johan Mora\\workspace\\Sikuli\\Imagenes\\";

    public static File Obj_Archivo;
    public static File Obj_Carpeta;
    public static String Str_Nombre_Archivo = "ScreenShot_";
    public static String Str_Fecha = "";
    public static String Str_Ruta = "";
    public static String Str_Error = "";
    public static String Str_Ruta_ScreenShot = "";
    public static SimpleDateFormat Dt_Fecha;

    public static String[][] arrayChar;

}
