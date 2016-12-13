package HybridPageObjects;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class LoginPopup {

    LoginPopup(){
        $("#login-view").shouldBe(Condition.visible);
    }

}
