import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Sample1 {
    public static void main(String[] args) {

        WebDriver chromeDriver = new ChromeDriver();
        WebDriver safariDriver = new SafariDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        chromeDriver.get(baseUrl);
        safariDriver.get(baseUrl);

        System.out.println("Safari title = " + safariDriver.getTitle());
        System.out.println("Chrome title = " + chromeDriver.getTitle());
        safariDriver.quit();
        chromeDriver.quit();

        chromeDriver.close();
        safariDriver.close();
    }
}
