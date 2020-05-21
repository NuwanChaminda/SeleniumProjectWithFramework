package frames;

import base.Basetests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class frameTest extends Basetests {
    @Test
    public void testWysiwyg(){
        var editorPage=homePage.ClickWYSIWYGEditorPage();
        editorPage.clearTextArea();
        String text1="Hello";
        String text2="World";
        editorPage.setTextArea(text1);
        editorPage.decreseIndexButton();
        editorPage.setTextArea(text2);

       String text= editorPage.getTextFromEditor();
       assertTrue(text.contains(text1+text2),"Not correctly done");

    }
}
