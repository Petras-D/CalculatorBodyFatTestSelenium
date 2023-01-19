package Page;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
public class PageMain {
    @FindBy(name="weightfield")
    public WebElement Weight;

    @FindBy(name="feetfield")
    public WebElement Feetfield;

    @FindBy(name="inchfield")
    public WebElement InchField;
    @FindBy(name="waistfield")
    public WebElement Waist;
    @FindBy(name="agefield")
    public WebElement Age;
    @FindBy(name = "calcbutton")
    public WebElement calculate;

    public PageMain(WebDriver driver) throws IOException {
        PageFactory.initElements(driver, this);

    }


    public static double round(double value) {
        int precision = 2;
        BigDecimal bigDecimal = new BigDecimal(value);
        bigDecimal = bigDecimal.setScale(precision, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
    public void setWeight(double weightinKG)
    {
        double weightinlbs =weightinKG*2.2;


        Weight.clear();
        Weight.sendKeys(String.valueOf( round(weightinlbs)));


    }

    public void setFeetfield(double feetfieldincm) {
       double feetfieldinft=feetfieldincm*30.48;
       Feetfield.clear();
       Feetfield.sendKeys(String.valueOf(round(feetfieldinft)));
    }

    public void setInchField(  double inchFieldincm) {
 double inchFieldinCal=inchFieldincm*0.3937;
 InchField.clear();
 InchField.sendKeys(String.valueOf(round(inchFieldinCal)));
    }

    public void setWaist(double  waistincm) {
  double  waistInCal=waistincm*0.3937;
  Waist.clear();
  Waist.sendKeys(String.valueOf(round(waistInCal)));
    ;
    }

    public void setAge(int age) {
      Age.clear();
      Age.sendKeys(String.valueOf(age));
    }
    public void Calculate(){
        calculate.click();
    }
}
