package tests;

import base.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DashboardPage;

public class DashboardTest extends BaseTest {
    private WebDriver driver;
    private DashboardPage dashboardPage;

    @BeforeClass
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("http://example.com/login");
        LoginPage loginPage = new LoginPage(driver);
        dashboardPage = loginPage.login("validUser", "validPassword");
    }

    @Test
    public void testDashboardElements() {
        Assert.assertTrue(dashboardPage.isWelcomeMessageDisplayed(), "Dashboard validation failed: Welcome message is not visible.");
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
