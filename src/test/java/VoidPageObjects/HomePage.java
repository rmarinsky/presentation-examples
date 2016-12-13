package VoidPageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private SelenideElement fieldSearch = $(byName("q")),
            cartIcon = $("a[data-cart-quantity]");

    public void searchFor(String request){
        this.fieldSearch.setValue(request).pressEnter();
    }

    public void goToCart(){
        this.cartIcon.click();
    }

}
