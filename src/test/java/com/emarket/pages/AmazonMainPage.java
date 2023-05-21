package com.emarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonMainPage extends BasePage{

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
            public WebElement searchBox;

    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    public WebElement cookies;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement resultText;


}
