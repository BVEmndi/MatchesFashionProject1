package MatchesFashionGroupId;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 22-03-2017.
 */
public class MatchesFasBrowserFactory {
    public static WebDriver driver;

    public MatchesFasBrowserFactory() {

        PageFactory.initElements(driver, this);
       // pageFactory.initElements(driver, page: this);
    }

    public void openBrowser() throws Throwable {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("C:\\JavaProject1\\MatchesFashionProject1\\src\\test\\resources\\config.properties");

        properties.load(fileInputStream);

        FirefoxDriverManager.getInstance().setup();
        ChromeDriverManager.getInstance().setup();

        //System.setProperty("webdriver.chromedriver.driver", "cromedriver.exe");
        //System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");

        String url = properties.getProperty("url");
        String browser = properties.getProperty("browser");

        if ("chrome".matches(browser)) {
            this.driver = new ChromeDriver();
        } else if ("firefox".matches(browser)) {
            this.driver = new FirefoxDriver();
        }
        //driver.get("https://www.google.com");
       // driver.get("http://www.matchesfashion.com/");
//        driver.get("http://www.matchesfashion.com/search/?text=handbag%3A%3AallCategories%3AWomens#");
        driver.get(url);
        driver.get("http://www.matchesfashion.com/");
        //driver.navigate().to("http://www.matchesfashion.com/womens");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void closeBrowser()
    {
//        driver.quit();
    }
}



