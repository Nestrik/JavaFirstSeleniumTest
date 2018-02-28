package nestrik.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public GoogleSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(id = "lst-ib")
    private WebElement searchField;

    @FindBy(xpath = "//input[@aria-label='Мне повезёт!']")
    private WebElement submitLuckyButton;

    @FindBy(xpath = "//input[@aria-label='Поиск в Google']")
    private WebElement submitSearchButton;

    public void searchByText(String text) {
        searchField.sendKeys(text);
        searchField.sendKeys(Keys.ENTER);
    }

    public void searcByTextForLucky(String text) {
        searchField.sendKeys(text);
        submitLuckyButton.click();
    }
}
