package PageModel;

import org.openqa.selenium.By;

public class LoginModel extends BaseModel {
    public static By loginBtn = By.className("account-user");
    public static By email = By.id("login-email");
    public static By password = By.id("login-password-input");
    public static By submitBtn = By.cssSelector("[type='submit']");
    public void clickLoginBtn() {
        clickElement(loginBtn);
    }
    public void layoutLoginText(String emailText, String passwordtext) {
        sendKeys(email, emailText);
        sendKeys(password, passwordtext);
        waitSeconds(2);
    }
    public  void clickSubmitBtn(){
        clickElement(submitBtn);
        waitSeconds(2);
    }
}
