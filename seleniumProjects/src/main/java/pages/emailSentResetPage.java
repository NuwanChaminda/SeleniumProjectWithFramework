package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class emailSentResetPage {
    private WebDriver driver;

private By ResetSendMessage=By.cssSelector("#content");
    public emailSentResetPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getResetMessage(){
        return driver.findElement(ResetSendMessage).getText();


    }


}
