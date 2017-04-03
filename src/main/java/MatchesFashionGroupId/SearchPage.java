package MatchesFashionGroupId;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dell on 22-03-2017.
 */
public class SearchPage extends MatchesFasBrowserFactory {
    WebDriver driver;
    @FindBy(css = "input#search.header-search__input")
    public WebElement searchtextbox;

    public void setSearchtextbox()
    {
        searchtextbox.sendKeys("handbag");
    }
    @FindBy(id="searchSubmit")
    public WebElement searchbutton;

    public void setSearchbutton()
    {
        searchbutton.click();
    }

}
