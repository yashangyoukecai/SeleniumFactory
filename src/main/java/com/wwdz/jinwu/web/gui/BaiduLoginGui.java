package com.wwdz.jinwu.web.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Author: jinwu
 * @Description:
 * @Date: create in 3/17/21 5:58 PM
 */
public class BaiduLoginGui {


    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://www.baidu.com");
        WebElement searchInput = webDriver.findElement(By.name("wd"));
        searchInput.sendKeys("玩物得志");
        searchInput.submit();
    }
}


