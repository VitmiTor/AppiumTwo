package page;

import base.BasePage;
import elements.$;
import io.appium.java_client.android.AndroidDriver;

import static elements.$.LocatorType.CLASSNAME;
import static elements.$.LocatorType.ID;

public class ColorPage extends BasePage {

    private $ colorText = $(CLASSNAME, "android.widget.EditText");
    private $ btnOk = $(ID, "android:id/button1");

    public ColorPage(AndroidDriver driver) {
        super(driver);
    }

    public ColorPage(AndroidDriver driver, int timeout) {
        super(driver, timeout);
    }

    @Override
    public void waitPageToLoad() {
        waitPage(colorText, this.getClass().getName());
    }

    @Override
    public void verifyPage() {
        softAssert.assertTrue(colorText.isDisplayed());
        softAssert.assertAll();
    }

    public void writeColor(String color) {
        colorText.clear();
        colorText.sendKeys(color);
        btnOk.click();
    }


}
