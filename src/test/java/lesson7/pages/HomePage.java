package lesson7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final By ARTICLE = By.xpath(".//h3[@class = 'top2012-title']");
    private final By TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final By COMMENTS = By.xpath(".//a[@class = 'comment-count']");
    private BaseFunc bf;

    public HomePage(BaseFunc baseFunc) {
        bf = baseFunc;
    }

    public WebElement getArticleById(int id) {
        return bf.getElements(ARTICLE).get(id);
    }

    public String getTitleById(int id) {
        return getArticleById(id).findElement(TITLE).getText();
    }

    public Integer getCommentCountById(int id) {
        String comments = getArticleById(id).findElement(COMMENTS).getText();
        comments = comments.substring(1, comments.length() - 1);
        return Integer.valueOf(comments);
    }

    public ArticlePage goToArticleById(int id) {
        getArticleById(id).click();
        return new ArticlePage(bf);
    }
}
