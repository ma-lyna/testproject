package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;

@Tags({@Tag("UI")})

public class RabotaByTests extends TestBase {

        @Test
        @Severity(SeverityLevel.BLOCKER)
        @Owner("ma-lyna")
        @DisplayName("Successful search")
        void checkSuccessfulSearch() {
            step("Open 'rabota.by'", () -> {
                rabotaByPage.openPage();
            });
            step("Fill in the 'Search' field with 'QA'", () -> {
                rabotaByPage.fillInSearchField("QA");
            });
            step("Tap on the 'Найти работу' button'", () -> {
                rabotaByPage.tapToSearch();
            });
            step("Verify that search results for 'QA' are shown", () -> {
                rabotaByPage.checkSearchResults();
            });
        }

        @Test
        @Severity(SeverityLevel.NORMAL)
        @Owner("ma-lyna")
        @DisplayName("Check filter by specified income")
        void checkJobsWithSpecifiedIncome() {
            step("Open 'rabota.by'", () -> {
                rabotaByPage.openPage();
            });
            step("Fill in the 'Search' field with 'QA'", () -> {
                rabotaByPage.fillInSearchField("QA");
            });
            step("Tap on the 'Найти работу' button'", () -> {
                rabotaByPage.tapToSearch();
            });
            step("Check 'Указан доход' checkbox", () -> {
                rabotaByPage.checkSpecifiedIncome();
            });
            step("Verify search results are displayed according to 'Указан доход' checkbox", () -> {
                rabotaByPage.verifySpecifiedIncomeExist();
            });
        }

        @Test
        @Severity(SeverityLevel.CRITICAL)
        @Owner("ma-lyna")
        @DisplayName("Extended search")
        void checkJobsInSpecifiedCity() {
            step("Open 'rabota.by'", () -> {
                rabotaByPage.openPage();
            });
            step("Tap on the 'Расширенный поиск' button'", () -> {
                rabotaByPage.tapOnExtSearch();
            });
           step("Verify the page with extended search is opened", () -> {
               rabotaByPage.checkPageExtSearch();
            });
        }

        @Test
        @Severity(SeverityLevel.BLOCKER)
        @Owner("ma-lyna")
        @DisplayName("Create a resume")
        void checkCreationResume() {
            step("Open 'rabota.by'", () -> {
                rabotaByPage.openPage();
            });
            step("Tap on the 'Создать резюме' button'", () -> {
                rabotaByPage.tapOnCreateCv();
            });
            step("Verify the page for creation a resume is opened", () -> {
                rabotaByPage.checkPageCreateCv();
            });
        }

        @Test
        @Severity(SeverityLevel.BLOCKER)
        @Owner("ma-lyna")
        @DisplayName("Log in")
        void checkLogIn() {
            step("Open 'rabota.by'", () -> {
                rabotaByPage.openPage();
            });
            step("Tap on the 'Войти' button'", () -> {
                rabotaByPage.tapOnLogIn();
            });
            step("Verify login page is opened", () -> {
                rabotaByPage.checkPageLogIn();
            });
        }
}