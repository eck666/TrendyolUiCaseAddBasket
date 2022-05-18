package Tests;

import PageModel.LoginModel;
import com.thoughtworks.gauge.Step;


public class LoginTest {
    LoginModel loginModel = new LoginModel();

    @Step("Kullanıcı Giriş yap butonuna tıklar.")
    public void clickLogin(){
        loginModel.clickLoginBtn();
    }
    @Step("Kullanıcı E-posta kısmına <key>, şifre kısmına <key> yazar.")
    public void layoutLogin(String email, String password){
        loginModel.layoutLoginText(email,password);
    }
    @Step("Kullanıcı Giriş Yap butonuna tıklar.")
    public void clickSubmit(){
        loginModel.clickSubmitBtn();
    }

}
