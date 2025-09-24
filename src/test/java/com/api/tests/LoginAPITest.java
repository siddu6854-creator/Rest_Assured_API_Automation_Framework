package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {
	
	@Test(description="Verify if login API is Working...")
	public void loginTest() {
		RestAssured.baseURI="http://64.227.160.186:8080";
//		RequestSpecification x=RestAssured.given();
//		RequestSpecification y=x.header("Content-Type","application/json");
//		RequestSpecification z=y.body("{\r\n"
//				+ "  \"username\": \"Siddu456@gmail.com\",\r\n"
//				+ "  \"password\": \"Siddu@7760\"\r\n"
//				+ "}");
//		Response response=z.post("api/auth/login"); //end point
		
		Response response=RestAssured.given().header("Content-Type","application/json").body("{\r\n"+ "  \"username\": \"Siddu456@gmail.com\",\r\n"+ "  \"password\": \"Siddu@7760\"\r\n"+ "}").post("api/auth/login");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.contentType(), "application/json");
	}

}
