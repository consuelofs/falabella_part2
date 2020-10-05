package com.falabella.page;

import com.falabella.config.FalabellaBaseConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FalabellaHomePage extends FalabellaBaseConfig {

    public FalabellaHomePage(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='testId-SearchBar-Input']" )
    private WebElement searchInFalabella;

    @FindBy(xpath = "//img[@id='testId-pod-image-8158922']")
    private WebElement producto;

    @FindBy(xpath = "//button[@id='testId-Pod-action-8158922']")
    private  WebElement details;

    @FindBy(xpath = "//div[@id='buttonForCustomers']")
    private WebElement backProducts;

    @FindBy(xpath = "//div[@id='buttonForCustomers']")
    private WebElement addProd;

    @FindBy(xpath = "//a[@id='linkButton']")
    private  WebElement viewBack;

    @FindBy(xpath = "//button[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']")
    private  WebElement goBuy;

    @FindBy(xpath = "//i[contains(text(),'1')]")
    private WebElement totalProdBack;

    @FindBy(xpath = "//button[contains(text(),'+')]")
    private  WebElement increaseNumberOfProducts;

    @FindBy(xpath = "//b[contains(text(),'Extiende tu Garantía')]")
    private WebElement textWarranty;

    public WebElement getAddWarrantyOneYear() {
        return addWarrantyOneYear;
    }

    public void setAddWarrantyOneYear(WebElement addWarrantyOneYear) {
        this.addWarrantyOneYear = addWarrantyOneYear;
    }

    public WebElement getAddWarrantyTwoYear() {
        return addWarrantyTwoYear;
    }

    public void setAddWarrantyTwoYear(WebElement addWarrantyTwoYear) {
        this.addWarrantyTwoYear = addWarrantyTwoYear;
    }

    public WebElement getAddWarrantyThreeYear() {
        return addWarrantyThreeYear;
    }

    public void setAddWarrantyThreeYear(WebElement addWarrantyThreeYear) {
        this.addWarrantyThreeYear = addWarrantyThreeYear;
    }

    public WebElement getNotAddWarranty() {
        return notAddWarranty;
    }

    public void setNotAddWarranty(WebElement notAddWarranty) {
        this.notAddWarranty = notAddWarranty;
    }

    @FindBy(linkText = "Consolas 1 Año $ 31.990")
    private WebElement addWarrantyOneYear;

    @FindBy(linkText = "Consolas 2 Años $ 49.990")
    private WebElement addWarrantyTwoYear;

    @FindBy(linkText = "Consolas 3 Años $ 89.990")
    private WebElement addWarrantyThreeYear;

    @FindBy(linkText = "No, gracias")
    private WebElement notAddWarranty;

    public WebElement getSearchInFalabella() {
        return searchInFalabella;
    }

    public void setSearchInFalabella(WebElement searchInFalabella) {
        this.searchInFalabella = searchInFalabella;
    }

    public WebElement getProducto() {
        return producto;
    }

    public void setProducto(WebElement producto) {
        this.producto = producto;
    }

    public WebElement getDetails() {
        return details;
    }

    public void setDetails(WebElement details) {
        this.details = details;
    }

    public WebElement getBackProducts() {
        return backProducts;
    }

    public void setBackProducts(WebElement backProducts) {
        this.backProducts = backProducts;
    }

    public WebElement getAddProd() {
        return addProd;
    }

    public void setAddProd(WebElement addProd) {
        this.addProd = addProd;
    }

    public WebElement getViewBack() {
        return viewBack;
    }

    public void setViewBack(WebElement viewBack) {
        this.viewBack = viewBack;
    }

    public WebElement getGoBuy() {
        return goBuy;
    }

    public void setGoBuy(WebElement goBuy) {
        this.goBuy = goBuy;
    }

    public WebElement getTotalProdBack() {
        return totalProdBack;
    }

    public void setTotalProdBack(WebElement totalProdBack) {
        this.totalProdBack = totalProdBack;
    }

    public WebElement getIncreaseNumberOfProducts() {
        return increaseNumberOfProducts;
    }

    public void setIncreaseNumberOfProducts(WebElement increaseNumberOfProducts) {
        this.increaseNumberOfProducts = increaseNumberOfProducts;
    }

    public WebElement getTextWarranty() {
        return textWarranty;
    }

    public void setTextWarranty(WebElement textWarranty) {
        this.textWarranty = textWarranty;
    }

}
