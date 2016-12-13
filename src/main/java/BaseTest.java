import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;

public class BaseTest {

    String searchRequest = "smart-clip";
    Integer productId = 859177;

    @BeforeClass
    public static void beforeClass(){
        Configuration.baseUrl = "https://gsmserver.com";
    }

}
