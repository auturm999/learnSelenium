package Bai7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BasicWebdriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://anhtester.com/");
//        WebDriverManager.firefoxdriver().setup();
//        driver=new FirefoxDriver();
//        driver.get("https://anhtester.com/");
        driver.navigate().to("https://anhtester.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
         driver.manage().window().maximize();

         Thread.sleep(1000);
      //  driver.navigate().to("https://hrm.anhtester.com/");
        driver.findElement(By.id("btn-signup")).click();
    // Điều hướng về lịch sử trang trước đó
//        driver.navigate().back();
//
//// Làm mới trang hiện tại
//        driver.navigate().refresh();
//
//// Điều hướng đến trang tiếp sau
//        driver.navigate().forward();
//
//// Get the title of the page
//        String title = driver.getTitle();
//// Get the current URL
//        String url = driver.getCurrentUrl();
//// Get the current page HTML source
//        String html = driver.getPageSource();
       // driver.quit();
//        System.out.println(html);
//        System.out.println(html.contains("placeholder=\"Email\""));
        Cookie newCookie=new Cookie("number","123456");
        driver.manage().addCookie(newCookie);
        newCookie.getValue();
        System.out.println(driver.manage().getCookieNamed("number"));

    }
}
