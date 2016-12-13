import VoidPageObjects.CartPage;
import VoidPageObjects.HomePage;
import VoidPageObjects.ProductListPage;
import VoidPageObjects.ProductPage;
import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class VoidPageObjectsTests extends BaseTest{

    @Test
    public void searchResultTitleShouldHasRequest(){
        open("");
        HomePage homePage = new HomePage();
        homePage.searchFor(searchRequest);
        ProductListPage productListPage = new ProductListPage();
        productListPage.searchTitle.shouldHave(Condition.text(searchRequest));
    }

    @Test
    public void addToCartProduct(){
        open(String.format("/item/%s/", productId));
        ProductPage productPage = new ProductPage(productId);
        productPage.addToCartProduct();
        productPage.clickToCartButton();
        open("/cart/");
        CartPage cartPage = new CartPage();
        cartPage.findProduct(productId).shouldBe(Condition.visible);
    }

}
