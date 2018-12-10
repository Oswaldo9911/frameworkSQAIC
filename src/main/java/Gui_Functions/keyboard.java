/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

import static Gui_Functions.GetGui.robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author SQA
 */
public class keyboard {

    public void enter() {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void escape() {
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }

    public void tab() {
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    public void backSpace() {
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
    }

    public void home() {
        robot.keyPress(KeyEvent.VK_HOME);
        robot.keyRelease(KeyEvent.VK_HOME);
    }

    public void end() {
        robot.keyPress(KeyEvent.VK_END);
        robot.keyRelease(KeyEvent.VK_END);
    }

    public void AvPag() {
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }

    public void RePag() {
        robot.keyPress(KeyEvent.VK_PAGE_UP);
        robot.keyRelease(KeyEvent.VK_PAGE_UP);
    }

    public void delete() {
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyPress(KeyEvent.VK_DELETE);
    }

    public void copy() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void cut() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyRelease(KeyEvent.VK_X);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void paste() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void selectAllA() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void selectAllE() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void findF() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void findB() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void next() {
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_ALT);
    }

    public void back() {
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_ALT);
    }

    public void closeTab() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void closeAll() {
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);
    }
}
