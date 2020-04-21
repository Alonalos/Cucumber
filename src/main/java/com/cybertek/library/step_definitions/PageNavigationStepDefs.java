package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.DashBoardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageNavigationStepDefs {
    DashBoardPage dashBoardPage=new DashBoardPage();
    @When("I click on {string} link")
    public void i_click_on_link(String link) {
        switch(link.toLowerCase()){
            case"dashboard":
                dashBoardPage.dashboard.click();
                break;
            case"users":
                dashBoardPage.users.click();
                break;
            case"books":
                dashBoardPage.books.click();
                break;
        }

    }

    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
