package tests;

import base.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DashboardPage;

public class LoginTest extends BaseTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("http://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        DashboardPage dashboardPage = loginPage.login("validUser", "validPassword");
        Assert.assertTrue(dashboardPage.isWelcomeMessageDisplayed(), "Login failed: Welcome message not displayed.");
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
