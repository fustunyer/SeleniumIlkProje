package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Fatih USTUNYER\\Downloads\\Selenium Dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver=new ChromeDriver();

        //driverin tam ekran olmasini sagliyor
        webDriver.manage().window().maximize();

        //driverimiza google gitmesini soyledik
        webDriver.get("http://www.google.com");

        //get komutu ile ayni islemi yapan method navigate().to()
        webDriver.navigate().to("http://www.amazon.com");

        //webDriver.navigate().back() komutu bir onceki sayfaya geri donmeye yariyor.
        webDriver.navigate().back();

        //webDriver.navigate().forward() methodu geri geldigimiz sayfaya tekrar ileri gitmrmizi saglor.
        webDriver.navigate().forward();

        //navigate().refresh() sayfayi yeniler
        webDriver.navigate().refresh();












    }



}
