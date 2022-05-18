package Tests;

import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;

public class HomeTest {
    HomeModel homeModel = new HomeModel();

    @Step("Kullanıcı <key> sitesine gider.")
    public void userVisitTrendyol(String key){
        homeModel.userVisitTrendyol(key);
    }
}
