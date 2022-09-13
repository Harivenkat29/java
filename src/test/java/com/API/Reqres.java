package com.API;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class Reqres {

	String jsonBody = "{\r\n" + "    \"name\": \"GREENS\",\r\n" + "    \"job\": \"leader\"\r\n" + "}";

	@Test
	private void Post() {
		RestAssured.given().body(jsonBody).when().post("https://reqres.in/api/users").then().statusCode(201);
	}

	@Test
	private void Put() {

		String jsonbody = "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}";
		RestAssured.given().body(jsonbody).when().put("https://reqres.in/api/users/2").then().statusCode(200);
	}

	@Test
	private void Get() {

		RestAssured.given().get("https://reqres.in/api/users?page=2").then().statusCode(200);

	}

	@Test
	private void Delete() {
		RestAssured.given().when().delete("https://reqres.in/api/users/2").statusCode();

	}

}
