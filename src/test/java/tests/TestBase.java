package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.PageHeadHunter;

import static config.WebDriverProvider.setConfig;

public class TestBase {
        PageHeadHunter pageHeadHunter = new PageHeadHunter();

        @BeforeAll
        static void beforeAll() {
            setConfig();
        }

        @BeforeEach
        void addListener(){
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        }

        @AfterEach
        void addAttachments(){
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();
        }
}

