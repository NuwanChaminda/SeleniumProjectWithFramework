package keys;

import base.Basetests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTests extends Basetests {
    @Test
    public void testBackspace(){
        var keyPage=homePage.clickKeyPresses();
        keyPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE");


    }
    @Test
    public void testPi(){
        var keyPage=homePage.clickKeyPresses();
        keyPage.enterPi();

    }
}
