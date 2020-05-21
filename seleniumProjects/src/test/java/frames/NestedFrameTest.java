package frames;

import base.Basetests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NestedFrameTest extends Basetests {
    @Test
    public void testNestedFrames(){
        var GotoNestedPage=homePage.ClickNestedFrame();
        String leftFrameText=GotoNestedPage.getLeftFrameText();
        String bottomFrameText=GotoNestedPage.getBottomFrameText();
        assertTrue(leftFrameText.contains("LEFT"),"Left Frame Text incorrect");
        assertTrue(bottomFrameText.contains("BOTTOM"),"bottom Frame Text incorrect");
    }
}
