package nestrik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    public SearchResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(css = "#fprs .spell:nth-child(2)")
    private WebElement suggestedCorrection;

    @FindBy(css = "h3.r")
    private WebElement firstResult;

    public String firstResult() {
        return firstResult.getText();
    }



    public String suggestedCorrection() {
        return suggestedCorrection.getText();
    }
}
