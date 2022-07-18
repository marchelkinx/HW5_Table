import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTests {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }

    @Test
    public void tableHW(){
        WebElement element = wd.findElement(By.xpath("//td[.='Mexico']"));
        WebElement element2 = wd.findElement(By.xpath("//td[.='Centro comercial Moctezuma']"));
        WebElement element3 = wd.findElement(By.cssSelector("tbody tr:nth-child(4) td:nth-child(1)"));
        String title = element.getText();
        Assert.assertEquals(title, "Mexico");
        Assert.assertTrue(title.contains("xic"));

    }

    @Test
    public void tableHW2(){
        List<WebElement> elements = wd.findElements(By.xpath("//body[1]/div[7]/div[1]/div[1]/table[1]/tbody[1]/tr"));
        System.out.println("Table rows = " + elements.size());

        List<WebElement> elements2 = wd.findElements(By.xpath("//table[@id='customers']//th"));
        System.out.println("Table columns = " + elements2.size());

        WebElement element = wd.findElement(By.xpath("//tbody/tr[3]"));
        System.out.println("Content of row3 = " + element.getText());

        List<WebElement> elements3 = wd.findElements(By.xpath("//tbody/tr/td[3]"));
        System.out.println("\\/Content of last column\\/");
        for (int j=0; j<=elements3.size()-1;j++) {
            System.out.println(elements3.get(j).getText());
        }
//        for (WebElement el : elements3) {
//            System.out.println(el.getText());
//        }

        List<WebElement> element4 = wd.findElements(By.xpath("//td[.='Philip Cramer']"));
        System.out.println("Number of row with name \"Philip Cramer\" = " + element4.size());

    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}