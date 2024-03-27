package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private By productPrice = By.className("inventory_details_price");

    private By addToCartBtn = By.xpath("//button[@class=\"btn_primary btn_inventory\"]");

    private By cartIcon = By.xpath("//span[@class=\"fa-layers-counter shopping_cart_badge\"]");

    public By getProductPrice() {
        return productPrice;
    }

    public void clickOnAddToCart(){
        driver.findElement(addToCartBtn).click();
    }

    public void clickonCartIcon(){
        driver.findElement(cartIcon).click();
    }
}




