package ru.iCRM;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.Keys.ENTER;

public class Google extends WebDriverSettings {
    @Test
    public void Google() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElementByName("q").sendKeys("Fusion-Tech");
        driver.findElementByName("q").sendKeys(ENTER);
        System.out.println("Finish");
        driver.quit();
    }
    }
//click. - нажатие на кнопку
//sendkeys - ввод текста/нажатие конкретной кнопки (с клавы)
//driver - вызов функции браузера
//get - переход на страницу
//findElement - поиск элемента
//sout - вывод в консоли
//extends - наследование


//    String loginString = driver.findElement(By.xpath("")).getText();
//    assertTrue(loginString.contains("Stage"));