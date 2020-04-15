import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidationDemo_test {
    String baseUrl = "http://demo.guru99.com/V1/index.php";
    WebDriver driver = new ChromeDriver();

    WebElement usernameControl;
    WebElement passwordControl;
    WebElement misc;
    WebElement userValidationMessage;
    WebElement passwordValidationMessage;

    @BeforeClass
    public void openSite(){
        driver.get(baseUrl);
    }

    @Test(priority = 1)
    public void getElements(){
        usernameControl = driver.findElement(By.name("uid"));
        passwordControl = driver.findElement(By.name("password"));
        misc = driver.findElement(By.cssSelector("body"));
        userValidationMessage = driver.findElement(By.id("message23"));
        passwordValidationMessage = driver.findElement(By.id("message18"));

        System.out.println(userValidationMessage.getAttribute("style"));
        System.out.println(passwordValidationMessage.getAttribute("style"));
    }

    @Test(priority = 2)
    public void clickElements(){
        usernameControl.click();
        passwordControl.click();
        misc.click();

        System.out.println(userValidationMessage.getAttribute("style"));
        System.out.println(passwordValidationMessage.getAttribute("style"));
    }

    @Test(priority = 3)
    public void enterEmaillPaswrd(){
        usernameControl.sendKeys("a");
        passwordControl.sendKeys("a");

        System.out.println(userValidationMessage.getAttribute("style"));
        System.out.println(passwordValidationMessage.getAttribute("style"));
    }

    @AfterClass
    public void closeSite(){driver.quit();}

}