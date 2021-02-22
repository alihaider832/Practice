package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernamefield = By.id("username");
    private By passwordfield = By.id("password");
    private By loginbutton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUsername(String username){
        driver.findElement(usernamefield).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordfield).sendKeys(password);
    }

    public SecureAreaPage clickloginbutton(){
        driver.findElement(loginbutton).click();
        return new SecureAreaPage(driver);
    }
}
