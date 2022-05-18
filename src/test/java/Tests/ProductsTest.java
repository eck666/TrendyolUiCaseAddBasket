package Tests;

import PageModel.ProductsModel;
import com.thoughtworks.gauge.Step;

public class ProductsTest {
    ProductsModel productsModel = new ProductsModel();
    @Step("Kullanıcı Navigation barından Ev & Mobilya kısmına gelir.")
    public void navigationBar(){
        productsModel.navigationHover();
    }
    @Step("Kullanıcı Tablo kısmına tıklar.")
    public void clickTablo(){
        productsModel.clickTabloBtn();
    }
    @Step("Kullanıcı rastgele bir ürüne tıklar.")
    public void randomProduct(){
        productsModel.selectrandomProduct();
    }

}
