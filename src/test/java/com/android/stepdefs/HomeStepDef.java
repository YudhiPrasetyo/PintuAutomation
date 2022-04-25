package com.android.stepdefs;

import com.android.pages.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomeStepDef extends HomePage {
    @Then("user can see home page")
    public void userCanSeeHomePage() {
        Assert.assertEquals(isLabelAndroidDisplayed(), true);
        closeApps();
    }
}
