package drawing;

import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import page.ColorPage;
import page.MainPage;
import page.SavePage;
import page.TopBarPage;

import static elements.$.Orientation.HORIZONTAL;
import static elements.$.Orientation.VERTICAL;

public class DrawTest extends BaseTest {

    private MainPage mainPage;
    private TopBarPage topBarPage;
    private ColorPage colorPage;
    private SavePage savePage;

    @Test
    public void drawXTest() {
        commonFlows.changeBackgroundColor("D71717");
        commonFlows.pickColor("FFFFFF");
        mainPage.swipe(10, 50, 70, 90);
        mainPage.swipe(40, 50, 10, 90);
        commonFlows.saveImg();
        topBarPage.clearCanvas();
    }

    @Test
    public void drawSquareTest() {
        commonFlows.changeBackgroundColor("0769FC");
        commonFlows.pickColor("0010FC");
        mainPage.swipe(15, 30, HORIZONTAL);
        mainPage.swipe(35, 50, 15, VERTICAL);
        mainPage.swipe(15, 30, 35, HORIZONTAL);
        mainPage.swipe(35, 50, 30, VERTICAL);
        commonFlows.saveImg();
        topBarPage.clearCanvas();
    }

    @Test
    public void drawRectangleTest() {
        commonFlows.changeBackgroundColor("000000");
        commonFlows.pickColor("28CC23");
        mainPage.swipe(10, 50, HORIZONTAL);
        mainPage.swipe(40, 50, 10, VERTICAL);
        mainPage.swipe(10, 50, 40, HORIZONTAL);
        mainPage.swipe(40, 50, 50, VERTICAL);
        commonFlows.saveImg();
        topBarPage.clearCanvas();
    }

    @Test
    public void drawTriangleTest() {
        commonFlows.changeBackgroundColor("28CC23");
        commonFlows.pickColor("D71717");
        mainPage.swipe(15, 50, HORIZONTAL);
        mainPage.swipe(25, 10, 50, 50);
        mainPage.swipe(25, 10, 15, 15);
        commonFlows.saveImg();
        topBarPage.clearCanvas();
    }

    @Test
    public void drawTTest() {
        commonFlows.changeBackgroundColor("FFFFFF");
        commonFlows.pickColor("000000");
        mainPage.swipe(20, 60, VERTICAL);
        mainPage.swipe(10, 30, 20, HORIZONTAL);
        commonFlows.saveImg();
        topBarPage.clearCanvas();
    }

    @Test
    public void drawPlusTest() {
        commonFlows.changeBackgroundColor("28CC23");
        commonFlows.pickColor("D71717");
        mainPage.swipe(15, 50, HORIZONTAL);
        mainPage.swipe(15, 50, VERTICAL);
        commonFlows.saveImg();
        topBarPage.clearCanvas();
    }
    
    @Override

    public void initPages(AndroidDriver driver) {
        mainPage = new MainPage(driver);
        topBarPage = new TopBarPage(driver);
        colorPage = new ColorPage(driver);
        savePage = new SavePage(driver);
    }
}
