import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample2_test {
    String baseUrl = "http://demo.guru99.com/test/login.html";
    WebDriver driver = new ChromeDriver();
    WebElement email;
    WebElement password;

    @BeforeClass
    public void openSite(){
        driver.get(baseUrl);
    }

    @Test
    public void email_pswrd_input(){
        // Get the WebElement corresponding to the Email Address(TextField)
        email = driver.findElement(By.id("email"));

        // Get the WebElement corresponding to the Password Field
        password = driver.findElement(By.name("passwd"));

        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkjl");

        System.out.println("Text Field Set");
    }

    @Test
    public void empty_values(){
        email.clear();
        password.clear();
        System.out.println("Text Field Cleared");
    }

    @Test
    public void submit(){
       //Find the submit button
        WebElement login = driver.findElement(By.id("SubmitLogin"));

        // Using click method to submit form
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkjl");
        login.click();
        System.out.println("Login Done with Click");

        //using submit method to submit the form. Submit used on password field
        driver.get(baseUrl);
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");
        driver.findElement(By.id("SubmitLogin")).submit();
        System.out.println("Login Done with Submit");
    }

    @AfterClass
    public void closeSite(){driver.close();}

}