package com.solveva.study.selenium.seleniumlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ElementsPage {

    public ElementsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
//для каждой страницы важно инициализировать драйвер

    @FindBy(xpath = "//div[@class='element-group']")
//    @FindBy(xpath = "//ul[@class='menu-list']")
//    @FindBy(xpath = "//div[contains(@class, 'header-wrapper') and cotains(style, 'background: rgb(108, 117, 125);']")
    public WebElement elements;

    @FindBy(xpath = "//div[contains(@class, 'element-group')][1]//li[contains(@id, 'item-')]")
//    @FindBy(xpath = "//div[@class=element-group]")
    public List<WebElement> elementList;

    public List<WebElement> getElementsList() {
        return elementList;
    }
    public void clickOnElements(){
        elements.click();
    }


}
