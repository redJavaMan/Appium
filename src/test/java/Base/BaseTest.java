package Base;

import pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected HomePage homePage;
    private AppiumDriverLocalService service;
    private AndroidDriver driver;
    @BeforeSuite
    public void setUp() throws MalformedURLException {
        service =new AppiumServiceBuilder()
                .withAppiumJS(new File("C:\\Users\\Dell\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        //service.start();
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("LukmanPhone");
        options.setApp("C:\\Users\\Dell\\IdeaProjects\\Appium\\resources\\General-Store.apk");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        homePage=new HomePage(driver);
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
        //service.stop();
    }
}


