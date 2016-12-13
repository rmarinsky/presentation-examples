import HybridPageObjects.HomePage;
import HybridPageObjects.ProductPage;
import org.junit.Test;

public class HybridPageObjectsTests extends BaseTest{

    @Test
    public void searchResultTitleShouldHasRequest(){
        HomePage.openHomePage().searchFor("smart-clip")
                .searchTitleShouldHas("smart-clip");
    }

    @Test
    public void addToCartProduct(){
        ProductPage.openProductPage(productId).addToCartProduct().clickToCartButton().
                cartPageShouldHasProduct(productId);
    }

}
