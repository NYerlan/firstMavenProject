package zoniAyotree;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ZoniAyotreeStStatus {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/nyerlan/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://ayotree.com/HomepageTemplateMaster/Login/default.aspx?menu=&submenu=&MasterTeacherID=7198");

        WebElement inputLogin = driver.findElement(By.xpath("//*[@id=\"txtLogin\"]"));
        inputLogin.sendKeys("ynurgaliyev");
        Thread.sleep(3000);

        WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
        inputPassword.sendKeys("Zoni2020");
        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        loginButton.click();
        Thread.sleep(5000);

        driver.get("https://ayotree.com/MainMaster/StudentListEdit.aspx?menu=6&submenu=62");

        WebElement inputStId = driver.findElement(By.xpath("//*[@id=\"txtNameEmail\"]"));
        inputStId.sendKeys("84182");
        inputStId.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"haEditLink\"]")).click();

        Thread.sleep(5000);



        driver.quit();
    }
}
