package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Fatih USTUNYER\\Downloads\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        //e mail kutusuna  techproed.com yazdiralim
        WebElement mailKutusu=driver.findElement(By.id("email"));
        mailKutusu.sendKeys("techproed@gmail.com");

        WebElement sifreKutusu=driver.findElement(By.id("pass"));
        sifreKutusu.sendKeys("Test1234");

        WebElement loginButonu=driver.findElement(By.cssSelector("#u_0_b"));
        loginButonu.click();
        try {
            Thread.sleep(25000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        //sifreKutusu.submit();https://www.facebook.com/login/
        String loginSayfasi=driver.getCurrentUrl();
        System.out.println(loginSayfasi);

        if(loginSayfasi.contains("facebook.com/login/")){
            System.out.println("giris basarisiz");
        }else {
            System.out.println("giris basarili");
        }


        driver.quit();




    }
}
