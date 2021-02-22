package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {

    private WebDriver driver;
    private By figurebox = By.className("figure");
    private By boxcaption = By.className("figcaption");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    public Figurecaption hoveroverfigure(int index){

        WebElement figure = driver.findElements(figurebox).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new Figurecaption(figure.findElement(boxcaption));
    }

    public class Figurecaption{
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public Figurecaption(WebElement caption){
            this.caption = caption;
        }

        public boolean iscaptiondisplayed(){
            return caption.isDisplayed();
        }

        public String gettitle(){
            return caption.findElement(header).getText();
        }

        public String getlink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getlinktext(){
            return caption.findElement(link).getText();
        }
    }
}
