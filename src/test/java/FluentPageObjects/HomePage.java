package FluentPageObjects;

import com.codeborne.selenide.Condition;
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

    public LoginPopup openLoginPopup(){
        $("").click();
        return new LoginPopup();
    }

    public void shouldBeLoggedUser(String value){
        $(".account-name a").shouldHave(Condition.text(value));
    }

}
