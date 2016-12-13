package FluentPageObjects;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    CartPage(){
        $("#cart").shouldBe(Condition.visible);
    }

    public void cartPageShouldHasProduct(Integer idProduct){
        $(byText(String.valueOf(idProduct))).shouldBe(Condition.visible);
    }

}
