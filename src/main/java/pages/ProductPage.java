package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import static io.appium.java_client.MobileBy.AndroidUIAutomator;

public class ProductPage {
    private AndroidDriver driver;
    private By add2Cart=By.xpath("//android.widget.LinearLayout/android.widget.TextView[@text='Air Jordan 9 Retro']/following-sibling::android.widget.LinearLayout/child::android.widget.TextView[2]");
    private By cart=By.id("com.androidsample.generalstore:id/appbar_btn_cart");
    public ProductPage(AndroidDriver driver) {
        this.driver=driver;
    }
    public CartPage addToCart(String product){
       // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
         //       ".scrollIntoView(new UiSelector().textContains("+product+").instance(0))")).click();
        String uiSelector = "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\""+product+"\"))";
        driver.findElement(AndroidUIAutomator(uiSelector));
        driver.findElement(add2Cart).click();
        driver.findElement(cart).click();
        return new CartPage(driver);
    }
}
