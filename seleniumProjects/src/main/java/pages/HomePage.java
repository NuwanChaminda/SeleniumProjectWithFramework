package pages;

import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver; //calling webdriver
   // private By formAuthenticationLink= By.linkText("Form Authentication"); //create element
  // private By formAuthenticationLink= By.linkText();

    public HomePage(WebDriver driver){  //create constructor to keep driver working within the class
this.driver=driver;

    }
    public LoginPage ClickFormAuthentication(){ //create separate action method for click within LoginPage class
//driver.findElement(formAuthenticationLink).click(); //click on the element created on main class
      clickLink("Form Authentication");
return new LoginPage(driver);
    }
    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);

    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);


    }
    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);

    }

    public AlertPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertPage(driver);

    }

public ForgetPasswordPage clickForgetPassword(){
        clickLink("Forgot Password");
return new ForgetPasswordPage(driver);

}
public fileUploadPage ClickFileUpload(){
        clickLink("File Upload");
        return new fileUploadPage(driver);

}

public contextExcersicePage ClickContextMenu(){
        clickLink("Context Menu");
        return new contextExcersicePage(driver);


}

public WYSIWYGEditorPage ClickWYSIWYGEditorPage(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);

}
public NestedFramesPage ClickNestedFrame(){
        clickLink("Nested Frames");
        return new NestedFramesPage(driver);

}
public  LargeAndDeepDomPage ClickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
}

public DynamicLoadingPage ClickDynamicLoadingPage(){
        clickLink("Dynamic Loading");
        return  new DynamicLoadingPage(driver);

}
public InfiniteScrollPage clickInfiniteScrollPage(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);

}
public JavaScriptExcersicePage clickMuiltipleValues(){
        clickLink("Dropdown");
        return new JavaScriptExcersicePage(driver);

}
public MultipleWindowPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowPage(driver);

}


    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }
}
