package utills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.sound.midi.Soundbank;
import java.net.SocketOption;

public class WindowManager {
    private WebDriver driver;
    private  WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver=driver;
        navigate=driver.navigate();
    }
    public  void goBack(){
    //  navigate.back();
       navigate.back();

    }
    public void goForward(){
        navigate.forward();

    }
    public void refreshPage(){
        navigate.refresh();

    }
    public void goTo(String url){
        navigate.to(url);

    }
    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs :" + windows.size());
        System.out.println("Window handles:");
        windows.forEach(System.out::println);

        for (String window : windows){
            System.out.println("Switching to window:"+window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());
            if(tabTitle.equals(driver.getTitle())){
                break;

            }

        }
    }
    public String switchToTabAfterClick(String URLForThisPage){
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs :" + windows.size());
        System.out.println("Window handles:");
        windows.forEach(System.out::println);

        for (String window : windows){
            System.out.println("Switching to window:"+window);
            driver.switchTo().window(window);

            System.out.println("Current window URL: " + driver.getCurrentUrl());
            if(URLForThisPage.equals(driver.getCurrentUrl())){
                break;

            }





        }
        String text= driver.findElement(By.id("start")).getText();
        return text;
    }

}
