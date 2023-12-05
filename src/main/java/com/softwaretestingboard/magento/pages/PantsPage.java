package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class PantsPage extends Utility {
    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By colourBlack =By.xpath("(//div[@id='option-label-color-93-item-49'])[1]");
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By textYouAddedCronusYoga = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");


    public void mouseHoverOnCronusYogaPant(){
        mouseHoverToElement(cronusYogaPant);
    }
    public void clickOnSize32(){
        clickOnElement(size32);
    }
    public void clickOnColourBlack(){
        clickOnElement(colourBlack);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String getTheText(){
        return getTextFromElement(textYouAddedCronusYoga);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }


}

