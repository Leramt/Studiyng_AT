import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class Sample4_test {
    String baseUrl = "http://demo.guru99.com/test/yahoo.html";
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void openSite(){driver.get(baseUrl);}

    @Test
    public void download_file() {
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");

        String wgetCommand = "wget -P /Users/valeriatarasova/Desktop/filepath/test --no-check-certificate " + sourceLocation;
        System.out.println(wgetCommand);
        try {
            Process exec = Runtime.getRuntime().exec(wgetCommand);
            int exitVal = exec.waitFor();
            System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }
    }

    @AfterClass
    public void closeSite(){driver.quit();}

}
