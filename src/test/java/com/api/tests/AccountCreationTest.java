package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.response.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {
	
	@Test(description= "Verify if Login API is working...")
	
	public void createAccountTest() {
		SignUpRequest signUpRequest=new SignUpRequest.Builder().userName("Elena11")
		.email("ruchimalik11@gmail.com")
		.password("Testing@123")
		.lastName("Malhotra")
		.firstName("Elena")
		.mobileNumber("7708907663").build();
		
		
		AuthService authService= new AuthService();
		Response response =authService.signUp(signUpRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		
		
	}

}
