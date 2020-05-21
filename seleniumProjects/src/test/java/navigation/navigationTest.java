package navigation;

import base.Basetests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class navigationTest extends Basetests {
    @Test
    public void testNavigator(){

        homePage.ClickDynamicLoadingPage().clickExample1();
       getWindowManager().goBack();
       getWindowManager().refreshPage();
     getWindowManager().goForward();
      getWindowManager().goTo("https://www.google.com/");

    }
    @Test
    public void  testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");

    }
    @Test
    public void testSwitchClickCTRL(){
        homePage.ClickDynamicLoadingPage().clickCTRLWindowsManegement();
       String text= getWindowManager().switchToTabAfterClick("https://the-internet.herokuapp.com/dynamic_loading/2");
assertEquals("Page not Loaded","Start",text);
    }
}
