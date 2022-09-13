package com.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GitHub {

	String jsonbody = "{\"name\":\"API___Automations\"}";

	@Test(priority = 0)
	private void post() {
		RestAssured.given().

				body(jsonbody).header("authorization", "Bearer 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")
				.accept(ContentType.JSON).contentType(ContentType.JSON).when().post("https://api.github.com/user/repos")
				.then().statusCode(201).log().all();

	}

	String jsonBody = "{\"names\":[\"automation\",\"manual\",\"api\"]}";

	@Test(priority = 1)
	private void put() {
		RestAssured.given().body(jsonBody).header("authorization", "Bearer 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")
				.accept(ContentType.JSON).contentType(ContentType.JSON).when()
				.put("https://api.github.com/repos/Hareevenkat/API___Automations/topics").then().statusCode(200).log()
				.all();
	}

	@Test(priority = 2)
	public void get() {

		RestAssured.when().get("https://api.github.com/repos/Hareevenkat/API___Automations").then().statusCode(200)
				.log().all();

	}

	String jsonody = "{\"names\":[\"automation\",\"manual\",\"api\"]}";

	@Test(priority = 3)
	private void delete() {
		RestAssured.given().

				body(jsonody).header("authorization", "Bearer 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")
				.accept(ContentType.JSON).contentType(ContentType.JSON).when()
				.delete("https://api.github.com/repos/Hareevenkat/API___Automations").then().statusCode(204).log()
				.all();

	}

}
