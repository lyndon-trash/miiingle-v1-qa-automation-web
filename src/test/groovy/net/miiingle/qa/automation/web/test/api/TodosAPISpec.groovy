package net.miiingle.qa.automation.web.test.api


import io.qameta.allure.Feature
import io.qameta.allure.Story

import static io.restassured.RestAssured.given
import static org.springframework.restdocs.restassured3.RestAssuredRestDocumentation.document

class TodosAPISpec extends APISpecification {

    @Feature("MNT-02")
    @Story("As a users, I want to show my TODO")
    def "should show the todo"() {
        given:
        def api = given(this.spec)
                .filter(document("todos"))

        when:
        def response = api
                .get("todos/1")
                .andReturn()

        def statusCode = response.statusCode()
        def json = response.body().jsonPath()

        then:
        statusCode == 200
        json.get("userId") == 1
    }
}
