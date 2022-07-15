import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTests2 {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    }

    @Test
    public void tableHW3(){
        List<WebElement> elements = wd.findElements(By.tagName("button"));
        List<WebElement> elements2 = wd.findElements(By.xpath("//button"));

        WebElement element1 = wd.findElement(By.id("root"));
        WebElement element1_2 = wd.findElement(By.xpath("//*[@id='root']"));

        WebElement element2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element2_2 = wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']"));

        WebElement element3 = wd.findElement(By.cssSelector("#root"));
        WebElement element3_2 = wd.findElement(By.xpath("//div[@id='root']"));

        WebElement element4 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement element4_2 = wd.findElement(By.xpath("//div[@class='login_login__3EHKB']"));

        WebElement element5 = wd.findElement(By.cssSelector("a[href='/login']"));
        WebElement element5_2 = wd.findElement(By.xpath("//a[.='LOGIN']"));
        WebElement element5_3 = wd.findElement(By.xpath("//*[@class='active']"));

        WebElement element6 = wd.findElement(By.cssSelector("[href^='/l']"));
        WebElement element6_2 = wd.findElement(By.xpath("//*[starts-with(@href,'/l')]"));

        WebElement element7 = wd.findElement(By.cssSelector("[href*='og']"));
        WebElement element7_2 = wd.findElement(By.xpath("//*[contains(@href,'ogi')]"));

        WebElement element8 = wd.findElement(By.cssSelector("[href$='in']"));

        WebElement element9 = wd.findElement(By.cssSelector("[placeholder*='ss']"));
        WebElement element9_2 = wd.findElement(By.xpath("//input[contains(@placeholder,'ss')]"));

    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
