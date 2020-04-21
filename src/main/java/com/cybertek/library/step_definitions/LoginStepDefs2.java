package com.cybertek.library.step_definitions;

import io.cucumber.java.en.When;

public class LoginStepDefs2 {
    @When("I enter username {string}")
    public void i_enter_username(String username) {
        System.out.println("Enter username: "+username);
    }

    @When("I entered the password {string}")
    public void i_entered_the_password(String password) {
        System.out.println("Entering the password: "+password);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        System.out.println("Signing in");
    }

    @When("I enter username {string} and {string}")
    public void iEnterUsernameAnd(String username, String password) {
        System.out.println("Loging in using "+username+" and "+password);
    }
}
