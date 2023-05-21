package com.emarket.stepDefs;

import com.emarket.pages.DataTablePage;
import com.emarket.utilities.ConfigurationReader;
import com.emarket.utilities.Driver;
import io.cucumber.java.en.*;

public class DataTableStepDefs {
DataTablePage dataTablePage=new DataTablePage();

    @Given("User navigates to the Editor Page")
    public void user_navigates_to_the_editor_page() {
        Driver.get().get(ConfigurationReader.get("url2"));


    }

    @Then("User clicks New Button")
    public void user_clicks_new_button() {
        dataTablePage.newButton.click();

    }

    @Then("User enters {string} {string} {string} {string} {string} {string}")
    public void user_enters(String firstname, String lastname, String position, String office, String startdate, String salary) {

        dataTablePage.input("first_name",firstname);
        dataTablePage.input("last_name",lastname);
        dataTablePage.input("position",position);
        dataTablePage.input("office",office);
        dataTablePage.input("start_date",startdate);
        dataTablePage.input("salary",salary);
    }
    @Then("User clicks create button")
    public void user_clicks_create_button() {

    }
    @When("User searchs her first name")
    public void user_searchs_her_first_name() {

    }
    @Then("User see her name on the table")
    public void user_see_her_name_on_the_table() {

    }

}
