package com.emarket.stepDefs;

import com.emarket.pages.Ebay_Page;
import com.emarket.utilities.ConfigurationReader;
import com.emarket.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Ebay_StepDefs {

Ebay_Page ebay_page=new Ebay_Page();
    @Given("User is on the main page")
    public void user_is_on_the_main_page() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url3"));
        String expectedTitle=ConfigurationReader.get("url3");
        Driver.get().manage().window().maximize();
        Thread.sleep(2000);
        ebay_page.declineCookies.click();
        String actualTitle=Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @When("User enters a {string} into the search box")
    public void user_enters_a_into_the_search_box(String product_name) {
        ebay_page.searchBox.sendKeys(product_name+ Keys.ENTER);


    }
    @Then("User see the result of the {string}")
    public void user_see_the_result_of_the_product(String product_name) {
        Assert.assertTrue(ebay_page.result.getText().contains(product_name));



    }
}
