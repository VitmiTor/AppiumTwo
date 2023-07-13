package page;

import base.BasePage;
import elements.$;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;

import static elements.$.LocatorType.ID;

public class SavePage extends BasePage {

    private $ fileName = $(ID, "com.simplemobiletools.draw.pro:id/save_image_filename");
    private $ okButton = $(ID, "android:id/button1");

    public SavePage(AndroidDriver driver) {
        super(driver);
    }

    public SavePage(AndroidDriver driver, int timeout) {
        super(driver, timeout);
    }

    @Override
    public void waitPageToLoad() {
        waitPage(fileName, this.getClass().getName());
    }

    @Override
    public void verifyPage() {
        softAssert.assertTrue(fileName.isDisplayed());
        softAssert.assertAll();
    }

    @Step("Writing the name")
    public void writeName() {
        fileName.clear();
        fileName.sendKeys(faker.name().firstName());
        okButton.click();
    }
}
