package net.miiingle.qa.automation.web.test.api

import io.qameta.allure.Epic
import io.qameta.allure.Feature
import io.qameta.allure.Story
import io.qameta.allure.restassured.AllureRestAssured
import io.restassured.builder.RequestSpecBuilder
import io.restassured.specification.RequestSpecification
import org.junit.Rule
import org.springframework.restdocs.JUnitRestDocumentation
import spock.lang.Specification

import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint
import static org.springframework.restdocs.restassured3.RestAssuredRestDocumentation.documentationConfiguration

@Epic("Unknown Epic")
@Feature("Unknown Feature")
@Story("Unknown Story")
class APISpecification extends Specification {

    @Rule
    JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation()
    RequestSpecification spec

    def setup() {
        this.spec = new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .addFilter(documentationConfiguration(this.restDocumentation)
                        .operationPreprocessors()
                        .withResponseDefaults(prettyPrint()))
                .addFilter(new AllureRestAssured())
                .setAccept("application/json")
                .build()
    }
}
