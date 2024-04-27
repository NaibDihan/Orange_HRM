import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyJunit {
    WebDriver driver;


    @BeforeAll
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @DisplayName("Visit Website")
    @Test
    public void visitWebsite() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void clickMenu(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        List<WebElement> txtBox = driver.findElements(By.className("oxd-input"));
        txtBox.get(0).sendKeys("Admin");
        txtBox.get(1).sendKeys("admin123");

        driver.findElements(By.className("oxd-button")).get(0).click();
        driver.findElements(By.className("oxd-main-menu-item")).get(1).click();
        driver.findElements(By.className("oxd-button")).get(2).click();
        driver.findElements(By.className("oxd-switch-input")).get(0).click();



        List<WebElement> txtBox2 = driver.findElements(By.className("oxd-input"));
        txtBox2.get(1).sendKeys("Naib");
        txtBox2.get(3).sendKeys("Uddin");
        txtBox2.get(5).sendKeys("NaibUddin");
        txtBox2.get(6).sendKeys("naibuddin1");
        txtBox2.get(7).sendKeys("naibuddin1");

        driver.findElements(By.className("oxd-button")).get(1).click();

        driver.findElements(By.className("oxd-main-menu-item")).get(1).click();

        //driver.findElements(By.className("oxd-autocomplete-text-input")).get(0).sendKeys("NaibUddin");
        driver.findElements(By.className("oxd-main-menu-item")).get(5).click();

        driver.findElements(By.className("orangehrm-tabs-item")).get(1).click();

        driver.findElements(By.className("oxd-input")).get(7).sendKeys("0177777777");

        driver.findElements(By.className("oxd-button")).get(0).click();




    }
}



