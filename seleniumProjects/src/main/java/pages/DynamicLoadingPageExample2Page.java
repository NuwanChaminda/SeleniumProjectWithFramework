package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPageExample2Page {
    private WebDriver driver;
    private By startButton= By.cssSelector("#start Button");
    private By loadingIndicator=By.id("loading");
    private By loadedText=By.cssSelector("#finish");

    public DynamicLoadingPageExample2Page(WebDriver driver){
        this.driver=driver;

    }
    public void ClickStart(){
        driver.findElement(startButton).click();

    }


    public void waitTextLoaded(){
        FluentWait wait=new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish")));

    }
    public String getLoadedText(){
        return  driver.findElement(loadedText).getText();

    }
}
