package AppTest;

import Base.BaseTest;
import models.User;
import org.testng.annotations.BeforeTest;
import pages.CartPage;
import pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {
    private User user;
    private ProductPage productPage;
    private CartPage cartPage;

    @BeforeTest
    public void setupUser(){
        user = new User();
        user.setCountry("Albania");
        user.setName("Asfiya");
        user.setGender("Female");
    }
    @Test
    public void addToCartTest(){
        productPage = homePage.setUser(user);
        cartPage=productPage.addToCart("Air Jordan 9 Retro");
        assertEquals(cartPage.productName(),"Air Jordan 9 Retro");
        cartPage.selectCompletePurchase();
    }

}
