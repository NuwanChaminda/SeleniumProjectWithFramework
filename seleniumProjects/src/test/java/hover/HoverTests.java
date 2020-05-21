package hover;

import base.Basetests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

public class HoverTests extends Basetests {
    @Test
    public void testHoverUser1(){
       var hoversPage= homePage.clickHovers();
        var caption= hoversPage.hoverOverFigure(1);
       assertTrue(caption.isCaptionDiaplayed(),"Caption not displayed");
       assertEquals(caption.getTitle(),"name: user1","Caption Title incorrect");
       assertEquals(caption.getLinkText(),"View profile","Link text not correct");
       assertTrue(caption.getLink().endsWith("/users/1"),"Link Incorrect");

    }
}
