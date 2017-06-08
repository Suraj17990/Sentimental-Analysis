package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by suraj on 5/30/17.
 */
public class GuiController {
    public WebDriver driver;
    public void initializeBrowser(String browserName, String platformName){
        switch (browserName){
            case "chrome" :System.setProperty("webdriver.chrome.driver","src/main/resources/"+platformName+"/chromedriver");
                            driver = new ChromeDriver();
        }
    }

    /*public static void main(String[] args) {
        GuiController gc = new GuiController();
        gc.initializeBrowser("chrome","mac");
    }*/
}
