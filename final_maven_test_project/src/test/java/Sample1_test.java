import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample1_test {
    String baseUrl = "http://demo.guru99.com/test/newtours/";
    public WebDriver driver;

    @BeforeClass
    public void openSite() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void printTitle() {
        System.out.println("Chrome title = " + driver.getTitle());
    }

    @AfterClass
    public void closeSite(){driver.quit();}


}

