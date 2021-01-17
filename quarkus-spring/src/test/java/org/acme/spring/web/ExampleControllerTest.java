package org.acme.spring.web;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleControllerTest {

    @Test
    public void testHelloParamEndpoint() {
        given()
          .when().get("/hello?name=john")
          .then()
             .statusCode(200)
             .body(is("{\"greeting\":\"hello john\"}"));
    }

    @Test
    public void testHelloPathEndpoint() {
        given()
          .when().get("/hello/john")
          .then()
             .statusCode(200)
             .body(is("{\"greeting\":\"hello john\"}"));
    }

}