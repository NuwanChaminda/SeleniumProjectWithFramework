package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class contextExcersicePage {
    private WebDriver driver;




    public contextExcersicePage(WebDriver driver){
        this.driver=driver;

    }
    public void RightClick(){

        Actions actions=new Actions(driver);
        WebElement elementLocation=driver.findElement(By.id("hot-spot"));
       actions.contextClick(elementLocation).perform();


    }
    public void RightClickAnother(String PathFor){

        Actions actions=new Actions(driver);
        WebElement elementLocation1=driver.findElement(By.id(PathFor));
        actions.contextClick(elementLocation1).perform();

    }

    public String alertGetMessage(){
        return  driver.switchTo().alert().getText();

    }
    public  void ClickOkButton(){
        driver.switchTo().alert().accept();

    }

    }


