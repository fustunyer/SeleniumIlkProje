package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Fatih USTUNYER\\Downloads\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");
        //ilk webelementini buluyoruz.id kulanaak bulduk
        WebElement signInLinki=driver.findElement(By.id("sign-in"));
        // buldugumuz webelementi tikladik
        signInLinki.click();
        WebElement emailkutusu=driver.findElement(By.id("session_email"));
        emailkutusu.sendKeys("testtechproed@gmail.com");
        WebElement sifreKutusu=driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");
        WebElement girisButonu=driver.findElement(By.name("commit"));
        girisButonu.click();
        String baslik=driver.getTitle();
        if(baslik.equals("Address Book")){
            System.out.println("Giriş Başarılı.");
        }else{
            System.out.println("Giriş Başarısız.");
        }






    }
}
