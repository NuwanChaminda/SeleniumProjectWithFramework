package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
   // private String linkXpathFormat=".//a[contains(text(),'%s')";
   // private By link_Example1= By.xpath(String.format(linkXpathFormat,"Example 1"));
    private By link_Example1=By.xpath("//*[@id=\"content\"]/div/a[1]");
    private By link_Example2=By.xpath("//*[@id=\"content\"]/div/a[2]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;

    }
    public DynamicLoadingPageExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return  new DynamicLoadingPageExample1Page(driver);

    }
    public DynamicLoadingPageExample2Page clickExample2(){
        driver.findElement(link_Example2).click();
        return  new DynamicLoadingPageExample2Page(driver);

    }
    public void clickCTRLWindowsManegement(){
        Actions actions=new Actions(driver);
        WebElement elementLocation1=driver.findElement(link_Example2);
        actions.keyDown(Keys.CONTROL).click(elementLocation1).keyUp(Keys.CONTROL).perform();


    }


}
