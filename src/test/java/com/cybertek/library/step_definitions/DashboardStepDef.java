package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.DashBoardPage;
import com.cybertek.library.pages.PageBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardStepDef extends PageBase {
    DashBoardPage dashBoardPage = new DashBoardPage();
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedName) {
        String actualName = dashBoardPage.accountHolderName.getText();

        Assert.assertEquals("Account holder name did not match",
                expectedName, actualName);
    }


}
