package HybridPageObjects;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private SelenideElement product;

    private ProductPage(Integer productId){
        findProductById(productId);
    }

    public static ProductPage openProductPage(Integer productId) {
        Selenide.open(String.format("/item/%s/", productId));
        return new ProductPage(productId);
    }

    public ProductPage addToCartProduct(){
        this.product.$(".ga-add-to-cart").click();
        return this;
    }

    public CartPage clickToCartButton(){
        this.product.$(".in-cart a").click();
        return new CartPage();
    }

    private SelenideElement findProductById(Integer productId){
        return $(Selectors.by("data-product-id", String.valueOf(productId)));
    }

}
