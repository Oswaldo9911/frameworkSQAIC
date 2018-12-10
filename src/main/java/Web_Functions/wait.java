/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import org.openqa.selenium.By;

/**
 *
 * @author SQA
 */
public class wait {

    public void waitId(String IdValueElemento, String espera) throws Exception {
        try {
            int numEspera = Integer.parseInt(espera);
            driver.findElement(By.id(IdValueElemento)).wait(numEspera);
            if (IdValueElemento.equals("")) {

            }
        } catch (InterruptedException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void waitName(String IdValueElemento, String espera) throws Exception {
        try {
            int numEspera = Integer.parseInt(espera);
            driver.findElement(By.name(IdValueElemento)).wait(numEspera);
        } catch (InterruptedException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void waitClassName(String IdValueElemento, String espera) throws Exception {
        try {
            int numEspera = Integer.parseInt(espera);
            driver.findElement(By.className(IdValueElemento)).wait(numEspera);

        } catch (InterruptedException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void waitXpath(String IdValueElemento, String espera) throws Exception {
        try {
            int numEspera = Integer.parseInt(espera);
            driver.findElement(By.xpath(IdValueElemento)).wait(numEspera);
        } catch (InterruptedException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void waitLinkText(String IdValueElemento, String espera) throws Exception {
        try {
            int numEspera = Integer.parseInt(espera);
            driver.findElement(By.linkText(IdValueElemento)).wait(numEspera);
        } catch (InterruptedException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void waitPartianLinkText(String IdValueElemento, String espera) throws Exception {
        try {
            int numEspera = Integer.parseInt(espera);
            driver.findElement(By.partialLinkText(IdValueElemento)).wait(numEspera);
        } catch (InterruptedException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void waitTagName(String IdValueElemento, String espera) throws Exception {
        try {
            int numEspera = Integer.parseInt(espera);
            driver.findElement(By.tagName(IdValueElemento)).wait(numEspera);

        } catch (InterruptedException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void waitCssSelector(String IdValueElemento, String espera) throws Exception {
        try {
            int numEspera = Integer.parseInt(espera);
            driver.findElement(By.cssSelector(IdValueElemento)).wait(numEspera);
        } catch (InterruptedException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void waitId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
