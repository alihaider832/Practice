package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygPage {

    private WebDriver driver;
    private String frameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");

    public WysiwygPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToEditArea(){
        driver.switchTo().frame(frameID);
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        swtitchToMainPage();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        swtitchToMainPage();
    }

    public void swtitchToMainPage(){
        driver.switchTo().parentFrame();
    }
}
