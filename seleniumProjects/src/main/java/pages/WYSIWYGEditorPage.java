package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorIframeId="mce_0_ifr";
    private  By decreaseIndentButton=By.xpath("//div[@id='mceu_12']");
private By textArea= By.id("tinymce");
    public WYSIWYGEditorPage(WebDriver driver){
        this.driver=driver;

    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToTheMainArea();
    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToTheMainArea();
    }
public void decreseIndexButton(){
        driver.findElement(decreaseIndentButton).click();

}
public String getTextFromEditor(){
    switchToEditArea();
   String text= driver.findElement(textArea).getText();
    switchToTheMainArea();
    return text;

}
    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);

    }
    private void switchToTheMainArea(){
        driver.switchTo().parentFrame();

    }

}
