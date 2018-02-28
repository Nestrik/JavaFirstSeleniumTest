package nestrik.tests;

import nestrik.pages.GoogleSearchPage;
import nestrik.pages.SearchResultsPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstTest extends BaseTestClass {
    private static GoogleSearchPage googleSearchPage;
    private static SearchResultsPage searchResultsPage;

    @BeforeClass
    public static void setup() {
        googleSearchPage = new GoogleSearchPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @Before
    public void goToBasePage() {
        driver.get("https://google.com");
    }

    @Test
    public void searchGMail() {
        googleSearchPage.searchByText("gmail");
        String text = searchResultsPage.firstResult();
        Assert.assertEquals(text,"Gmail – электронная почта и бесплатное хранилище от Google");
    }

    @Test
    public void searchMailRu() {
        googleSearchPage.searchByText("мэил.ру");
        String firstResult = searchResultsPage.firstResult();
        String suggestedCorrectionText = searchResultsPage.suggestedCorrection();
        Assert.assertEquals(firstResult, "Mail.Ru: почта, поиск в интернете, новости, игры");
        Assert.assertEquals(suggestedCorrectionText, "майл.ру");
    }
}
