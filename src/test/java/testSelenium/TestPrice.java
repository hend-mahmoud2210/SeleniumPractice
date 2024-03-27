package testSelenium;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

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
        ProductPage productPage = new ProductPage(driver);
        String actualValue = driver.findElement(productPage.getProductPrice()).getText();
        Assert.assertEquals(actualValue, expectedPrice);
    }

    @Test
    public void addToCart(){

    }

    public static class TestPurchase extends BaseTest {

        String VALID_USERNAME = "standard_user";

        String VALID_PASSWORD = "secret_sauce";

        @Test
        public void testValidPurchase(){
            LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);
            ProductPage productPage = new ProductPage(driver);
            YourCartPage yourCartPage = new YourCartPage(driver);
            CheckOuInfoPage checkOutPage = new CheckOuInfoPage(driver);
            CheckOutOverViewPage checkOutOverViewPage = new CheckOutOverViewPage(driver);
            FinishPage finishPage = new FinishPage();
            loginPage.login(VALID_USERNAME , VALID_PASSWORD);
            homePage.selectSpecificProduct();
            productPage.clickOnAddToCart();
            productPage.clickonCartIcon();
            yourCartPage.clickOnCheckOutBtn();
            checkOutPage.fillTheData();
            checkOutOverViewPage.clickOnFinishBtn();
            boolean thanksmessageIsDisplaed = driver.findElement(finishPage.getThanksMessage()).isDisplayed();
            Assert.assertTrue(thanksmessageIsDisplaed);

        }
    }
}


