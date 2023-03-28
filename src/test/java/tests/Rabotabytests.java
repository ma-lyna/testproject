package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;

public class Rabotabytests extends TestBase {

        @Test
        @Owner("ma-lyna")
        @DisplayName("Successful search")
        void checkSuccessfulSearch() {
            step("Open 'rabota.by'", () -> {
                pageRabotaBy.openPage();
            });
            step("Fill in the 'Search' field with 'QA'", () -> {
                pageRabotaBy.clickButton(pageHeadHunter.buttonAllService);
            });
            step("Tap on the 'Найти работу' button'", () -> {
                pageRabotaBy.checkForSection(pageHeadHunter.section, pageHeadHunter.textEducationAndConsultations);
            });
            step("Verify that search results for 'QA' are shown", () -> {
                pageRabotaBy.checkForSection(pageHeadHunter.section, pageHeadHunter.textEducationAndConsultations);
            });
        }

        @Test
        @Owner("ma-lyna")
        @DisplayName("Сортировка (по возрастанию)")
        void checkForSectionEducationAndConsultations() {
            step("Open 'rabota.by'", () -> {
                pageRabotaBy.openPage();
            });
            step("Fill in the 'Search' field with 'QA'", () -> {
                pageRabotaBy.clickButton(pageHeadHunter.buttonAllService);
            });
            step("Tap on the 'Найти работу' button'", () -> {
                pageRabotaBy.checkForSection(pageHeadHunter.section, pageHeadHunter.textEducationAndConsultations);
            });
            step("Verify that search results for 'QA' are shown", () -> {
                pageRabotaBy.checkForSection(pageHeadHunter.section, pageHeadHunter.textEducationAndConsultations);
            });
        }

        @Test
        @Owner("ma-lyna")
        @DisplayName("Фильтр (Минск)")
        void checkForSectionStudentsAndBeginners() {
            step("Открыть сайт hh.ru", () -> {
                pageHeadHunter.openPage();
            });
            step("Нажать кнопку 'Все сервисы'", () -> {
                pageHeadHunter.clickButton(pageHeadHunter.buttonAllService);
            });
            step("Проверить наличие раздела 'Студентам и начинающим специалистам'", () -> {
                pageHeadHunter.checkForSection(pageHeadHunter.section, pageHeadHunter.textStudentsAndBeginners);
            });
        }

        @Test
        @Owner("ma-lyna")
        @DisplayName("готовое резюме")
        void checkForSectionServicesInDevelopment() {
            step("Открыть сайт hh.ru", () -> {
                pageHeadHunter.openPage();
            });
            step("Нажать кнопку 'Все сервисы'", () -> {
                pageHeadHunter.clickButton(pageHeadHunter.buttonAllService);
            });
            step("Проверить наличие раздела 'Сервисы в разработке'", () -> {
                pageHeadHunter.checkForSection(pageHeadHunter.section, pageHeadHunter.textServicesInDevelopment);
            });
        }

        @Test
        @Owner("ma-lyna")
        @DisplayName("войти")
        void check() {
            step("Открыть сайт hh.ru", () -> {
                pageHeadHunter.openPage();
            });
            step("Нажать на виджет 'Работа из дома'", () -> {
                pageHeadHunter.clickButton(pageHeadHunter.buttonWorkInHome);
            });
            step("Проверить наличие отметки 'Можно из дома' у вакансии", () -> {
                pageHeadHunter.verifyChapterWorkInHome();
            });
        }
}











}
