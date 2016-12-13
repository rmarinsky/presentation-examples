package VoidPageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private SelenideElement product;

    private static By buttonAddToCart = byCssSelector(".ga-add-to-cart");
    private static By buttonToCart = byCssSelector(".in-cart a");

    public ProductPage(Integer productId){
        this.product = findProduct(productId);
    }

    private SelenideElement findProduct(Integer productId){
        return $(by("data-product-id", String.valueOf(productId)));
    }

    public void addToCartProduct(){
        this.product.$(buttonAddToCart).click();
    }

    public void clickToCartButton(){
        this.product.$(buttonToCart).click();
    }

}
