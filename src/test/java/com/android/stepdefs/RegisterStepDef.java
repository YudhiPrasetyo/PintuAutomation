package com.android.stepdefs;

import com.android.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.equalTo;

public class RegisterStepDef extends RegisterPage {

    @And("user click button register on register page")
    public void userClickButtonRegisterOnRegisterPage() {
        clickBtnRegister();
    }

    @Then("user is successfully registered")
    public void userIsSuccessfullyRegistered() {
        Assert.assertTrue(isSuccessMessageDisplay());
        Assert.assertThat(getSuccessMessageRegister(), equalTo(""));
    }

    @When("user input full name with {string} on register page")
    public void userInputFullNameWithOnRegisterPage(String name) {
        inputFullName(name);
    }

    @When("user input email with {string} on register page")
    public void userInputEmailWithOnRegisterPage(String email) {
        inputEmail(email);
    }

    @When("user input password with {string} on register page")
    public void userInputPasswordWithOnRegisterPage(String password) {
        inputPassword(password);
    }



    @When("user input confirm password  with {string} on register page")
    public void userInputConfirmPasswordWithOnRegisterPage(String confirmPassword) {
        inputConfirmPassword(confirmPassword);
    }
}
