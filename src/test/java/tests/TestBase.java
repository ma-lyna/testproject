package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.ProjectConfiguration;
import config.WebConfig;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.RabotaByPage;

import static com.codeborne.selenide.Selenide.open;



public class TestBase {
    private static WebConfig config;
    private static ProjectConfiguration configuration;
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
                config = ConfigFactory.create(WebConfig.class, System.getProperties());
                configuration = new ProjectConfiguration();
                configuration.webConfig(config);

                Configuration.pageLoadTimeout = 10000;
                Configuration.timeout = 10000;
                Configuration.headless = false;
                Configuration.holdBrowserOpen = false;
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

