package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.UsersPage;
import com.cybertek.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserGroupStepDefs {
    UsersPage usersPage=new UsersPage();
    @Then("User group default value should be {string}")
    public void user_group_default_value_should_be(String userGroup) {
        Assert.assertEquals(usersPage.getUserGroup().getFirstSelectedOption().getText(),
                userGroup);

    }

    @When("I select User group {string}")
    public void i_select_User_group(String userGroup) {
    usersPage.getUserGroup().selectByVisibleText(userGroup);
    }

    @Then("Groups columns in user table should only contain {string}")
    public void groups_columns_in_user_table_should_only_contain(String userGroup) {
        List<String> groupList = BrowserUtils.getElementsText(usersPage.groupList);
        boolean found=true;
        for(String lib: groupList){
            if(!lib.contains(userGroup)){
                found=false;
            }
        }
        Assert.assertTrue(userGroup+"was not found in books table",found);
    }

}
