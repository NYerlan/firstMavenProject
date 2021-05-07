import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZoniTest {
    /*
    To find if the text "Standard English Program" is exist inside
    the "Standard English Program" picture (as a link)
    on "Program and Courses" page at www.zoni.edu
     */

    @Test
    public void ClassCheck() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", ("D://IntelIJ_projects//chromedriver.exe/"));
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.zoni.edu/");

        WebElement programsButton = driver.findElement(By.xpath("//*[@id=\"menu-item-11815\"]/a"));
        programsButton.click();

        driver.findElement(By.xpath("//*[@id=\"panel-10867-1-1-0\"]/div/div/a/img")).click();

        WebElement txtStandardProgram = driver.findElement(By.xpath("//*[@id=\"panel-19455-0-0-0\"]/div/h3"));
        Assert.assertEquals(txtStandardProgram.getText(),"Standard English Program");

        driver.quit();
    }

}
