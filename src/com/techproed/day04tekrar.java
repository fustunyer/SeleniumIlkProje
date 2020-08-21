package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day04tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Fatih USTUNYER\\Downloads\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com");
        WebElement serch=driver.findElement(By.name("q"));
        serch.sendKeys("computer");
        serch.submit();
        WebElement gorseller= driver.findElement(By.partialLinkText("Görseller"));
        gorseller.click();


//  Syntex "//tagname[@attribute name= ‘value’]"
//
//Here
//
//               // Denotes the current node
//Tagname          : Define the tagname you are referencing to locate the element.
//Attribute Value : The attribute of the define tag through which you wish to narrow down the search.
//Value           : Represents the value of any chosen attribute.





    }
}
