package com.demoqa.tests;

import com.demoqa.extensions.WithLogin;
import com.demoqa.pages.ProfilePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class ProfileTests extends TestBase {

    ProfilePage profilePage = new ProfilePage();

    @Test
    @DisplayName("The list of books is empty")
    @WithLogin
    void bookListIsEmpty() {

        step("Open Profile page", () -> {
            profilePage.openPage();
        });

        step("Check the list of books is empty", () -> {
            profilePage.checkEmptyCells();
        });

        step("Сheck no data message is displayed", () -> {
            profilePage.checkNoDataMessage();
        });
    }
}
