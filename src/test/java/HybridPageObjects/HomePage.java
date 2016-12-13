package HybridPageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    public static HomePage openHomePage(){
        open("/");
        return new HomePage();
    }

    private HomePage(){
        $("#content-wrapper").shouldBe(Condition.visible);
    }

    private SelenideElement fieldSearch = $(byName("q")),
            cartIcon = $("a[data-cart-quantity]");

    public ProductListPage searchFor(String request){
        this.fieldSearch.setValue(request).pressEnter();
        return new ProductListPage();
    }

    public CartPage goToCart(){
        this.cartIcon.click();
        return new CartPage();
    }

}
