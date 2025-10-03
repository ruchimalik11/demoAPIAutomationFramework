package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.response.SignUpRequest;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description= "Verify if forgot password API is working fine...")
	
	public void forgotPasswordTest() {
		
		AuthService authService= new AuthService();
		Response response=authService.forgotPassword("ruchimalik121@gmail.com");
		System.out.println(response.asPrettyString());
	}

}
