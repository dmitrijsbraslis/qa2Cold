package lesson7;

import lesson7.pages.ArticlePage;
import lesson7.pages.BaseFunc;
import lesson7.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DelfiWebTest {
    private final String HOME_PAGE = "delfi.lv";
    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void delfiTest() {
        baseFunc.openPageByUrl(HOME_PAGE);

        HomePage homePage = new HomePage(baseFunc);
        String title = homePage.getTitleById(1);
        Integer commentCount = homePage.getCommentCountById(1);

        ArticlePage articlePage = homePage.goToArticleById(1);
        String articlePageTitle = articlePage.getTitle();
        Integer articlePageComments = articlePage.getCommentCount();

        Assertions.assertEquals(title, articlePageTitle, "WrongTitle");
    }
}
