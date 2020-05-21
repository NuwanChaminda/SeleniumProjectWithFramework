package wait;

import base.Basetests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends Basetests {
@Test
    public void testWaitUntillHidden(){
    var loadingpage=homePage.ClickDynamicLoadingPage().clickExample1();
    loadingpage.ClickStartButton();
   loadingpage.SelectLoading();
    assertEquals(loadingpage.getLoadedText(),"Hello World!","Loaded text incorrect");

}
    @Test
    public void testWaitVisiblity(){
    var loadingPage1=homePage.ClickDynamicLoadingPage().clickExample2();
    loadingPage1.ClickStart();
   loadingPage1.waitTextLoaded();
    assertEquals(loadingPage1.getLoadedText(),"Hello World!","Text not loaded");

    }

}
