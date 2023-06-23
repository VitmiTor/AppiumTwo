package page;

import base.BasePage;
import elements.$;
import io.appium.java_client.android.AndroidDriver;

import static elements.$.LocatorType.*;

public class TopBarPage extends BasePage {

    private $ options = $(ACCESIBILITY_ID, "More options");
    private $ changeBack = $(UIAUTOMATOR2, "text(\"Change background color\")");
    private $ saveButton = $(ID, "com.simplemobiletools.draw.pro:id/menu_save");
    private $ clearButton = $(ACCESIBILITY_ID, "Clear");
    private $ settingButton = $(UIAUTOMATOR2, "text(\"Settings\")");
    private $ aboutButton = $(UIAUTOMATOR2, "text(\"About\")");

    public TopBarPage(AndroidDriver driver) {
        super(driver);
    }

    public TopBarPage(AndroidDriver driver, int timeout) {
        super(driver, timeout);
    }

    @Override
    public void waitPageToLoad() {
        waitPage(options, this.getClass().getName());
    }

    @Override
    public void verifyPage() {
        softAssert.assertTrue(options.isDisplayed());
        softAssert.assertAll();
    }

    public void clickBackgroundOption() {
        options.click();
        changeBack.click();
    }

    public void savePicture() {
        saveButton.click();
    }

    public void clearCanvas() {
        clearButton.click();
    }

    public void clickSetting() {
        options.click();
        settingButton.click();
    }

    public void clickAbout() {
        options.click();
        aboutButton.click();
    }
}
