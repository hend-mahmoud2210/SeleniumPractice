package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {

    private WebDriver driver;

    private By checkOutBtn = By.xpath("//a[@class=\"btn_action checkout_button\"]");


    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCheckOutBtn(){
        driver.findElement(checkOutBtn).click();
    }
}
