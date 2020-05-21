package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By horizontalBar= By.xpath("//input[@type='range']");

    public HorizontalSliderPage(WebDriver driver){
        this.driver=driver;

    }
    public  void enterArrows(Keys button){

        driver.findElement(horizontalBar).sendKeys(button);
    }
    public void clickonSlider(){
        driver.findElement(horizontalBar).click();


    }
}
