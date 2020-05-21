package dropdown;

import base.Basetests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends Basetests {
    @Test
    public void testSelectedOption(){

       var dropDownPage= homePage.clickDropDown();
       String option="Option 1";
       dropDownPage.SelectFromDropDown(option);
      var selectedOptions= dropDownPage.getSelectedOptions();
assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
assertTrue(selectedOptions.contains(option),"Option not Selected");
    }
}
