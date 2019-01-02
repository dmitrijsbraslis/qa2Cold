import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DefiTestRu {
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final String HOME_PAGE = "http://rus.delfi.lv";
    private String articleNameToCheck = "Воскресенье стало самым теплым 14 октября в истории метеонаблюдений";


    @Test
    public void checkFirstArticle() {
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver browser = new FirefoxDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE);
        //Find WebElement of the first article
        WebElement article = browser.findElement(ARTICLE_TITLE);
        //Check if this is correct article
        Assertions.assertEquals(articleNameToCheck, article.getText(), "This is not true Article!");

        WebDriverWait wait = new WebDriverWait(browser, 30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ARTICLE_TITLE));
    }
}
