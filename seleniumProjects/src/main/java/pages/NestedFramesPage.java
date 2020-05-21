package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String topFrame="frame-top";
private String leftFrame= "frame-left";
private By LeftFrameText=By.xpath("//body['LEFT']");
private String bottomFrame="frame-bottom";
private By BottomFrameText=By.xpath("//body['BOTTOM']");

    public NestedFramesPage(WebDriver driver){
        this.driver=driver;

    }
public void SwitchLeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
}
public void SwitchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);

}


public void SwitchToMainArea(){
        driver.switchTo().parentFrame();

}
public String getLeftFrameText(){
    SwitchLeftFrame();
    String leftText=driver.findElement(LeftFrameText).getText();
    SwitchToMainArea();
    SwitchToMainArea();
    return leftText;

}
public String getBottomFrameText(){
    SwitchToBottomFrame();
    String BottomText=driver.findElement(BottomFrameText).getText();
    SwitchToMainArea();
    return  BottomText;


}


}
