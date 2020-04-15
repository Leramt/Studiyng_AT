import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample3_test{
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);
    String baseUrl = "http://demo.guru99.com/test/upload/";
    String myDir="/Users/valeriatarasova/Desktop/filepath/test.rtf";
    WebElement uploadElement;
    WebElement resultElement;
    WebElement resultText;


    @BeforeClass
    public void openSite(){
        driver.get(baseUrl);
    }

    @Test
    public void download_file() {
        uploadElement = driver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys(myDir);
        driver.findElement(By.id("terms")).click();
        resultElement = driver.findElement(By.cssSelector("#res"));
        resultText = driver.findElement(By.cssSelector("#res > center"));
        System.out.println(resultText.getText().contains(" successfully"));
    }

    @Test
     public void send_file() {
        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        System.out.println(resultText.getText().contains(" successfully"));

        wait.until(ExpectedConditions.attributeContains(resultElement, "style", "display: block"));

        System.out.println(resultText.getText().contains(" successfully"));
    }

    @AfterClass
    public void closeSite() {
        driver.close();
    }

}
