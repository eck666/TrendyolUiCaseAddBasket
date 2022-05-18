package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeModel extends BaseModel {
    public static By closeHomepagePopup = By.id("Combined-Shape");
    public void userVisitTrendyol(String key){
        webDriver.get(key);
        closeHomepagePopup();
        waitSeconds(2);
    }

    public void closeHomepagePopup(){
        if(isElementPresent(closeHomepagePopup)){
            clickElement(closeHomepagePopup);
            waitSeconds(2);
        }
    }
}
