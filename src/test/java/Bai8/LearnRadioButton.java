package Bai8;

import common.BaseTest;
import org.openqa.selenium.By;

public class LearnRadioButton extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.anhtester.com/basic-radiobutton-demo.html");
        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div/child::label[normalize-space()='Male']/input")).click();

    }
}
