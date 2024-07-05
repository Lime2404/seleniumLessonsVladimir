package com.solveva.study.selenium.seleniumlessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ElementsPage {

    public static WebDriver driver;

    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }

    @FindBy(xpath = "//ul[@class='menu-list']")
    private WebElement elements;

    @FindBy(xpath = "//div[contains(@class, 'element-group')][1]//li[contains(@id, 'item-')]")
//    @FindBy(xpath = "//div[@class=element-group]")
    private List<WebElement> eleList;

    public List<WebElement> getElementsList() {
        return eleList;
    }
}
