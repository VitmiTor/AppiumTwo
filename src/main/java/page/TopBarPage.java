package page;

import base.BasePage;
import elements.$;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;

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

    @Step("Click on Background Option")
    public void clickBackgroundOption() {
        options.click();
        changeBack.click();
    }

    @Step("Click on Save")
    public void savePicture() {
        saveButton.click();
    }

    @Step("clearing canvas")
    public void clearCanvas() {
        clearButton.click();
    }

    @Step("Clicking on Setting")
    public void clickSetting() {
        options.click();
        settingButton.click();
    }

    @Step("Click on About")
    public void clickAbout() {
        options.click();
        aboutButton.click();
    }
}
