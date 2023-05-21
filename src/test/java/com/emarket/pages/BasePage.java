package com.emarket.pages;

import com.emarket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

}
