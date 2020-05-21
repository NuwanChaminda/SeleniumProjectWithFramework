package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class JavaScriptExcersicePage {
    private WebDriver driver;
    private By dropdown=By.id("dropdown");
   private By option1= By.xpath("//option[@value=1]");
    private By option2= By.xpath("//option[@value=2]");
    private By option1selct=By.xpath("//option[@value=1][@selected='selected']");
    private By option2selct=By.xpath("//option[@value=2][@selected='selected']");

    public JavaScriptExcersicePage(WebDriver driver){
        this.driver=driver;

    }

    public void MakeDropdownMuiltipleSelectable(){
       // driver.findElement(dropdown).click();
        String script="document.getElementById('dropdown').setAttribute('multiple','')";
        var JSExecute=(JavascriptExecutor)driver;
        JSExecute.executeScript(script);

    }

    public void selectoption1(){
        driver.findElement(option1).click();


    }



    public void selectoption2(){

        driver.findElement(option2).click();

    }
    public String getOption1Text(){
        String option1Text=driver.findElement(option1selct).getText();
        return option1Text;

    }
    public String getOption2Text(){
        String option2Text=driver.findElement(option2selct).getText();
        return option2Text;

    }

}
