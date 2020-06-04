package net.miiingle.qa.automation.web.test.pwa

import io.qameta.allure.Epic
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.openqa.selenium.By
import spock.lang.Specification

import static com.codeborne.selenide.Selenide.*

@Epic("MNT-01")
class DemoWebSpec extends Specification {

    def setup() {
        open("https://www.google.com/")
    }

    def cleanup() {
        closeWindow()
        closeWebDriver()
    }

    @Feature("MNT-02")
    @Story("As an ordinary user, I should be able to search terms in Google.com")
    def "should search google"() {
        given: "an intention to search"
        def searchTerm = "GT Capital Holdings Inc"

        when: "you key in a search term and press enter"
        $(By.name("q")).sendKeys(searchTerm)
        $(By.name("q")).pressEnter()

        and: "click the IMAGES tab"
        $(By.linkText("Images")).click()

        and: "click the nth child"
        $(By.cssSelector(".islrc > .isv-r:nth-child(3) .rg_i")).click()

        then:
        1 == 1
    }
}
