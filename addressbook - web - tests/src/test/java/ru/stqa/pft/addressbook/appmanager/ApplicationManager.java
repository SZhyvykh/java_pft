package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;


import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
    protected WebDriver driver;
    private SessionHelper sessionHelper;
    private CreateContactHelper createContactHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public void init() {
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        if(this.browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
        }
        else if(this.browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver();
        }
        else if(this.browser.equals(BrowserType.IE)) {
            driver = new InternetExplorerDriver();
        }


        baseUrl = "http://localhost/group.php";
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get(baseUrl);
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        createContactHelper = new CreateContactHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }


    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }



    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;

    }

    public CreateContactHelper getCreateContactHelper() {
        return createContactHelper;
    }

}
