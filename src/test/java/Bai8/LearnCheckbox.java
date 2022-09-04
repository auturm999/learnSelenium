package Bai8;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LearnCheckbox extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.anhtester.com/basic-checkbox-demo.html");
        WebElement icheckbox = driver.findElement(By.id("isAgeSelected"));

        Boolean b_check = icheckbox.isSelected();
        if (b_check == false)
        {
            icheckbox.click();
        }
        //muti select
//        driver.findElement(By.xpath("//label[normalize-space()='Option 1']/child::input")).click();
//        driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
        List<WebElement> listCheckbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]//div[@class='checkbox']//input"));
        System.out.println(listCheckbox.size());
        for(int i=0;i<listCheckbox.size();i++)
        {
            listCheckbox.get(i).click();
            System.out.println(listCheckbox.get(i).isSelected());
        }

        closeDriver();

    }
}
