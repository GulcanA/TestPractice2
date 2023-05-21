package com.emarket.pages;

import com.emarket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataTablePage extends BasePage {
    @FindBy(xpath = "//span[contains(text(),'New')]")
    public WebElement newButton;

    public void input(String title,String data){
        Driver.get().findElement(By.xpath("//input[@id='DTE_Field_"+title+"']")).sendKeys(data);

    }

}
