package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class JacketsPage extends Utility {

    By sortByTextBox = By.xpath("(//select[@data-role='sorter'])[1]");
    By productName = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[@id='sorter']//child::option[2]");
    By price = By.xpath("(//option[@value='price'][normalize-space()='Price'])[1]");
    By image12OfProductName = By.cssSelector("ol.products.list.items.product-items>li>div>div>strong>a.product-item-link");


    public void clickOnSortByTextBox() {
        clickOnElement(sortByTextBox);
    }

    public void selectProductName() {
        clickOnElement(productName);
    }

    public String getProductName() {
        return getTextFromElement(productName);
    }

    public void selectPriceOption() {
        clickOnElement(price);
    }

    public String getImage12OfProductName() {
        return getTextFromElement(image12OfProductName);
    }
}
