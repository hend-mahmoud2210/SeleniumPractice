package testSelenium;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class TestPrice extends BaseTest {

    String expectedPrice = "$9.99";

    String VALID_USERNAME = "standard_user";

    String VALID_PASSWORD = "secret_sauce";


    @Test
    public void testPriceIsMatchingExpected() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.login(VALID_USERNAME , VALID_PASSWORD);
        homePage.selectSpecificProduct();
        ProductPage productPage = new ProductPage();
        String actualValue = driver.findElement(productPage.getProductPrice()).getText();
        Assert.assertEquals(actualValue, expectedPrice);
    }

    @Test
    public void addToCart(){

    }
}


