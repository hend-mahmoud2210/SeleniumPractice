package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOuInfoPage {

    private WebDriver driver;

    public CheckOuInfoPage(WebDriver driver){
        this.driver = driver;
    }

    private By firstNameField = By.id("first-name");

    private By lastNameField = By.id("last-name");

    private By zipCodeField = By.id("postal-code");

    private By continueBtn = By.xpath("//input[@class=\"btn_primary cart_button\"]");


    public void fillTheData(){
        driver.findElement(firstNameField).sendKeys("hend");
        driver.findElement(lastNameField).sendKeys("mahmoud");
        driver.findElement(zipCodeField).sendKeys("124");
        driver.findElement(continueBtn).click();

    }




}
