package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    //constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //elements
    private By addToCart = By.className("btn_primary");
    private String productName = "Sauce Labs Bike Light";
    private By productLink = By.xpath("//div[text()=\""+productName+"\"]");
    private By productPrice = By.className("inventory_details_price");

    private By header = By.xpath("//div[@class=\"header_secondary_container\"]");


    public void selectSpecificProduct (){
        driver.findElement(productLink).click();
    }
    public By getHeader() {
        return header;
    }
}
