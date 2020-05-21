package javascript;

import base.Basetests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaScriptExcersiceTest extends Basetests {
    @Test
    public void clickDropdownOptions(){
       var Javascriptpage= homePage.clickMuiltipleValues();
       Javascriptpage.MakeDropdownMuiltipleSelectable();
        Javascriptpage.selectoption2();
        String option2textget=Javascriptpage.getOption2Text();
        assertEquals(option2textget,"Option 2","Incorrect");
       Javascriptpage.selectoption1();
String option1textget=Javascriptpage.getOption1Text();
        assertEquals(option1textget,"Option 1","Incorrect");


    }
}
