package com.android.pages;

import com.android.hook.BaseHook;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

import static com.android.locator.LoginPageLocator.*;

public class LoginPage extends BaseHook {

    public void inputEmail(String email) {
        driver.findElement(INPUT_EMAIL).click();
        driver.findElement(INPUT_EMAIL).sendKeys(email);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public boolean isLoginPage() {
        return driver.findElement(LOGO_LOGIN_PAGE).isDisplayed();
    }

    public void inputPassword(String password) {
        driver.findElement(INPUT_PASSWORD).click();
        driver.findElement(INPUT_PASSWORD).sendKeys(password);
        driver.hideKeyboard();
    }

    public void clickBtnLogin() {
        driver.findElement(BUTTON_LOGIN).click();
    }

    public boolean errorMessage() {
        try {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            return driver.findElement(LABEL_ERROR_MESSAGE).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean errorMessageEmail() {
        try {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            return driver.findElement(LABEL_ERROR_EMAIL).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickLinkRegister() {
        driver.findElement(LINK_CREATE_ACC).click();
    }
}
