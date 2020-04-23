package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);

    @FindBy(id = "inputEmail")
    public WebElement email;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement signIn;

    public void login(String email, String password) {
        wait.until(ExpectedConditions.visibilityOf(this.email));
        this.email.sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(this.password));
        this.password.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();
    }
}
