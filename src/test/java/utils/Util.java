package utils;

import base.GuiController;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;

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
    @DataProvider(name = "testdata")
    public Object[][] readData() {
        Object[][] everything=null;
        try (FileInputStream inputStream = new FileInputStream("src/main/resources/inputdata")) {
            String result = IOUtils.toString(inputStream);
            System.out.println(result);
            String[] Array = result.split("\n");
            everything = new Object[Array.length][1];
            for (int i =0; i<Array.length; i++){
                everything[i][0]=Array[i];
                System.out.println(everything[i][0]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return everything;
    }
}
