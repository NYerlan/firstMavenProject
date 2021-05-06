package zoniAyotree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class studentsFile {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:/nyerlan/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://zoni0-my.sharepoint.com/:x:/r/personal/ynurgaliyev_zoni_edu/_layouts/15/Doc.aspx?sourcedoc=%7B350DB8AE-9A11-430B-B060-FC75A3E55452%7D&file=Summary%20April.xlsx&action=default&mobileredirect=true");

        /*
        1. Input login ynurgaliyev --> Next
        2. Input password $Yn674511 --> Next
        3. Click Enter
        4. Find first ID --> Copy cell
         */
    }

}
