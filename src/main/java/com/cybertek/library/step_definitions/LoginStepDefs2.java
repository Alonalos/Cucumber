package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.pages.PageBase;
import com.cybertek.library.utilities.ConfigurationReader;
import io.cucumber.java.en.When;

public class LoginStepDefs2 extends PageBase {
    LoginPage loginPage=new LoginPage();
    @When("I enter username {string}")
    public void i_enter_username(String username) {
        username="librarian21@library";
        loginPage.email.sendKeys(username);


    }

    @When("I entered the password {string}")
    public void i_entered_the_password(String password) {
        loginPage.password.sendKeys(password);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.signIn.click();
    }

    @When("I enter username")
    public void iEnterUsername() {
        String username= ConfigurationReader.getProperty("librarian_email");
        loginPage.email.sendKeys(username);
    }
    @When("I login using {string} and {string}")
    public void i_login_using_and(String string, String string2) {
        loginPage.login(string,string2);
    }
}
