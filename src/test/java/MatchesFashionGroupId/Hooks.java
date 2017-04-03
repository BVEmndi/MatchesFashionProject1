package MatchesFashionGroupId;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Dell on 22-03-2017.
 */
public class Hooks {
    @Before
    public void setUp()throws Throwable
    {
        new MatchesFasBrowserFactory().openBrowser();
    }
    @After
    public void tearDown()
    {
//        new NewBrowserManager().closeBrowser();
    }
}


