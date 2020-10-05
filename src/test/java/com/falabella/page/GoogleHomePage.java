package com.falabella.page;

import com.falabella.config.BaseConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends BaseConfig {

    public GoogleHomePage(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchBoxInpt;

    @FindBy(xpath = "//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[3]/center[1]/input[1]")
    private  WebElement searchBtn;

    @FindBy(xpath = "//span[contains(text(),'Lo encontré en Falabella.com')]")
    private WebElement firstResult;

    public WebElement getSearchBoxInpt() {
        return searchBoxInpt;
    }

    public void setSearchBoxInpt(WebElement searchBoxInpt) {
        this.searchBoxInpt = searchBoxInpt;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public void setSearchBtn(WebElement searchBtn) {
        this.searchBtn = searchBtn;
    }

    public WebElement getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(WebElement firstResult) {
        this.firstResult = firstResult;
    }
}
