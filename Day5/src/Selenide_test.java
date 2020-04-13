import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Selenide_test{
    @Test
    public void testTitle(){
        open("http://demo.guru99.com/test/newtours/");
        $(By.xpath("//*[@id=\"site-name\"]/a")).shouldHave(text("Demo Site"));
        System.out.println("test passed");
    }
}