package FluentPageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductListPage {

    private SelenideElement searchTitle = $(".search-title-highlight");

    ProductListPage(){
        $(".product-list-wrapper").shouldBe(Condition.visible);
    }

    public ProductListPage searchTitleShouldHas(String text){
        this.searchTitle.shouldHave(Condition.text(text));
        return this;
    }

}
