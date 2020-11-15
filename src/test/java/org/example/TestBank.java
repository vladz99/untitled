package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBank {
    @Test

    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(); //Инициализируем веб драйвер, т.к. будем писать тесты в хроме
        driver.get("https://calculator888.ru/");

        WebElement nav = driver.findElement(By.id("nav"));
        nav.findElement(By.cssSelector("[href=\"/calculator-procentov/\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("social_bottom_ya")));

        driver.findElement(By.id("ch1_1")).sendKeys("15");
        driver.findElement(By.id("ch2_1")).sendKeys("2000");
        driver.findElement(By.id("button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("itog_1")));
    }
    @Test
    public void twoTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(); //Инициализируем веб драйвер, т.к. будем писать тесты в хроме
        driver.get("https://calculator888.ru/");

        WebElement nav = driver.findElement(By.id("nav"));
        nav.findElement(By.cssSelector("[href=\"/generator-sluchajnyh-chisel/\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vov")));

        driver.findElement(By.id("mngn")).click();
        driver.findElement(By.id("mngn_1")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bov")));

        driver.findElement(By.id("spch")).sendKeys("15 11 10 9 7 6");
        driver.findElement(By.id("genr")).click();
    }
    @Test
    public void freeTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(); //Инициализируем веб драйвер, т.к. будем писать тесты в хроме
        driver.get("https://calculator888.ru/");

        WebElement nav = driver.findElement(By.id("nav"));
        nav.findElement(By.cssSelector("[href=\"/kalkulyator-prostoy/\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("main_centr_sod")));

        driver.findElement(By.id("lili1lilll")).sendKeys("15+5=");

    }
}