package Tests;

import PageModel.BasketModel;
import com.thoughtworks.gauge.Step;

public class BasketTest {
    BasketModel basketModel = new BasketModel();

    @Step("Kullanıcı ürünü sepete ekler.")
    public void addBasket(){
        basketModel.addBasket();
    }
    @Step("Kullanıcı sepetine gider.")
    public void goToBasket(){
        basketModel.goToBasket();
    }
    @Step("Kullanıcı ürünün sepete eklendiğini kontrol eder.")
    public void checkBasket(){
        basketModel.checkBasket();
    }
}
