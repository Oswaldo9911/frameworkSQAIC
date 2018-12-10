/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author SQA
 */
public class GetDriver {

    public static WebDriver driver;
    public static WebElement Elemento;
    public static Point point;

    public WebDriver getDriver() {
        return driver;
    }

    
    public WebDriver setDriver() {
        return this.driver = driver;
    }

}
