package com.solonka;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

/**
 * Search page
 */
public class SearchPage {
    /**
     * Article titles
     */
    private final ElementsCollection articleTitles = $$x("//h2//a");

    /**
     * Get href from first article
     *
     * @return String
     */
    public String getHrefFromFirstArticle() {
        return articleTitles.first().getAttribute("href");
    }
}

