package alerts;

import base.Basetests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.security.PublicKey;

import static org.testng.Assert.assertTrue;

public class contextExcersiceTest extends Basetests {

    @Test
    public void TestExcersiceContext(){
        var contextPage=homePage.ClickContextMenu();

       // contextPage.RightClick();
       contextPage.RightClickAnother("hot-spot");
        String textContext=contextPage.alertGetMessage();
        contextPage.ClickOkButton();
        assertTrue(textContext.contains("You selected a context menu"),"Not correct alert message");

    }
}
