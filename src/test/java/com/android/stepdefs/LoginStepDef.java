package com.android.stepdefs;

import com.android.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef extends LoginPage {

    @Given("user on login page")
    public void userOnLoginPage() {
        Assert.assertTrue(isLoginPage());
    }

    @When("user click login button")
    public void userClickLoginButton() {
        clickBtnLogin();
    }

    @Given("user input email with {string}")
    public void userInputEmailWith(String email) throws Exception {
        openApps();
        inputEmail(email);
    }

    @When("user input password with {string}")
    public void userInputPasswordWith(String password) {
        inputPassword(password);
    }

    @Then("user can see error message")
    public void userCanSeeErrorMessage() {
        Assert.assertTrue(errorMessage());
    }

    @Then("user can see error message email")
    public void userCanSeeErrorMessageEmail() {
        Assert.assertTrue(errorMessageEmail());
    }

    @Given("user click on create one on login page")
    public void userClickOnCreateOneOnLoginPage() throws Exception {
        openApps();
        clickLinkRegister();
    }
}
