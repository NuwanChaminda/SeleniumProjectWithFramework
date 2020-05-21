package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
private WebDriver driver;
private By EmailField= By.id("email");
private By ResetButton=By.id("form_submit");


public ForgetPasswordPage(WebDriver driver){
    this.driver=driver;

}

public void setEmailField(String email){
    driver.findElement(EmailField).sendKeys(email);


}
public emailSentResetPage ClickResetButton(){
    driver.findElement(ResetButton).click();
    return new emailSentResetPage(driver);
}


}
