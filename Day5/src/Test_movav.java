import org.openqa.selenium.By;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_movav {
    @Test
    public void testOpen() {
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10,0);
        driver.get("https://movavi.id/ru/login.html");
        driver.findElement(By.xpath("//*[@id=\"emailLogin\"]")).sendKeys("maadslayer@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"passwordLogin\"]")).sendKeys("Morozov617539s");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[5]/button")).click();
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.id("loaderWrapper"))));
        driver.findElement(By.cssSelector(".d-md-inline")).click();
        driver.findElement(By.linkText("Мои данные")).click();
    }
}

