package FluentPageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private SelenideElement fieldSearch = $(byName("q")),
            cartIcon = $("a[data-cart-quantity]");

    public FluentPageObjects.ProductListPage searchFor(String request){
        this.fieldSearch.setValue(request).pressEnter();
        return new ProductListPage();
    }

    public CartPage goToCart(){
        this.cartIcon.click();
        return new CartPage();
    }

}
