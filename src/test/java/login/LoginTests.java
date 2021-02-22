package login;

import base.Tests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends Tests {

    @Test
    public void testloginsuccess(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickloginbutton();
        assertTrue(secureAreaPage.getstatusalert().contains("You logged into a secure area"),
                "Incorrect text");
    }
}
