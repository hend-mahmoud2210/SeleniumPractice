package testSelenium;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class TestLogin extends BaseTest {

    //data
     String VALID_USERNAME = "standard_user";
     String VALID_PASSWORD = "secret_sauce";


    @Test
    public void testValidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(VALID_USERNAME, VALID_PASSWORD);
        HomePage homePage = new HomePage(driver);
        boolean headerIsDisplayed = driver.findElement(homePage.getHeader()).isDisplayed();
        Assert.assertTrue(headerIsDisplayed);
    }

    @Test
    public void testInvalidLogin(){
        LoginPage loginPage = new LoginPage(driver);
       loginPage.login("invaliduser" , "invalidpw");
       boolean errorIsDisplayed = driver.findElement(loginPage.getErrorBtn()).isDisplayed();
       Assert.assertTrue(errorIsDisplayed);
    }


}
