package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatih USTUNYER\\Downloads\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http://amazon.com");
        String sayfaBasligi=webDriver.getTitle();//Car kelimesi amazon.com title in icinde var mi yok mu?
        if(sayfaBasligi.toLowerCase().contains("book")){
            System.out.println("books kelimesi var. "+sayfaBasligi);
        }else {
            System.out.println("books kelimesi gecmiyor. "+sayfaBasligi);
        }
        webDriver.quit();
        // if - else
        // for döngüsü
        // foreach
        // nesne oluşturma
        // methodlar
    }
}
