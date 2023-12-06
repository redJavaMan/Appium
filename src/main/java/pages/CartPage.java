package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CartPage {
    private AndroidDriver driver;
    private By productInCart=By.id("com.androidsample.generalstore:id/productName");
    private By sendmail=By.className("android.widget.CheckBox");
    private By completePurchase=By.id("com.androidsample.generalstore:id/btnProceed");
    public CartPage(AndroidDriver driver) {
        this.driver=driver;
    }
    public String productName(){
        return driver.findElement(productInCart).getText();
    }
    public void selectCompletePurchase(){
        driver.findElement(sendmail).click();
        driver.findElement(completePurchase).click();
    }
}
