import StaticPageObjects.CartPage;
import StaticPageObjects.HomePage;
import StaticPageObjects.ProductListPage;
import StaticPageObjects.ProductPage;
import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class StaticPageObjectsTests extends BaseTest{

    @Test
    public void searchResultTitleShouldHasRequest(){
        open("");
        HomePage.searchFor(searchRequest);
        ProductListPage.searchTitle.shouldHave(Condition.text(searchRequest));
    }

    @Test
    public void addToCartProduct(){
        ProductPage.openProductPage(productId);
        ProductPage.addToCartProduct(productId);
        ProductPage.clickToCartButton(productId);
        CartPage.openCartPage();
        CartPage.cartPageShouldHasProduct(productId);
    }

}
