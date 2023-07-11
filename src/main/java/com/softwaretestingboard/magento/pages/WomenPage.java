package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility
{
    By womenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");//1.1
    By tops = By.xpath("//a[@id='ui-id-9']");//1.2
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");//1.3
    By sort = By.xpath("(//select[@id='sorter'])[1]");


    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);}

    public void mouseHoverOnTops() {
        mouseHoverToElement(tops);
    }

    public void clickOnJackets() {
        mouseHoverToElementAndClick(jackets);
    }

    public void sortByFilter(String filter) {
        selectByVisibleTextFromDropDown(sort, filter);
    }






}

