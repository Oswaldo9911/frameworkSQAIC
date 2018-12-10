/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

/**
 *
 * @author SQA
 */
public class waitSeconds {

    /**
     * Metodo que funciona para esperar para que cargue mejor el codigo
     *
     * @param segundos cantidad de tiempo en segundos que desea esperar
     * @throws java.lang.Exception
     */
    public void waitSeconds(int segundos) throws Exception {
        Thread.sleep(segundos * 1000);
    }
}
