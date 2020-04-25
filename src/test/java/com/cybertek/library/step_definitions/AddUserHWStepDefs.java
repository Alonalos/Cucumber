package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.DashBoardPage;
import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.pages.UsersPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import com.mifmif.common.regex.Generex;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.util.List;


import static org.junit.Assert.assertTrue;


public class AddUserHWStepDefs {
    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();
    LocalDate localDate = LocalDate.now();
    Generex generex = new Generex("w{10}");
    String randomEmail = generex.random();
    DashBoardPage db= new DashBoardPage();


    @Then("start date should be today's date")
    public void start_date_should_be_today_s_date() {
        //String startDate = usersPage.startDate.getAttribute("value");
        String startDate=usersPage.startDate.getAttribute("innerHTML");
        String currentDate = LocalDate.now().toString();
        Assert.assertEquals(startDate,currentDate);

    }

    @Then("end date should be one month from today")
    public void end_date_should_be_one_month_from_today() {
        String expectedDate = localDate.plusMonths(1).toString();
        Assert.assertEquals(expectedDate, usersPage.endDate.getText());
    }

    @Given("I enter new user information with random email")
    public void i_enter_new_user_information_with_random_email() {
        usersPage.email.sendKeys(randomEmail + Keys.ENTER);

    }

    @When("I click the Close link")
    public void i_click_the_Close_link() {
        usersPage.close.click();
    }

    @Then("the users table should not contain user with that email")
    public void the_users_table_should_not_contain_user_with_that_email() {
        List<WebElement> allRows = usersPage.allRows;
        List<String> allRowsTxt = BrowserUtils.getElementsText(allRows);
        boolean notFound = true;
        for (String row : allRowsTxt) {
            notFound = !row.contains(randomEmail);
            if (!notFound) {
                break;
            }
        }
        assertTrue(randomEmail + " was  found", notFound);
    }


    @When("I save new user information with random email")
    public void i_save_new_user_information_with_random_email() {
        usersPage.submit.click();
    }

    @When("the users table must contain the correct user information")
    public void the_users_table_must_contain_the_correct_user_information() {
        List<WebElement> allRows = usersPage.allRows;
        List<String> allRowsTxt = BrowserUtils.getElementsText(allRows);
        boolean found = true;
        for (String row : allRowsTxt) {
            System.out.println("row = " + row);
            found = row.contains(randomEmail);
            if (found) {
                break;
            }
        }
        assertTrue(randomEmail + " was not found", found);
    }

    @And("I click on Add User")
    public void iClickOnAddUser() {
        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver() ;
        js.executeScript("arguments[0].click();",usersPage.addUsers);
    }
}

