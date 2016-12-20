package FluentPageObjects;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class LoginPopup {

    LoginPopup(){
        $("#login-view").shouldBe(Condition.visible);
    }

    public HomePage loginUser(String email, String pasw){
        $(by("name*","username")).setValue(email);
        $(by("name*","password")).setValue(pasw);
        $("button[type='submit']").click();
        return new HomePage();
    }

}
