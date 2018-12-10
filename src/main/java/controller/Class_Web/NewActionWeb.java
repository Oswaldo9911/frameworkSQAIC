/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Class_Web;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Web_Functions.GetDriver;

/*Nueva import*/
/**
 *
 * @author Usuario
 */
public class NewActionWeb {

    WebDriver driver;
    GetDriver aw;
    static WebElement Elemento;
    static Point point;

    public NewActionWeb() {
        aw = new GetDriver();
        driver = aw.getDriver();
    }

    public void dfgfdg(String gf) {
        System.out.println("Metodo");
    }

}//endClass

