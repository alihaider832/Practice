package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    private WebDriver driver;
    private By triggeralertbutton = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerconfirmbutton = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerpromptbutton = By.xpath("//button[text()='Click for JS Prompt']");
    private By results = By.id("result");

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggeralert()
    {
        driver.findElement(triggeralertbutton).click();
    }

    public void triggerconfirm()
    {
        driver.findElement(triggerconfirmbutton).click();
    }

    public void triggerprompt(){
        driver.findElement(triggerpromptbutton).click();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void alert_clicktoaccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clicktodismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_gettext(){
        return driver.switchTo().alert().getText();
    }

    public String getresultText(){
        return driver.findElement(results).getText();
    }
}
