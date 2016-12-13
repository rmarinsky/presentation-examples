import FluentPageObjects.HomePage;
import FluentPageObjects.ProductPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class FluentPageObjectsTests extends BaseTest {

    @Test
    public void searchResultTitleShouldHasRequest(){
        open("");
        new HomePage().searchFor(searchRequest).
                searchTitleShouldHas(searchRequest);
    }

    @Test
    public void addToCartProductTest(){
        new ProductPage(productId).openProductPage(productId).
                addToCartProduct().
                clickToCartButton().
                cartPageShouldHasProduct(productId);
    }


}
