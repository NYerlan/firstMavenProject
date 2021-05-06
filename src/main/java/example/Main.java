package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/nyerlan/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");


        WebElement input = driver.findElement(By.className("gLFyf"));
        input.sendKeys("weather\n");

//        WebElement button = driver.findElement(By.xpath(
//                "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
//        button.click();

        WebElement result = driver.findElement(By.xpath(
                "//*[@id=\"rso\"]/div[2]/div/div/div/div/div/div[1]/a/h3"));

        Assert.assertEquals(result.getText(),
                "National and Local Weather Radar, Daily Forecast, Hurricane ...");


        Thread.sleep(3000);
        driver.quit();

         }
}
