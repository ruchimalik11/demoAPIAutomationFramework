package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {
	
	
	@Test(description= "Verify if the Login API is working ")
	public void loginTest() {
		
		Response response=given().baseUri("http://64.227.160.186:8080").header("Content-Type", "application/json").body("{ \"username\" : \"ruchi11\",\"password\" : \"Testing@123\"}").post("/api/auth/login");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}

}
