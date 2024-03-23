package com.demoqa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ProfilePage {
    private ElementsCollection cells = $$(".rt-td");
    private SelenideElement message = $(".rt-noData");

    public ProfilePage openPage() {
        open("/profile");
        return this;
    }

    public ProfilePage checkEmptyCells() {
        for (SelenideElement cell : cells) {
            cell.shouldHave(Condition.empty);
        }
        return this;
    }

    public ProfilePage checkNoDataMessage() {
        message.shouldHave(text("No rows found"));
        return this;
    }

}
