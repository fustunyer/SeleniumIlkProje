package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatih USTUNYER\\Downloads\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://google.com");
        String sayfa1Title=webDriver.getTitle();
        System.out.println(sayfa1Title);
        webDriver.get("http://www.youtube.com");
        String sayfa2Title=webDriver.getTitle();
        String sayfa2Url=webDriver.getCurrentUrl();
        System.out.println(sayfa2Title);
        System.out.println(sayfa2Url);
        webDriver.navigate().back();
        String sayfa1Url=webDriver.getCurrentUrl();
        System.out.println(sayfa1Url);
        webDriver.quit();







    }
}
