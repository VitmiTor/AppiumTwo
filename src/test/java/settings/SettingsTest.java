package settings;

import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import page.AboutPage;
import page.MainPage;
import page.SettingPage;
import page.TopBarPage;

public class SettingsTest extends BaseTest {

    private TopBarPage topBarPage;
    private SettingPage settingPage;
    private MainPage mainPage;
    private AboutPage aboutPage;

    @Test
    public void settingPageTest() {
        topBarPage.waitPageToLoad();
        topBarPage.clickSetting();
        settingPage.waitPageToLoad();
        settingPage.pressBackButton();
        mainPage.waitPageToLoad();
    }

    @Test
    public void aboutTest() {
        topBarPage.waitPageToLoad();
        topBarPage.clickAbout();
        aboutPage.waitPageToLoad();
        aboutPage.clickReddit();
        aboutPage.pressBackButton();
        aboutPage.waitPageToLoad();
    }

    @Override
    public void initPages(AndroidDriver driver) {
        topBarPage = new TopBarPage(driver);
        settingPage = new SettingPage(driver);
        mainPage = new MainPage(driver);
        aboutPage = new AboutPage(driver);
    }
}
