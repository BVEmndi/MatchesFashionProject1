package MatchesFashionGroupId;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dell on 22-03-2017.
 */
public class HomePage extends MatchesFasBrowserFactory{
    WebDriver driver;
    @FindBy(className = "gender__label__description")
    public WebElement gender_label;

    @FindBy(xpath = "//*[@id='header']/div/div[2]/div[1]/div/div[1]/ul/li[6]/a")
    public WebElement search_label;

    public void setSearch_label()
    {
        search_label.click();
    }

    public void setGender_label()
    {
        gender_label.isSelected();
    }
    /*public void search()
    {
    search_label.sendKeys("handbag");

    }*/


}
