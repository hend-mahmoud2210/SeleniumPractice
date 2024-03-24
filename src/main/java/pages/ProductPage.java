package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    public ProductPage() {
        this.driver = driver;
    }

    private By productPrice = By.className("inventory_details_price");

    public By getProductPrice() {
        return productPrice;
    }
}




