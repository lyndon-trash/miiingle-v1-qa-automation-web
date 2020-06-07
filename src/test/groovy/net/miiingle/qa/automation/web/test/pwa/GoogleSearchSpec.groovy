package net.miiingle.qa.automation.web.test.pwa

import io.qameta.allure.Epic
import io.qameta.allure.Feature
import io.qameta.allure.Issue
import io.qameta.allure.Story
import org.openqa.selenium.By

import static com.codeborne.selenide.Condition.appear
import static com.codeborne.selenide.Selenide.*

@Epic("MNT-01")
@Feature("MNT-02")
class GoogleSearchSpec extends WebUISpecification {

    @Issue("6")
    @Story("As an ordinary user, I should be able to search terms in Google.com")
    def "should search google"() {
        given: "an intention to search"
        def searchTerm = "GT Capital Holdings Inc"

        when: "you open the google home page"
        open("https://www.google.com/")

        and: "you key in a search term and press enter"
        $(By.name("q")).sendKeys(searchTerm)
        $(By.name("q")).pressEnter()

        and: "click the IMAGES tab"
        $(By.linkText("Images")).click()

        and: "click the nth child"
        $(By.cssSelector(".islrc > .isv-r:nth-child(3) .rg_i")).click()

        then:
        $x("//*[@placeholder='Add Search Name']").should(appear)
    }

}
