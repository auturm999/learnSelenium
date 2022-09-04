package Bai8;

import common.BaseTest;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static dev.failsafe.internal.util.Assert.*;

public class LearnDropdownListStatic extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.anhtester.com/basic-select-dropdown-demo.html");
        Select select = new Select(driver.findElement(By.id("select-demo")));
        select.selectByValue("Monday");
        //muti-select
        System.out.println(select.getOptions().size());
        System.out.println(select.getFirstSelectedOption().getText());
       }
}
