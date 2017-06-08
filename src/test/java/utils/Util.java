package utils;

import base.GuiController;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by suraj on 5/30/17.
 */
public class Util extends GuiController{
    @BeforeTest
    public void launchBrowser(){
        initializeBrowser("chrome","mac");
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
