package StaticPageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static SelenideElement fieldSearch = $(byName("q")),
                                cartIcon = $("a[data-cart-quantity]");

    public static void searchFor(String request){
        fieldSearch.setValue(request).pressEnter();
    }

    public static void goToCart(){
        cartIcon.click();
    }

}
