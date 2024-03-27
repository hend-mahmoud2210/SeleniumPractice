package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage {

    private WebDriver driver;

    private By thanksMessage = By.className("complete-header");


    public By getThanksMessage() {
    return thanksMessage;
    }
}