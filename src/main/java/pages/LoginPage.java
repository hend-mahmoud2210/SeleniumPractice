package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

    private WebDriver driver;

    //constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    //elements
    private By userNameField = By.id("user-name");
    private By pwField = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorBtn = By.className("error-button");

    //Actions
    public void login(String username, String pw){
        driver.findElement(userNameField).sendKeys(username);
        driver.findElement(pwField).sendKeys(pw);
        driver.findElement(loginBtn).click();
    }
    public By getErrorBtn() {
        return errorBtn;
    }
}

