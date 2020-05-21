package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fileUploadPage {
    private WebDriver driver;
    private  By inputField= By.id("file-upload");
    private By uploadButton=By.id("file-submit");
    private By resultTest=By.xpath("//div[@id='uploaded-files']");

    public fileUploadPage(WebDriver driver){
        this.driver=driver;

    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();

    }
    public void uploadFile(String AbsolutePathOfFile){
        driver.findElement(inputField).sendKeys(AbsolutePathOfFile);
        clickUploadButton();
    }
    public String getResultText(){
        return  driver.findElement(resultTest).getText();

    }
}
