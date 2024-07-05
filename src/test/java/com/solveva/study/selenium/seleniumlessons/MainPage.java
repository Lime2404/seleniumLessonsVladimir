package com.solveva.study.selenium.seleniumlessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.jetbrains.com/
public class MainPage {
//    @FindBy(xpath = "//*[@data-test-marker='Developer Tools']")
//    public WebElement seeDeveloperToolsButton;
//
//    @FindBy(xpath = "//*[@data-test='suggestion-action']")
//    public WebElement findYourToolsButton;
//
//    @FindBy(xpath = "//div[@data-test='main-menu-item' and @data-test-marker = 'Developer Tools']")
//    public WebElement toolsMenu;
//
//    @FindBy(css = "[data-test='site-header-search-action']")
//    public WebElement searchButton;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='category-cards']")
    public WebElement categoryCards;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][1]")
    public WebElement elements;

//    public void clickOnElements() {
//        elements.click(); // вынести в отдельный класс, так как не везде нужны;
//    }
}
