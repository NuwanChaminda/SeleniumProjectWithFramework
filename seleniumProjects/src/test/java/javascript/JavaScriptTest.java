package javascript;

import base.Basetests;
import org.testng.annotations.Test;

public class JavaScriptTest extends Basetests {
    @Test
    public void testScrollToTable(){
        homePage.ClickLargeAndDeepDom().scrollToTable();


    }

    @Test
    public void testScrollInfinite(){
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);

    }

}
