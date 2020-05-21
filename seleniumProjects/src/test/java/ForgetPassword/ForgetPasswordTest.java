package ForgetPassword;

import base.Basetests;
import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.ForgetPasswordPage;
import pages.HomePage;
import pages.emailSentResetPage;

public class ForgetPasswordTest extends Basetests {
    @Test
public void testSuccessfullReset(){
    ForgetPasswordPage forgetPasswordPage=homePage.clickForgetPassword();
    forgetPasswordPage.setEmailField("mr.nuwanchaminda@gmail.com");
        emailSentResetPage emailsentresetPage=forgetPasswordPage.ClickResetButton();
    Assert.assertTrue(emailsentresetPage.getResetMessage().contains("Your e-mail's been sent!"),
            "Not resetted Successfully");
       // Assert.assertEquals(emailsentresetPage.getResetMessage(),"Your e-mail's been sent!");

}

}

