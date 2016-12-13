package StaticPageObjects;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CartPage {

    public static void openCartPage(){
        open("/cart/");
    }

    public static void cartPageShouldHasProduct(Integer idProduct){
        $(byText(String.valueOf(idProduct))).shouldBe(Condition.visible);
    }

}
