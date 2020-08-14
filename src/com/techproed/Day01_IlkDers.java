package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
       //Java projemize chromedriver i tanittik
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Fatih USTUNYER\\Downloads\\Selenium Dependencies\\drivers\\chromedriver.exe");
       //selenium ile ilgili ilk kodumuzu yazdik]
        //webDriver object i olusturarark chrome driveri kullanilabilir hale getirdik
        WebDriver webDriver=new ChromeDriver();
        //driverimiza google.com gitmesini soyledik
        webDriver.get("http://www.google.com");

        //driverimizla acik olan pencereyi kapaitir
        //webDriver.close();

        //driverimizi(chrome) komple kapatiyor.
        //webDriver.quit();




    }
}
