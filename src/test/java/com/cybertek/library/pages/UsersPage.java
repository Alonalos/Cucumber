package com.cybertek.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UsersPage extends PageBase{
    @FindBy(name = "tbl_users_length")
    public WebElement showRecords;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> allRows;

    @FindBy(id = "user_groups")
    public WebElement userGroup;

    @FindBy(tagName = "input")
    public WebElement search;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    public List<WebElement> allUserIds;

    @FindBy(xpath = "//table/tbody/tr/td[3]")
    public List<WebElement> allFullNames;

    @FindBy(xpath = "//table/tbody/tr/td[4]")
    public List<WebElement> allEmails;

    @FindBy(tagName = "th")
    public List<WebElement> columnNames;

    @FindBy(xpath = "//a[@href='tpl/add-user.html']")
    public WebElement addUser;

    @FindBy(name = "full_name")
    public WebElement fullName;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(xpath = "//input[@name='start_date']")
    public WebElement startDate;

    @FindBy(xpath = "//input[@name='end_date']")
    public WebElement endDate;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(id = "user_groups")
    public WebElement user_groups_filter;

    @FindBy(id = "status")
    public WebElement status;

    @FindBy(xpath = "//button[@type='cancel']")
    public WebElement close;

    @FindBy(xpath = "//table/tbody/tr/td[5]")
    public List<WebElement> groupList;


    @FindBy(xpath = "//table/tbody/tr/td[6]")
    public List<WebElement> statusList;


    public Select getUserGroupFilter(){
        return new Select(user_groups_filter);
    }

    public Select getStatus(){
        return new Select(status);
    }

    public Select getUserGroup(){
        return new Select(userGroup);
    }

    public Select getShowRecords(){
        return new Select(showRecords);
    }
}
