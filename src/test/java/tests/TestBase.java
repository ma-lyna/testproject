package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.RabotaByPage;

import java.util.Map;

import static com.codeborne.selenide.Selenide.open;



public class TestBase {


    RabotaByPage rabotaByPage = new RabotaByPage();





  //      @BeforeAll


   //     static void beforeAll() {
            //     Configuration.browser = System.getProperty("browser", "chrome");
            //      Configuration.browserVersion = System.getProperty("browserVersion", "100");
            // Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
            //   Configuration.timeout = 10000;
            //     Configuration.baseUrl = System.getProperty("baseUrl", "https://demoqa.com");
            //      Configuration.remote = System.getProperty("remoteUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

            //     DesiredCapabilities capabilities = new DesiredCapabilities();
            //     capabilities.setCapability("enableVNC", true);
            //      capabilities.setCapability("enableVideo", true);
            //      Configuration.browserCapabilities = capabilities;



    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.pageLoadTimeout = 100000;
        Configuration.timeout = 15000;

        WebDriverProvider provider = new WebDriverProvider() {
        };

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true));

        Configuration.browserCapabilities = capabilities;
    }





        @BeforeEach

        void beforeEach() {




     //   void addListener(){
        // SelenideLogger.addListener("AllureSelenide", new AllureSelenide());


             SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
                open("https://rabota.by");
        }

        @AfterEach
        void addAttachments(){
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();
        }
}

