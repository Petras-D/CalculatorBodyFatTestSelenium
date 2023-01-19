package test;

import Page.PageMain;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.jar.Manifest;

public class test extends TFTTeamBuilder.Tests.MainTest {
    @Test
    public void CalculateYourBodyFat() throws IOException {

        PageMain Body=new PageMain(chrome);
        Body.setWeight(115);//waga
        Body.setWaist(105);//brzuszek
       Body.setFeetfield(185);//wzrost
       Body.setInchField(185);//wzrost

       Body.setAge(23);
       Body.Calculate();
    }
}
