package lekcija7;

import lekcija7.pages.ArticlePage;
import lekcija7.pages.BaseFunc;
import lekcija7.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DelfiCommentTest {
    BaseFunc baseFunc = new BaseFunc();
    private final String HOME_PAGE = "rus.delfi.lv";

    @Test
    public void commentCheck() {
        baseFunc.goToURL(HOME_PAGE);

        HomePage homePage = new HomePage(baseFunc);
        Integer commentCount = homePage.getCommentCountById(1);
        ArticlePage articlePage = homePage.goToArticle(1);

        Integer articlePageComments = articlePage.getComments();
        Assertions.assertEquals(commentCount, articlePageComments, "Wrong comment count on article page!");
    }
}
