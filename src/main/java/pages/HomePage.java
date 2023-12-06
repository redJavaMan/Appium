package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import models.User;
import org.openqa.selenium.By;

import java.util.function.Function;

public class HomePage {
    private AndroidDriver driver;
    private By countryDropDown = AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry");
    private By nameField= By.id("com.androidsample.generalstore:id/nameField");
    private By female=By.id("com.androidsample.generalstore:id/radioFemale");
    private By letShopButton=By.id("com.androidsample.generalstore:id/btnLetsShop");

    private Function<String, By> byCountry = country -> By.xpath("//android.widget.TextView[@text='"+country+"']");

    public HomePage(AndroidDriver driver) {
        this.driver=driver;
    }
    public void setCountryAndName(String country,String name){
        driver.findElement(countryDropDown).click();
        //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" +
             //   ".scrollIntoView(text('"+contry+"'));")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+country+"']")).click();
        driver.findElement(nameField).sendKeys(name);
    }
    public ProductPage setFemale(){
        driver.findElement(female).click();
        driver.findElement(letShopButton).click();
        return new ProductPage(driver);
    }

    public ProductPage setUser(User user) {
        driver.findElement(countryDropDown).click();
//        String country = String.format("//android.widget.TextView[@text='%s']", user.getCountry());
//        driver.findElement(By.xpath(country)).click();
        driver.findElement(byCountry.apply(user.getCountry())).click();
        driver.findElement(nameField).sendKeys(user.getName());
        driver.findElement(female).click();
        driver.findElement(letShopButton).click();
        return new ProductPage(driver);
    }
}
