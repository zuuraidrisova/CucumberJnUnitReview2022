package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GooglePage {

    public GooglePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(linkText = "About")
    public WebElement aboutLink;

    @FindBy(xpath = "//div[@class='KxwPGc SSwjIe']/div")
    public List<WebElement> footerLinks;



}
