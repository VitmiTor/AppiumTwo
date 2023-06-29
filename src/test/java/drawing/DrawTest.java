package drawing;

import base.BaseTest;
import data.DataGiver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import page.ColorPage;
import page.MainPage;
import page.SavePage;
import page.TopBarPage;

import static data.DataGiver.figurines;
import static elements.$.Orientation.HORIZONTAL;
import static elements.$.Orientation.VERTICAL;

public class DrawTest extends BaseTest {

    private MainPage mainPage;
    private TopBarPage topBarPage;
    private ColorPage colorPage;
    private SavePage savePage;

    @Test(dataProvider = figurines, dataProviderClass = DataGiver.class)
    public void drawXTest(String background, String pincel, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        commonFlows.changeBackgroundColor(background);
        commonFlows.pickColor(pincel);
        mainPage.swipe(x1, y1, x2, y2);
        mainPage.swipe(x3, y3, x4, y4);
        commonFlows.saveImg();
        topBarPage.clearCanvas();
    }

    @Test
    public void drawSquareTest() {
        commonFlows.changeBackgroundColor("blue");
        commonFlows.pickColor("sky-blue");
        mainPage.swipe(15, 30, HORIZONTAL);
        mainPage.swipe(35, 50, 15, VERTICAL);
        mainPage.swipe(15, 30, 35, HORIZONTAL);
        mainPage.swipe(35, 50, 30, VERTICAL);
        commonFlows.saveImg();
        topBarPage.clearCanvas();
    }

    @Test
    public void drawRectangleTest() {
        commonFlows.changeBackgroundColor("black");
        commonFlows.pickColor("green");
        mainPage.swipe(10, 50, HORIZONTAL);
        mainPage.swipe(40, 50, 10, VERTICAL);
        mainPage.swipe(10, 50, 40, HORIZONTAL);
        mainPage.swipe(40, 50, 50, VERTICAL);
        commonFlows.saveImg();
        topBarPage.clearCanvas();
    }

    @Test
    public void drawTriangleTest() {
        commonFlows.changeBackgroundColor("green");
        commonFlows.pickColor("red");
        mainPage.swipe(15, 50, HORIZONTAL);
        mainPage.swipe(25, 10, 50, 50);
        mainPage.swipe(25, 10, 15, 15);
        commonFlows.saveImg();
        topBarPage.clearCanvas();
    }

    @Test
    public void drawTTest() {
        commonFlows.changeBackgroundColor("white");
        commonFlows.pickColor("black");
        mainPage.swipe(20, 60, VERTICAL);
        mainPage.swipe(10, 30, 20, HORIZONTAL);
        commonFlows.saveImg();
        topBarPage.clearCanvas();
    }

    @Test
    public void drawPlusTest() {
        commonFlows.changeBackgroundColor("green");
        commonFlows.pickColor("red");
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
