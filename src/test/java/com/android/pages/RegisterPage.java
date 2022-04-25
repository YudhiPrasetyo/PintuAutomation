package com.android.pages;

import com.android.hook.BaseHook;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

import static com.android.locator.RegisterPageLocator.*;

public class RegisterPage extends BaseHook {

    public void inputFullName(String name) {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(INPUT_NAME).click();
        driver.findElement(INPUT_NAME).sendKeys(name);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void inputEmail(String email) {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(INPUT_EMAIL).click();
        driver.findElement(INPUT_EMAIL).sendKeys(email);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void inputPassword(String password) {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(INPUT_PASSWORD).click();
        driver.findElement(INPUT_PASSWORD).sendKeys(password);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void inputConfirmPassword(String confirmPassword) {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(INPUT_CONFIRM_PASSWORD).click();
        driver.findElement(INPUT_CONFIRM_PASSWORD).sendKeys(confirmPassword);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void clickBtnRegister() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(BUTTON_REGISTER).click();
    }

    public boolean isSuccessMessageDisplay() {
        try {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            return driver.findElement(LABEL_REGISTER_SUCCEESS).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getSuccessMessageRegister() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        return driver.findElement(LABEL_REGISTER_SUCCEESS).getText();
    }
}
