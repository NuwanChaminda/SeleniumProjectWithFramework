package alerts;

import base.Basetests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FileUploadTest extends Basetests {
    @Test
    public void testFileUpload(){
        var uploadPage=homePage.ClickFileUpload();
        uploadPage.uploadFile("C:\\seleniumProjects\\resources\\chromedriver.exe");
       // assertEquals(uploadPage.getResultText(),"chromedriver.exe");
        assertTrue(uploadPage.getResultText().contains("chromedriver.exe"),"File not uploade");


    }
}
