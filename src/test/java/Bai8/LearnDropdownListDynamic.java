package Bai8;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LearnDropdownListDynamic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Select a Country']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Select a Country']/following-sibling::div//input")).sendKeys("Albania");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//em[normalize-space()='Albania']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Select a Category']/following-sibling::div//input")).sendKeys("Salons");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//em[normalize-space()='Salons']")).click();
        WebElement textDropdown=driver.findElement(By.xpath("//div[contains(@class,'chosen-container-active')]"));
        if(textDropdown.getText().equals("Salons"))
        {
                System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}
