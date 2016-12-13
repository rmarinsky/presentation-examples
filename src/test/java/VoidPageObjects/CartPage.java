package VoidPageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    public SelenideElement findProduct(Integer productId){
        return $(withText(String.valueOf(productId)));
    }

}
