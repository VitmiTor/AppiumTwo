package page;

import base.BasePage;
import elements.$;
import io.appium.java_client.android.AndroidDriver;

import static elements.$.LocatorType.ID;

public class SettingPage extends BasePage {

    private $ swtichBrush = $(ID, "com.simplemobiletools.draw.pro:id/settings_show_brush_size");

    public SettingPage(AndroidDriver driver) {
        super(driver);
    }

    public SettingPage(AndroidDriver driver, int timeout) {
        super(driver, timeout);
    }

    @Override
    public void waitPageToLoad() {
        waitPage(swtichBrush, this.getClass().getName());
    }

    @Override
    public void verifyPage() {
        softAssert.assertTrue(swtichBrush.isDisplayed());
        softAssert.assertAll();
    }
}
