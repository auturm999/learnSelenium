package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public static void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Cho
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));// Thoi gian load trang

    }
  public static void closeDriver()
  {
      try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
          throw new RuntimeException();

      }
      if(driver !=null)
      driver.quit();

  }

}
