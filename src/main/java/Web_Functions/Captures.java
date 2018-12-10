/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import static Web_Functions.GetDriver.point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

/**
 *
 * @author SQA
 */
public class Captures {

    public void crearCarpetasCapturas(File imagen, String date, String date2, String addName) throws IOException {
        String addNameFinal = addName.replaceAll("[^a-zA-Z0-9]+", "_");
        System.out.println("addName: " + addNameFinal);
        File directory = new File(System.getProperty("user.dir") + "\\Evidencia\\capturas\\");
        String strResultPath = directory + "\\" + "NOMBRE SUITE TEST";

        File f = new File(strResultPath);
        f.mkdirs();

        File f2 = new File(strResultPath + "\\" + date);
        f2.mkdirs();
        // Empieza a escribir el LOG
//        bw1 = new BufferedWriter(new FileWriter(htmlname1));
        FileUtils.copyFile(imagen, new File(f2.getAbsolutePath() + "\\" + "NOMBRE SUITE TEST" + "_" + addNameFinal + "_" + date2 + ".png"));
    }

    public void CaptureFullScreen(String DateToStr, String DateToStr2) throws Exception {
        File directory = new File(System.getProperty("user.dir") + "\\Evidencia\\");

        if (directory.isDirectory()) {
            //Toma la captura de imagen
            File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //Mueve el archivo a la carga especificada con el respectivo nombre
            crearCarpetasCapturas(imagen, DateToStr, DateToStr2, "full");
        } else {
            //Se lanza la excepcion cuando no encuentre el directorio
            throw new IOException("Error WEB (1008): No Fue Posible encontrar la ruta para almencear la captura de pantalla completa ::!");
        }
    }

    public void CaptureRegionScreenId(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {
        WebElement webElement = driver.findElement(By.id(IdValueElemento));   

        // Get entire page screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);

        // Get the location of element on the page
        point = webElement.getLocation();

        // Get width and height of the element
        int eleWidth = webElement.getSize().getWidth();
        int eleHeight = webElement.getSize().getHeight();

        // Crop the entire page screenshot to get only element screenshot
        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
        ImageIO.write(eleScreenshot, "png", screenshot);

        crearCarpetasCapturas(screenshot, DateToStr, DateToStr2, IdValueElemento);

    }

    public void CaptureRegionScreenName(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {
        WebElement webElement = driver.findElement(By.name(IdValueElemento));

        // Get entire page screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);

        // Get the location of element on the page
        point = webElement.getLocation();

        // Get width and height of the element
        int eleWidth = webElement.getSize().getWidth();
        int eleHeight = webElement.getSize().getHeight();

        // Crop the entire page screenshot to get only element screenshot
        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
        ImageIO.write(eleScreenshot, "png", screenshot);

        crearCarpetasCapturas(screenshot, DateToStr, DateToStr2, IdValueElemento);

    }

    public void CaptureRegionScreenclassName(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {
        WebElement webElement = driver.findElement(By.className(IdValueElemento));

        // Get entire page screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);

        // Get the location of element on the page
        point = webElement.getLocation();

        // Get width and height of the element
        int eleWidth = webElement.getSize().getWidth();
        int eleHeight = webElement.getSize().getHeight();

        // Crop the entire page screenshot to get only element screenshot
        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
        ImageIO.write(eleScreenshot, "png", screenshot);

        crearCarpetasCapturas(screenshot, DateToStr, DateToStr2, IdValueElemento);

    }

    public void CaptureRegionScreenxpath(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {

        WebElement webElement = driver.findElement(By.xpath(IdValueElemento));

        // Get entire page screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);

        // Get the location of element on the page
        point = webElement.getLocation();

        // Get width and height of the element
        int eleWidth = webElement.getSize().getWidth();
        int eleHeight = webElement.getSize().getHeight();

        // Crop the entire page screenshot to get only element screenshot
        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
        ImageIO.write(eleScreenshot, "png", screenshot);

        crearCarpetasCapturas(screenshot, DateToStr, DateToStr2, IdValueElemento);
    }

    public void CaptureRegionScreenlinkText(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {

        WebElement webElement = driver.findElement(By.linkText(IdValueElemento));

        // Get entire page screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);

        // Get the location of element on the page
        point = webElement.getLocation();

        // Get width and height of the element
        int eleWidth = webElement.getSize().getWidth();
        int eleHeight = webElement.getSize().getHeight();

        // Crop the entire page screenshot to get only element screenshot
        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
        ImageIO.write(eleScreenshot, "png", screenshot);

        crearCarpetasCapturas(screenshot, DateToStr, DateToStr2, IdValueElemento);

    }

    public void CaptureRegionScreenpartialLinkText(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {

        WebElement webElement = driver.findElement(By.partialLinkText(IdValueElemento));

        // Get entire page screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);

        // Get the location of element on the page
        point = webElement.getLocation();

        // Get width and height of the element
        int eleWidth = webElement.getSize().getWidth();
        int eleHeight = webElement.getSize().getHeight();

        // Crop the entire page screenshot to get only element screenshot
        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
        ImageIO.write(eleScreenshot, "png", screenshot);

        crearCarpetasCapturas(screenshot, DateToStr, DateToStr2, IdValueElemento);

    }

    public void CaptureRegionScreentagName(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {

        WebElement webElement = driver.findElement(By.tagName(IdValueElemento));

        // Get entire page screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);

        // Get the location of element on the page
        point = webElement.getLocation();

        // Get width and height of the element
        int eleWidth = webElement.getSize().getWidth();
        int eleHeight = webElement.getSize().getHeight();

        // Crop the entire page screenshot to get only element screenshot
        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
        ImageIO.write(eleScreenshot, "png", screenshot);

        crearCarpetasCapturas(screenshot, DateToStr, DateToStr2, IdValueElemento);

    }

    public void CaptureRegionScreencssSelector(String IdValueElemento, String DateToStr, String DateToStr2) throws Exception {

        WebElement webElement = driver.findElement(By.cssSelector(IdValueElemento));

        // Get entire page screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);

        // Get the location of element on the page
        point = webElement.getLocation();

        // Get width and height of the element
        int eleWidth = webElement.getSize().getWidth();
        int eleHeight = webElement.getSize().getHeight();

        // Crop the entire page screenshot to get only element screenshot
        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
        ImageIO.write(eleScreenshot, "png", screenshot);

        crearCarpetasCapturas(screenshot, DateToStr, DateToStr2, IdValueElemento);
    }
}
