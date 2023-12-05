package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenLink = By.xpath("//span[normalize-space()='Women']");
    By topsLink = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacketsLink = By.cssSelector("a[id='ui-id-11'] span");
    By sortByTextBox = By.xpath("(//select[@data-role='sorter'])[1]");
    By productName = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[@id='sorter']//child::option[2]");

    By menLink = By.xpath("//a[@id='ui-id-5']");
    By bottomLink = By.cssSelector("a[id='ui-id-18'] span:nth-child(2)");
    By pantsLink = By.xpath("(//span[contains(text(),'Pants')])[2]");

    By gearLink = By.xpath("//a[@id = 'ui-id-6']");
    By bagsLink = By.xpath("//a[@id = 'ui-id-25']");

    public void mouseHoverOnWomenLink(){
        mouseHoverToElement(womenLink);
    }

    public void mouseHoverOnTopsLink() {
        mouseHoverToElement(topsLink);
    }

    public void mouseHoverAndClickOnJacketsLink(){
        waitUntilVisibilityOfElementLocated(jacketsLink, 20);
        mouseHoverToElementAndClick(jacketsLink);
    }

    public void mouseHoverOnMenLink(){
        mouseHoverToElement(menLink);
    }

    public void mouseHoverOnBottomLink() {
        waitUntilVisibilityOfElementLocated(bottomLink, 20);
        mouseHoverToElement(bottomLink);
    }

    public void mouseHoverAndClickOnPantsLink(){
        mouseHoverToElementAndClick(pantsLink);
    }
    public void mouseHoverGearLink(){
        mouseHoverToElement(gearLink);
    }
    public void mouseHoverAndClickOnBagsLink(){
        mouseHoverToElementAndClick(bagsLink);
    }




}
