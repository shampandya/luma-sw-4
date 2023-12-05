package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {

    By productName = By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]/div[1]/div[1]/strong[1]/a[1]");
    By verifyTheText = By.xpath("//span[@data-ui-id='page-title-wrapper']");
    public void mouseHoverAndClickOnProductName(){
        mouseHoverToElementAndClick(productName);
    }

    public String getTextOverNightDuffle(){
        return getTextFromElement(verifyTheText);
    }

}
