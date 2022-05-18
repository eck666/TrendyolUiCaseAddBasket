package PageModel;

import org.openqa.selenium.By;

public class BasketModel extends BaseModel {
    public static By addBasketBtn = By.xpath("//div[@class='add-to-basket-button-text']");
    public static By goToBasketBtn = By.xpath("//a[@class='link account-basket']");
    public static By hoverCheckBasket = By.xpath("//div[@class='pb-basket-item']");
    public void addBasket(){
        switchToPageElement(1);
        waitSeconds(2);
        clickElement(addBasketBtn);
    }
    public void goToBasket(){
        clickElement(goToBasketBtn);
        waitSeconds(2);
    }
    public void checkBasket(){
        hoverToElement(findElement(hoverCheckBasket));
        waitSeconds(2);
    }
}
