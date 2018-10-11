import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DelfiFirstTest {
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");

    @Test
    public void delfiFirstTitleTest() {
        //Letting know the system where to find our driver
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        //Creating a new copy of driver to work with - opening Web Browser
        WebDriver driver = new FirefoxDriver();
        //Maximize browser window
        driver.manage().window().maximize();
        //Open the page
        driver.get("http://delfi.lv");

        //Setting an article name to check
        String articleToCheck = "'OlyBet' basketbola līga: LU - 'Kalev/Cramo'. Video tiešraide";

        //Searching web element by locator created before
        WebElement article = driver.findElement(ARTICLE_TITLE);
        //Getting text only from web element(Elements contains not oly the text but tags also)
        String articleText = article.getText();

        //Checking
        Assertions.assertEquals(articleToCheck, articleText, "Fatal Laura's error!");
    }
}
