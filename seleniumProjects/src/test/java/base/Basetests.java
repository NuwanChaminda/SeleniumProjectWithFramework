package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utills.EventReporter;
import utills.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Basetests {
    private EventFiringWebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//till 30 seconds this wait to load page
        //driver.manage().timeouts().pageLoadTimeout()
          goHome();
          setCookie();
        driver.get("https://the-internet.herokuapp.com/"); //open url
        driver.manage().window().maximize();//change window to maximize
        homePage =new HomePage(driver);
        //driver.manage().window().setSize(new Dimension( 250,300));//change window size customly


       // List<WebElement> links= driver.findElements(By.tagName("a"));//get webelement count with tag a
      //  System.out.println(links.size());//count the tags

        //WebElement inputsLink = driver.findElement(By.linkText("Inputs")); //select the way of find element
       // inputsLink.click();//do click on element selected on above
        //exc01
       // WebElement inputsLinkexc0100 = driver.findElement(By.linkText("Shifting Content")); //select the way of find element
       // inputsLinkexc0100.click();//do click on element selected on above
       // WebElement inputsLinkexc0101 = driver.findElement(By.linkText("Example 1: Menu Element")); //select the way of find element
       // inputsLinkexc0101.click();//do click on element selected on above
      // List<WebElement> menus= driver.findElements(By.tagName("li"));//find elements related to list and assign

        //System.out.println(menus.size());//print the elements
        //exc01 close

       // System.out.println(driver.getTitle()); //get the title of the web page
        //driver.close();//close window without quit session

    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
homePage=new HomePage(driver);

    }
@AfterClass
public void tearDown(){
  // driver.quit();// quite session
        
}
@AfterMethod
public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE==result.getStatus()){
            var camera=(TakesScreenshot)driver;
            File screenshot=camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/"+result.getName()+".png"));
            }catch (IOException e){
                e.printStackTrace();

            }
            //   System.out.println("Screenshot Taken: "+screenshot.getAbsolutePath()); //send to defalt path


        }

}

public WindowManager getWindowManager(){
        return new WindowManager(driver);

}
private ChromeOptions getChromeOptions(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.setHeadless(true);
        return options;


}
private void setCookie(){
        Cookie cookie=new Cookie.Builder("tau","123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);

}

}