package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inputfield = By.id("file-upload");
    private By uploadbutton = By.id("file-submit");
    private By uploadedfiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadfile(String AbsolutePathOfFile){
        driver.findElement(inputfield).sendKeys(AbsolutePathOfFile);
        clickuploadbutton();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedfiles).getText();
    }

    public void clickuploadbutton(){
        driver.findElement(uploadbutton).click();
    }
}
