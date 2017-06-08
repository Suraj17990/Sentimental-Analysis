package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Util;

import java.util.List;

/**
 * Created by suraj on 5/30/17.
 */
public class TestData extends Util {
    @Test
    public void testDataSet(){
        //navigate to the site
        driver.get("http://blackbird.dcc.ufmg.br:1210/");
        //maximize the browser window
        driver.manage().window().maximize();
        //find the input test field
        WebElement input = driver.findElement(By.xpath("//input[@class='form-control']"));
        //check if it is displayed and then enter the text which you want to test
        if(input.isDisplayed()){
            input.sendKeys("Hello");
        } else {
            System.out.println(input + "not displayed");
            Assert.assertEquals(input,"not displayed");
        }
        //find the analyse button
        WebElement analyse = driver.findElement(By.xpath("//span[@class='input-group-btn']"));
        //check if it is displayed and then enter the text which you want to test
        if(analyse.isDisplayed()){
            analyse.click();
        }else {
            System.out.println(analyse + "not displayed");
            Assert.assertEquals(analyse,"not displayed");
        }

        try {
            Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }

        WebElement table = driver.findElement(By.tagName("table"));
        if(table.isDisplayed()) {
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            String tableData = "";
            for (WebElement row : rows) {
                String rowData = row.getText();
                System.out.println(rowData+"\n");
                /*List<WebElement> cells = row.findElements(By.tagName("td"));
                for (WebElement cell : cells) {
                    rowData = rowData + cell.getText() + "\t";
                }
                System.out.println(tableData = tableData + rowData + "\n");*/
            }
        }else
        {
            System.out.println("unable to read table data");
        }
    }
}
