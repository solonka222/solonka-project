package com.solonka;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Main page
 */
public class MainPage {
    /**
     * Text box input
     */
    private final SelenideElement textBoxInput = $x("//input");

    public MainPage(String url) {
        Selenide.open(url);
    }

    /**
     * Search for a string
     *
     * @param searchString - string to search
     * @return SearchPage
     */
    public SearchPage search(String searchString) {
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}

