package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RabotaByPage {
        private SelenideElement
                searchInput = $("#a11y-search-input"),
                searchBtn = $(byText("Найти работу")),
                searchResults = $(".bloko-header-section-3"),
                specifiedIncomeChbox = $(".bloko-checkbox"),
                specifiedIncome = $("div span"),
                extSearchBtn = $(".supernova-navi-advanced-search-icon"),
                extPageTitle = $(".bloko-header-1"),
                createCvBtn = $(byText("Создать резюме")),
                createCvPageTitle = $(".bloko-header-1"),
                logInBtn = $(byText("Войти")),
                logInPageTitle = $(".bloko-header-section-2");

        public RabotaByPage openPage() {
            open("https://rabota.by");

            return this;
        }

        public RabotaByPage fillInSearchField (String value) {
        searchInput.setValue(value);

        return this;
    }

        public RabotaByPage tapToSearch () {
        searchBtn.click();

        return this;
    }

        public RabotaByPage checkSearchResults () {
        searchResults.shouldHave(text("QA"));

        return this;
    }

        public RabotaByPage checkSpecifiedIncome () {
        specifiedIncomeChbox.click();

        return this;
    }
        public RabotaByPage verifySpecifiedIncomeExist () {
        specifiedIncome.should(exist);

        return this;
    }

        public RabotaByPage tapOnExtSearch () {
        extSearchBtn.click();

        return this;
    }

        public RabotaByPage checkPageExtSearch () {
        extPageTitle.shouldHave(text("Поиск вакансий"));

        return this;
    }

        public RabotaByPage tapOnCreateCv () {
        createCvBtn.click();

        return this;
    }

        public RabotaByPage checkPageCreateCv () {
        createCvPageTitle.shouldHave(text("Регистрация соискателя"));

        return this;
    }

        public RabotaByPage tapOnLogIn () {
        logInBtn.click();

        return this;
    }

        public RabotaByPage checkPageLogIn () {
        logInPageTitle.shouldHave(text("Поиск работы"));

        return this;
    }
}
