import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class ListExamplesRu {

    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final String HOME_PAGE = "http://rus.delfi.lv";
    private WebDriver browser;

    @Test
    public void listExample() {
        List<WebElement> webArticles = new ArrayList<WebElement>();
        List<String> myArticles = new ArrayList<String>();
        myArticles.add("Из первых уст: 8 наблюдений о разнице жизни в Риге и Санкт-Петербурге");
        myArticles.add("Троицкий: Латвия и Эстония ошиблись, обращаясь с русскоязычными жителями высокомерно");
        myArticles.add("В Даугавпилсской думе фактически развалилась коалиция; \"Согласие\" возвращает влияние");
        myArticles.add("В Латвии возникла нехватка вакцин для взрослых против дифтерии");
        myArticles.add("Трамп заявил о выходе из договора с Россией о ракетах средней и малой дальности");


        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE);

        webArticles = browser.findElements(ARTICLE_TITLE);

        Assertions.assertFalse(webArticles.isEmpty(), "There is no articles");

        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(webArticles.get(i).getText(), myArticles.get(i), "Articles is not equals");
        }

        String string1 = "";
        String string2 = "";

        Assertions.assertTrue(string1.equals(string2), "");
        Assertions.assertTrue(string1.contains(string2), "");
    }

    @AfterEach
    public void closeBrowser() {
        browser.close();
    }
}
