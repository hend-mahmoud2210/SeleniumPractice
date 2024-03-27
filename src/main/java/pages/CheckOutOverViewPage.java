package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverViewPage {

    private WebDriver driver;

    public CheckOutOverViewPage(WebDriver driver) {
        this.driver = driver;
    }

    private By finishBtn = By.xpath("//a[@class=\"btn_action cart_button\"]");

    public void clickOnFinishBtn(){
        driver.findElement(finishBtn).click();
    }


}

