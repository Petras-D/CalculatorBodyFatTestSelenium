
package TFTTeamBuilder.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
public class MainTest {
    protected  WebDriver chrome;
    @BeforeMethod
    public void chromeup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("http://clymer.altervista.org/bmi/");
        Thread.sleep(200);


    }


}
