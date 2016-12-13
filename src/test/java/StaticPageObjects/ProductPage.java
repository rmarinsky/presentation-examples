package StaticPageObjects;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private static By buttonAddToCart = byCssSelector(".ga-add-to-cart");
    private static By buttonToCart = byCssSelector(".in-cart a");

    public static void openProductPage(Integer productId) {
        Selenide.open(String.format("/item/%s/", productId));
    }

    public static void addToCartProduct(Integer productId){
        findProductById(productId).$(buttonAddToCart).click();
    }

    public static void clickToCartButton(Integer productId){
        findProductById(productId).$(buttonToCart).click();
    }

    private static SelenideElement findProductById(Integer productId){
        return $(Selectors.by("data-product-id", String.valueOf(productId)));
    }

}
