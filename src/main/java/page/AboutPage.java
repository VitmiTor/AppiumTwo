package page;

import base.BasePage;
import elements.$;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;

import static elements.$.LocatorType.ID;

public class AboutPage extends BasePage {

    private $ aboutPage = $(ID, "com.simplemobiletools.draw.pro:id/about_holder");
    private $ redditButton = $(ID, "com.simplemobiletools.draw.pro:id/about_reddit");

    public AboutPage(AndroidDriver driver) {
        super(driver);
    }

    public AboutPage(AndroidDriver driver, int timeout) {
        super(driver, timeout);
    }

    @Override
    public void waitPageToLoad() {
        waitPage(aboutPage, this.getClass().getName());
    }

    @Override
    public void verifyPage() {
        softAssert.assertTrue(aboutPage.isDisplayed());
        softAssert.assertAll();
    }

    @Step("Clicking on Reddit icon")
    public void clickReddit() {
        redditButton.click();
    }
}
