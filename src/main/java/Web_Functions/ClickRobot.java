/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Functions;

import static Web_Functions.GetDriver.driver;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author SQA
 */
public class ClickRobot {

    public void ClickRobotId(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.id(IdValueElemento));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        x = x + (element.getSize().getWidth() / 2);
        y = y + (element.getSize().getHeight() / 2);

        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void ClickRobotName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.name(IdValueElemento));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        x = x + (element.getSize().getWidth() / 2);
        y = y + (element.getSize().getHeight() / 2);

        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void ClickRobotClassName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.className(IdValueElemento));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        x = x + (element.getSize().getWidth() / 2);
        y = y + (element.getSize().getHeight() / 2);

        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void ClickRobotXpath(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.xpath(IdValueElemento));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        x = x + (element.getSize().getWidth() / 2);
        y = y + (element.getSize().getHeight() / 2);

        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void ClickRobotLinkText(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.linkText(IdValueElemento));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        x = x + (element.getSize().getWidth() / 2);
        y = y + (element.getSize().getHeight() / 2);

        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void ClickRobotPartianLinkText(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.partialLinkText(IdValueElemento));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        x = x + (element.getSize().getWidth() / 2);
        y = y + (element.getSize().getHeight() / 2);

        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void ClickRobotTagName(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.tagName(IdValueElemento));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        x = x + (element.getSize().getWidth() / 2);
        y = y + (element.getSize().getHeight() / 2);

        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void ClickRobotCssSelector(String IdValueElemento) throws Exception {
        WebElement element = driver.findElement(By.cssSelector(IdValueElemento));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        x = x + (element.getSize().getWidth() / 2);
        y = y + (element.getSize().getHeight() / 2);

        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }
}
