package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import page.ColorPage;
import page.MainPage;
import page.SavePage;
import page.TopBarPage;

public class CommonFlows {
    private AndroidDriver driver;

    public CommonFlows(AndroidDriver driver) {
        this.driver = driver;
    }

    @Step()
    public void masterWait() {
        MainPage mainPage = new MainPage(driver);

        mainPage.waitPageToLoad();
    }

    @Step("Change Background Color")
    public void changeBackgroundColor(String color) {
        MainPage mainPage = new MainPage(driver);
        TopBarPage topBarPage = new TopBarPage(driver);
        ColorPage colorPage = new ColorPage(driver);

        mainPage.waitPageToLoad();
        topBarPage.clickBackgroundOption();
        colorPage.waitPageToLoad();
        colorPage.writeColor(color);
    }

    @Step("Pick a color")
    public void pickColor(String color) {
        MainPage mainPage = new MainPage(driver);
        TopBarPage topBarPage = new TopBarPage(driver);
        ColorPage colorPage = new ColorPage(driver);

        mainPage.waitPageToLoad();
        mainPage.pickColor();
        colorPage.waitPageToLoad();
        colorPage.writeColor(color);
        mainPage.waitPageToLoad();
    }

    @Step("Save the image")
    public void saveImg() {
        TopBarPage topBarPage = new TopBarPage(driver);
        SavePage savePage = new SavePage(driver);
        MainPage mainPage = new MainPage(driver);

        topBarPage.waitPageToLoad();
        topBarPage.savePicture();
        savePage.waitPageToLoad();
        savePage.writeName();
        savePage.pressBackButton();
        mainPage.waitPageToLoad();
    }
}
