package com.browserstack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        String baseUrl = "http://orderapp-pos2-uat.ddns.net/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get(baseUrl + "/ca_en/customer/account/login/");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("932000111");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("0000");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.linkText("Registration")).click();
        driver.findElement(By.cssSelector("#submenu-online_ordering > li > a")).click();
        driver.findElement(By.linkText("Order History")).click();
        driver.findElement(By.linkText("Performance")).click();
        driver.findElement(By.linkText("Team")).click();
        driver.findElement(By.linkText("Product Catalog")).click();
        driver.findElement(By.linkText("Smart Center")).click();
        driver.findElement(By.linkText("Feedback Form")).click();
        driver.findElement(By.linkText("Customer Service")).click();
        driver.findElement(By.linkText("Hi, CA Ann")).click();
        driver.findElement(By.linkText("Personal Center")).click();
        driver.findElement(By.linkText("Hi, CA Ann")).click();
        driver.findElement(By.linkText("Change Password")).click();
        driver.findElement(By.linkText("Terms And Conditions")).click();
        driver.findElement(By.linkText("Privacy Policy")).click();
        driver.findElement(By.linkText("Statement of Typical Participant Earnings")).click();
        driver.findElement(By.linkText("Hi, CA Ann")).click();
        driver.findElement(By.linkText("Logout")).click();
   }
}
