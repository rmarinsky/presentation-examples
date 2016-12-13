package FluentPageObjects;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private SelenideElement product;

    private By buttonAddToCart = byCssSelector(".ga-add-to-cart");
    private By buttonToCart = byCssSelector(".in-cart a");

    public ProductPage(Integer productId){
        this.product = findProductById(productId);
    }

    public ProductPage openProductPage(Integer productId) {
        Selenide.open(String.format("/item/%s/", productId));
        return this;
    }

    public ProductPage addToCartProduct(){
        this.product.$(buttonAddToCart).click();
        return this;
    }

    public CartPage clickToCartButton(){
        this.product.$(buttonToCart).click();
        return new CartPage();
    }

    private SelenideElement findProductById(Integer productId){
        return $(Selectors.by("data-product-id", String.valueOf(productId)));
    }

}
