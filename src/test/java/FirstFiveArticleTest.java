import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class FirstFiveArticleTest {
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");

    @Test
    public void testFiveArticles() {
        //Set up given titles to check
        List<String> givenArticles = new ArrayList<String>();
        givenArticles.add("Esam spēruši platu soli, lai Latvijā varētu izveidot valdību, lepojas 'Attīstībai/Par!'");
        givenArticles.add("'OlyBet' basketbola līga: 'Ogre' - 'Jēkabpils/SMScredit.lv'. Video tiešraide");
        givenArticles.add("KP piedāvātais modelis vairs nav iespējams, norāda Dzintars");
        givenArticles.add("Slaktiņu Krimas koledžā sarīkojis tās audzēknis");
        givenArticles.add("Mūžībā devies mūziķis un LTV raidījuma vadītājs Valters Frīdenbergs");

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://delfi.lv");

                //Find 5 elements
        List<WebElement> articles = driver.findElements(ARTICLE_TITLE);

        //Parbaude
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(givenArticles.get(i), articles.get(i).getText(), "Title Nr. " + (i+1) + " is not correct!");
        }

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(ARTICLE_TITLE));
    }
}
