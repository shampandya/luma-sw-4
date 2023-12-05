package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By verifyShoppingCart = By.xpath("//span[@class='base']");
    By verifyCronusYogaPant = By.cssSelector("td[class='col item'] div[class='product-item-details'] a");
    By verifySize32 = By.xpath("//dd[contains(text(),'32')]");
    By verifyColourBlack = By.xpath("//dd[contains(text(),'Black')]");

    By verifyOvernightDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By verifyQuantity3 = By.xpath("//input[@id='cart-506775-qty' and @name='cart[506775][qty]']");
    By verifyProductPrice = By.xpath("//span[contains(text(),'$135.00')]");
    By changeQualityTo5 = By.xpath("//input[@id='cart-506775-qty' and @name='cart[506775][qty]']");
    By updateShoppingCArt = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By verifyPrice = By.xpath("//span[contains(text(),'$225.00')]");

    public String getTextShoppingCart(){
        return getTextFromElement(verifyShoppingCart);
    }

    public String getTextVerifyCronusYogaPant(){
        return getTextFromElement(verifyCronusYogaPant);
    }

    public String getTextVerifySize32(){
        return getTextFromElement(verifySize32);
    }

    public String getTextVerifyColourBlack(){
        return getTextFromElement(verifyColourBlack);
    }

    public String getTextVerifyOvernightDuffle(){
        return getTextFromElement(verifyOvernightDuffle);
    }

    public String getTextVerifyQuantity3(){
        return getTextFromElement(verifyQuantity3);
    }

    public String getTextVerifyProductPrice(){
        return getTextFromElement(verifyProductPrice);
    }
    public void changeQuality5(){
        clearAndSendTextToElement(changeQualityTo5, "5");
    }
    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppingCArt);
    }
    public String getTextVerifyPrice(){
        return getTextFromElement(verifyPrice);
    }
}
