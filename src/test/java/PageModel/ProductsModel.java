package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsModel extends BaseModel {
    public static By navigationHover = By.xpath("//a[normalize-space()='Ev & Mobilya']");
    public static By tablobtn = By.xpath("//a[normalize-space()='Tablo']");
    public static By productsList = By.cssSelector(".prdct-cntnr-wrppr .p-card-chldrn-cntnr");
    public static By popupColorProduct = By.className("popup");
    public static By emptyArea = By.xpath("//html");
    List<WebElement> product;
    Random random =new Random();
    public void navigationHover(){
        hoverToElement(findElement(navigationHover));
        waitSeconds(2);
    }
    public void clickTabloBtn(){
        clickElement(tablobtn);
        waitSeconds(2);
    }
    public void selectrandomProduct(){
        if (isElementPresent(popupColorProduct)) {
            clickElement(emptyArea);
        }
        product = findElements(productsList);
        int productNumber = random.nextInt(product.size());
        clickElement(product.get(productNumber));
        waitSeconds(3);
    }
}
