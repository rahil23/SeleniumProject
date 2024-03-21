import io.restassured.RestAssured;

import java.io.File;

import static io.restassured.RestAssured.given;

public class SampleAPiHit {

    public static void main(String[] args) {

        RestAssured.baseURI = "http://abc.com";
      RestAssured.port = 8080;

      given().contentType("application/json").param("limit","2").auth().basic("username","password")
              .multiPart(new File("ew")).when().get("/comments").then().extract().response();


    }
}
