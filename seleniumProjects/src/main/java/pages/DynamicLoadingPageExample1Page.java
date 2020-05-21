package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPageExample1Page {
    private WebDriver driver;
    private By startButton= By.cssSelector("#start Button");     //"//div[@id='start']"
private By loadingIndicator=By.id("loading");
    private By loadedText=By.id("finish");
    public DynamicLoadingPageExample1Page(WebDriver driver){
        this.driver=driver;

    }
    public void ClickStartButton(){
        driver.findElement(startButton).click();


    }
    public void SelectLoading(){
     //   WebDriverWait wait=new WebDriverWait(driver,5);
      //  wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        FluentWait wait=new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }
    public String getLoadedText(){
        return  driver.findElement(loadedText).getText();

    }
}
