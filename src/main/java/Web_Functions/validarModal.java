/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import org.openqa.selenium.JavascriptExecutor;

/**
 *
 * @author SQA
 */
public class validarModal {

    public void validarModal() throws InterruptedException {
        try {
            for (int i = 0; i < 10; i++) {
                JavascriptExecutor e = (JavascriptExecutor) driver;
                String estado = (String) e.executeScript("return document.getElementById('loading').style.display");
                if (estado.equals("block")) {
                    Thread.sleep(5000);
                } else {
                    System.out.println("Cargando...");
                }
            }
        } catch (Exception e) {
            System.out.println("Error Poliedro: " + e.getMessage());
        }
    }
}
