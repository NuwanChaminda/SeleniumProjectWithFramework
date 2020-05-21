package login;

import base.Basetests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import  static org.testng.Assert.*;

public class LoginTest extends Basetests { //inherited from BaseTest class
    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.ClickFormAuthentication(); //calls method clickFormAuthentication from Login page class
        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
       Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
               "Alert Test Incorrect");


    }
}
