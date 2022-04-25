package com.android.locator;

import org.openqa.selenium.By;

public interface LoginPageLocator {

    By INPUT_EMAIL = By.id("textInputEditTextEmail");
    By INPUT_PASSWORD = By.id("textInputEditTextPassword");
    By BUTTON_LOGIN = By.id("appCompatButtonLogin");
    By LINK_CREATE_ACC = By.id("textViewLinkRegister");
    By LABEL_ERROR_MESSAGE = By.id("snackbar_text");
    By LABEL_ERROR_EMAIL = By.xpath("//android.widget.TextView[contains(@text, 'Enter')]");
    By LOGO_LOGIN_PAGE = By.className("android.widget.ImageView");
}
