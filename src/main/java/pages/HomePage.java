package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clicklink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        clicklink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoverPage clickHover(){
        clicklink("Hovers");
        return new HoverPage(driver);
    }

    public KeyPressesPage clickKeypresses(){
        clicklink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertPage clickjavascriptalert(){
        clicklink("JavaScript Alerts");
        return new AlertPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clicklink("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygPage clickWysiwyg(){
        clicklink("WYSIWYG Editor");
        return new WysiwygPage(driver);
    }
    private void clicklink (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
