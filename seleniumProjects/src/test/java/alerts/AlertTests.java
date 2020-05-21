package alerts;

import base.Basetests;
import org.testng.annotations.Test;

import java.security.PublicKey;

import static org.testng.Assert.*;

public class AlertTests extends Basetests {
    @Test
    public void testAcceptAlert(){
      var alertsPage=  homePage.clickJavaScriptAlerts();
       alertsPage.triggerAlert();
       alertsPage.alert_clickToaccept();
       assertTrue(alertsPage.getResult().contains("You successfuly clicked an alert"),"Not correct message");

    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage=homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text =alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertTrue(text.contains("I am a JS Confirm"),"Not correct text");
        assertTrue(alertsPage.getResult().contains("You clicked: Cancel"),"Not correct message");


    }
    @Test
    public void textSetInputInAlert(){
        var alertPage=homePage.clickJavaScriptAlerts();
alertPage.triggerPrompt();;
String text="TAU Rocks";
alertPage.alert_setInput(text);
alertPage.alert_clickToaccept();
assertEquals(alertPage.getResult(),"You entered: TAU Rocks","Results text incorrect");

    }

}
