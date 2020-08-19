package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Homework {
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
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("http://tr-tr.facebook.com");
        String sayfaTitle=webDriver.getTitle();
        System.out.println(sayfaTitle);
        if(sayfaTitle.equals("facebook")){
            System.out.println("title dogru");
        }else{
            System.out.println("dogru baslik: facebook");
        }
        String sayfaUrl=webDriver.getCurrentUrl();
        System.out.println(sayfaUrl);
        if(sayfaUrl.equals("tr-tr.facebook.com")){
            System.out.println("Url dogru");
        }else{
            System.out.println("dogru url:www.facebook.com");
        }
        webDriver.navigate().to("http://www.walmart.com");
        String sayfaBasligi=webDriver.getTitle();
        System.out.println(sayfaBasligi.contains("walmart.com"));
        webDriver.navigate().back();
        webDriver.navigate().refresh();
        webDriver.manage().window().maximize();
        webDriver.quit();








    }

}
