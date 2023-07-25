package com.emarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ebay_Page extends BasePage {

    @FindBy(xpath = "//button[@id='gdpr-banner-decline']")
    public WebElement declineCookies;

    @FindBy(xpath = "//li/a[text()='Jewelry & Watches']")
    public WebElement jewelery;

    @FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//h1/span[2]")
    public WebElement result;

}
