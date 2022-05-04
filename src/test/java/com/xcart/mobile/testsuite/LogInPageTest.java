package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.HomePage;
import com.xcart.mobile.pages.TopMenuTest;
import com.xcart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPageTest extends TestBase {

    HomePage homePage = new HomePage();
    TopMenuTest loginPage = new TopMenuTest();

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome to X-Cart Demo Store!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page  displayed");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){

    }

}
