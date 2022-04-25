package com.android.locator;

import org.openqa.selenium.By;

public interface RegisterPageLocator {

    By INPUT_NAME = By.id("textInputEditTextName");
    By INPUT_EMAIL = By.id("textInputEditTextEmail");
    By INPUT_PASSWORD = By.id("textInputEditTextPassword");
    By INPUT_CONFIRM_PASSWORD = By.id("textInputEditTextConfirmPassword");
    By BUTTON_REGISTER = By.id("appCompatButtonRegister");
    By LINK_LOGIN = By.id("appCompatTextViewLoginLink");
    By LABEL_REGISTER_SUCCEESS = By.id("snackbar_text");
    By ERROR_MESSAGE = By.id("android.widget.TextView");
}
