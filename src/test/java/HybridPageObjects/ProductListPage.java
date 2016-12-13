package HybridPageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProductListPage {

    private SelenideElement searchTitle = $(".search-title-highlight");

    ProductListPage(){
        $(".product-list-wrapper").shouldBe(Condition.visible);
    }

    public static ProductListPage openProductListPage(String pathUrl){
        open(pathUrl);
        return new ProductListPage();
    }

    public void searchTitleShouldHas(String text){
        this.searchTitle.shouldHave(Condition.text(text));
    }

}
