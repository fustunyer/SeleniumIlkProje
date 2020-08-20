package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02Homework {
    /*
    1. Yeni bir class oluşturun :Homework
2. ChromeDriver’ı kullanarak facebook’a gidin ve sayfa başlığının(Page Title) “facebook” olup olmadığını doğrulayın,
        Değilse, doğru başlığı(Actual title) yazdırın.
3. Sayfa URL’sinin facebook içerip içermediğini(contains), Değilse doğru URL’yi(Actual url) yazdırın.
4. Ardından Navigate to https://www.walmart.com/
5. Walmart sayfa başlığının “Walmart.com” içerip içermediğini(contains) doğrulayın
6. Navigate back to facebook
7. Sayfayı yenileyin(refresh)
8. Maximize the window
9. Close the browser (edited)
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Fatih USTUNYER\\Downloads\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver webdriver =new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get("http://www.facebook.com");
        String sayfaTitle=webdriver.getTitle();
        if(sayfaTitle.equals("facebook")){
            System.out.println("title facebook");
        }else{
            System.out.println(sayfaTitle);
        }
        String sayfaUrl=webdriver.getCurrentUrl();
        if(sayfaUrl.contains("facebook")){
            System.out.println("Sayafa url facebook iceriyor");
        }else{
            System.out.println(sayfaUrl);
        }
        webdriver.navigate().to("https://www.walmart.com/");
        String sayfaBasligi=webdriver.getTitle();
        System.out.println(sayfaBasligi.toLowerCase().contains("Walmart.com"));
        webdriver.navigate().back();
        webdriver.navigate().refresh();
        webdriver.quit();




    }
}
