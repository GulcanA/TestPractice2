package com.emarket.stepDefs;

import com.emarket.pages.AmazonMainPage;
import com.emarket.utilities.ConfigurationReader;
import com.emarket.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class AmazonSearch_StepDefs {

AmazonMainPage amazonMainPage =new AmazonMainPage();

    @Given("User navigates to the url")
    public void user_navigates_to_the_url() {
        //String expected_title="https://www.amazon.de/";


        Driver.get().get(ConfigurationReader.get("url1"));
        String actual_title=Driver.get().getCurrentUrl();
        Assert.assertEquals(ConfigurationReader.get("url1"),actual_title);
        amazonMainPage.cookies.click();

    }
    @Given("User enters {string} into the searchbox")
    public void user_enters_into_the_searchbox(String item) {
        amazonMainPage.searchBox.sendKeys(item);

        amazonMainPage.searchButton.click();

    }
    @Then("User gets the results including {string}")
    public void user_gets_the_results_including(String item) {
        Assert.assertTrue(amazonMainPage.resultText.getText().contains(item));

    }
}
