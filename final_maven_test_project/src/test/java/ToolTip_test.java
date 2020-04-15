import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolTip_test {
    String baseUrl = "http://demo.guru99.com/test/social-icon.html";
    WebDriver driver = new ChromeDriver();
    String expectedTooltip = "Github";
    String actualTooltip;
    WebElement github;

    @BeforeClass
    public void openSite(){
        driver.get(baseUrl);
    }

    @Test(priority = 1)
    public void findElement() {
        // Find the Github icon at the top right of the header
        github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));
    }

    @Test(priority = 2)
    public void getTitle(){
        actualTooltip = github.getAttribute("title");

        //Assert the tooltip's value is as expected
        System.out.println("Actual Title of Tool Tip = " + actualTooltip);
    }

    @Test(priority = 3)
    public void checkEqualty(){
        if(actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test Case Passed");
        }
    }

    @AfterClass
    public void closeSite(){driver.quit();}

}
