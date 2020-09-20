package com.codebase;

import com.beforesuite.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class TestBase extends Helper {

    public static void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void navigateToURL(String url) {
        driver.get(url);
    }

    public static boolean click(String xpath) { driver.findElement(By.xpath(xpath)).click();
        return true;
    }

    public static void type(String xpath, String value) {
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }

//    public String divText = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();

    public static String getTextFromElement(String xpath) {
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public static boolean labelText(String xpath){driver.findElement(By.xpath(xpath)).getText().trim();
        return false;
    }
    public boolean checkForText() {

        boolean isVisible = false;

        try {
            // Start by searching the element first.  You can search by many ways.  eg. css, id, className etc..
            WebElement element = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
            System.out.println("Element found");
            // Check if the found element has the text you want.
            if(element.getText().equals("[//@id='message']")) {
                System.out.println("Text inside element looks good");
                isVisible = true;
            } else {
                System.out.println("Text does not match");
            }
        } catch (NoSuchElementException e) {
            // the method findElement throws an exception.
            System.out.println("Element not found");
        }

        return isVisible;

    }

    public boolean checkLogOut() {

        boolean isVisible = false;

        try {
            // Start by searching the element first.  You can search by many ways.  eg. css, id, className etc..
            WebElement element = driver.findElement(By.xpath("//*[@id=\"flash-messages\"]"));
            System.out.println("Element found");
            // Check if the found element has the text you want.
            if(element.getText().equals("[//@id='message']")) {
                System.out.println("Text inside element looks good");
                isVisible = true;
            } else {
                System.out.println("Text does not match");
            }
        } catch (NoSuchElementException e) {
            // the method findElement throws an exception.
            System.out.println("Element not found");
        }

        return isVisible;

    }
    public boolean checkErrorLOgin() {

        boolean isVisible = false;

        try {
            // Start by searching the element first.  You can search by many ways.  eg. css, id, className etc..
            WebElement element = driver.findElement(By.xpath("//*[@id=\"flash-messages\"]"));
            System.out.println("Element found");
            // Check if the found element has the text you want.
            if(element.getText().equals("[//@id='message']")) {
                System.out.println("Text inside element looks good");
                isVisible = true;
            } else {
                System.out.println("Text does not match");
            }
        } catch (NoSuchElementException e) {
            // the method findElement throws an exception.
            System.out.println("Element not found");
        }

        return isVisible;

    }

}
