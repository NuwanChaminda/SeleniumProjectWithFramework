package HorizontalSlider;

import base.Basetests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends Basetests {
    @Test
    public void testHorizontalSlider(){
        var sliderclick=homePage.clickHorizontalSlider();
        sliderclick.clickonSlider();
        sliderclick.enterArrows(Keys.ARROW_RIGHT);
        sliderclick.enterArrows(Keys.ARROW_RIGHT);
        sliderclick.enterArrows(Keys.ARROW_RIGHT);


    }
}
