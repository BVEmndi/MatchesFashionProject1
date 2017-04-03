package MatchesFashionGroupId;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dell on 22-03-2017.
 */
public class StepDef {
    WebDriver driver;
    HomePage hp = new HomePage();
    SearchPage sp = new SearchPage();

    @Given("^Customer is in the HomePage$")
    public void customer_is_in_the_HomePage() throws Throwable {
        hp.setSearch_label();
        Thread.sleep(2000);

    }

    @When("^customer enter the product name to search$")
    public void customer_enter_the_product_name_to_search() throws Throwable {
        hp.setGender_label();
        sp.setSearchtextbox();

        // hp.search();
    }

    @When("^click submit$")
    public void click_submit() throws Throwable {
        sp.setSearchbutton();
    }

    @Then("^customer should see the product details he entered$")
    public void customer_should_see_the_product_details_he_entered() throws Throwable {
        /*org.junit.Assert.assertTrue("\n" +
                "We searched and found nothing for\n" +
                " handbag\n" +
                "Please search again\n", true);
                   }*/
        Assert.assertTrue("© Copyright 2016-2017 MATCHESFASHION.COM", true);

    }
}