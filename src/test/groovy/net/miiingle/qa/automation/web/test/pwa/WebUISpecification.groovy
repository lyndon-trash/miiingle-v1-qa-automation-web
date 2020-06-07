package net.miiingle.qa.automation.web.test.pwa

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.junit.ScreenShooter
import com.codeborne.selenide.logevents.SelenideLogger
import io.qameta.allure.Epic
import io.qameta.allure.Feature
import io.qameta.allure.Story
import io.qameta.allure.selenide.AllureSelenide
import org.junit.Rule
import spock.lang.Specification

import static com.codeborne.selenide.Selenide.closeWebDriver
import static com.codeborne.selenide.Selenide.closeWindow

@Epic("Unknown Epic")
@Feature("Unknown Feature")
@Story("Unknown Story")
class WebUISpecification extends Specification {

    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter
            .failedTests()
            .succeededTests()

    def setup() {
        Configuration.timeout = 10_000

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false))


    }

    def cleanup() {
        closeWindow()
        closeWebDriver()
    }
}
