package net.miiingle.qa.automation.web.test.api

import io.qameta.allure.Epic
import io.qameta.allure.Feature
import io.qameta.allure.Story
import spock.lang.Specification

@Epic("MNT-01")
class DemoAPISpec extends Specification {

    @Feature("MNT-02")
    @Story("one should equals one")
    def "should work"() {
        expect: "1 is 1"
        1 == 1
    }
}
