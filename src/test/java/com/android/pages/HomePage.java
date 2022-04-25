package com.android.pages;

import com.android.hook.BaseHook;

import java.util.concurrent.TimeUnit;

import static com.android.locator.HomePageLocator.LABEL_ANDROID_NEWLINE_LEARNING;

public class HomePage extends BaseHook {

    public boolean isLabelAndroidDisplayed() {
        try {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            return driver.findElement(LABEL_ANDROID_NEWLINE_LEARNING).isDisplayed();
        }catch (Exception e) {
            return false;
        }
    }
}
