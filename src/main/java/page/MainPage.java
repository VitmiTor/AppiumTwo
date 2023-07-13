package page;

import base.BasePage;
import elements.$;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;

import static elements.$.LocatorType.ID;

public class MainPage extends BasePage {

    private $ canvas = $(ID, "com.simplemobiletools.draw.pro:id/my_canvas");
    private $ pickPencilColor = $(ID, "com.simplemobiletools.draw.pro:id/color_picker");

    public MainPage(AndroidDriver driver) {
        super(driver);
    }

    public MainPage(AndroidDriver driver, int timeout) {
        super(driver, timeout);
    }

    @Override
    public void waitPageToLoad() {
        waitPage(canvas, this.getClass().getName());
    }

    @Override
    public void verifyPage() {
        softAssert.assertTrue(canvas.isDisplayed());
        softAssert.assertTrue(pickPencilColor.isDisplayed());
        softAssert.assertAll();
    }

    @Step("Pick the pencil color")
    public void pickColor() {
        pickPencilColor.click();
    }
}
