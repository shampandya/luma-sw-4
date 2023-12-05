package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDufflePage extends Utility {

    By quantity3 = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By textYouAddedOvernight = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

    public void changeQuality3(){
        clearAndSendTextToElement(quantity3, "3");
    }
    public void clickOnAddTOCart(){
        clickOnElement(addToCart);
    }
    public String getTextAddToCart(){
        return getTextFromElement(textYouAddedOvernight);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
    }



}
