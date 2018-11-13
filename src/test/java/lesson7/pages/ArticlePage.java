package lesson7.pages;

import org.openqa.selenium.By;

public class ArticlePage {
    private final By TITLE = By.xpath(".//h1[contains(@class, 'd-inline')]");
    private final By COMMENTS = By.xpath(".//a[contains(@class, 'text-size-19')]");
    private BaseFunc bf;

    public ArticlePage(BaseFunc baseFunc) {
        bf = baseFunc;
    }

    public String getTitle() {
        return bf.getElement(TITLE).getText();
    }

    public Integer getCommentCount() {
        String comments = bf.getElement(COMMENTS).getText();
        comments = comments.substring(1, comments.length() - 1);
        return Integer.valueOf(comments);
    }
}
