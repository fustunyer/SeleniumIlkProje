package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_02TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatih USTUNYER\\Downloads\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://youtube.com");
        String sayfaTitle=webDriver.getTitle();
        if(sayfaTitle.toLowerCase().contains("video")){
            System.out.println("video kelimesi var");
        }else {
            System.out.println("video kelimesi yok"+sayfaTitle);
        }

        webDriver.quit();
    }
}
