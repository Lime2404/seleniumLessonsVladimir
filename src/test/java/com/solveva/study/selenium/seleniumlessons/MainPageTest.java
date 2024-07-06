package com.solveva.study.selenium.seleniumlessons;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    private ElementsPage elementsPage;  // инициализируем страницу и ниже передаем в ней драйвер как указано в конструкторе

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://www.jetbrains.com/");
//        driver.get("https://demoqa.com/");
        driver.get("https://demoqa.com/elements");

//        mainPage = new MainPage(driver);
        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver); // передача драйвера
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

//    @Test
//    public void search() {
//        mainPage.searchButton.click();
//
//        WebElement searchField = driver.findElement(By.cssSelector("[data-test='search-input']"));
//        searchField.sendKeys("Selenium");
//
//        WebElement submitButton = driver.findElement(By.cssSelector("button[data-test='full-search-button']"));
//        submitButton.click();
//        if(submitButton.isDisplayed()){
//            submitButton.click();
//        }
//        WebElement searchPageField = driver.findElement(By.cssSelector("input[data-test='search-input']"));
//        assertEquals("Selenium", searchPageField.getAttribute("value"));
//    }
//
//    @Test
//    public void toolsMenu() {
//        mainPage.toolsMenu.click();
//
//        WebElement menuPopup = driver.findElement(By.cssSelector("div[data-test='main-submenu']"));
//        assertTrue(menuPopup.isDisplayed());
//    }
//
//    @Test
//    public void navigationToAllTools() {
//        mainPage.seeDeveloperToolsButton.click();
//        mainPage.findYourToolsButton.click();
//
//        WebElement productsList = driver.findElement(By.id("products-page"));
//        assertTrue(productsList.isDisplayed());
//        assertEquals("All Developer Tools and Products by JetBrains", driver.getTitle());
//    }


    @Test
    public void verifyElementPageEntities() throws InterruptedException {
//        String[] expectedList = {"Text Box", "Check Box", "Radio Button", "Web Tables", "Buttons", "Links", "Broken Links - Images", "Upload and Download", "Dynamic Properties"};
        String[] expectedList = {"Text Box", "Check Box", "Radio Button", "Web Tables", "Buttons", "Links", "Broken Links - Images", "Upload and Download", "Dynamic Properties"};
        List<String> actualList = elementsPage.getElementsList().stream().map(WebElement::getText).collect(Collectors.toList());
//        wait(10000);
//        List<WebElement> elements1 = driver.findElements(By.xpath("//div[contains(@class, 'element-group')][1]//li[contains(@id, 'item-')]")).get(0).isDisplayed();
//        Boolean elements1 = driver.findElements(By.xpath("//div[contains(@class, 'element-group')][1]//li[contains(@id, 'item-')]")).get(0).isDisplayed();
//        System.out.println(elements1);
        System.out.println("Expected: " + Arrays.stream(expectedList).collect(Collectors.toList()) );
        System.out.println("Actual: " + actualList);
//        Assertions.assertArrayEquals(Arrays.stream(expectedList).collect(Collectors.toList()), actualList);
        Assertions.assertArrayEquals(expectedList, actualList.toArray());
//        Assertions.assertArrayEquals(Arrays.stream(expectedList).collect(Collectors.toList()), actualList);

//        List<String> actualList = elements1.stream().map(WebElement::getText).collect(Collectors.toList());
//        Assertions.assertArrayEquals(expectedList, actualList.toArray());
    }

}
