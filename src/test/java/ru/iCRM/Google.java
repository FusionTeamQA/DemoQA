package ru.iCRM;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.Keys.ENTER;

public class Google extends WebDriverSettings {
    //проверка авторизации
    @Test
    public void Google() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElementByName("q").sendKeys("Fusion-Tech");
        driver.findElementByName("q").sendKeys(ENTER);
        System.out.println("Finish");
        driver.quit();
    }
    }


//    String loginString = driver.findElement(By.xpath("")).getText();
//    assertTrue(loginString.contains("Stage"));