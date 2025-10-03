package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.filters.LoggingFilter;
import com.api.models.request.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class BaseService {//wrapper for rest assured
	
	//handles BASE URI
	//CREATING THE REQUEST
	//handling the response
	
	private static final String BASE_URL="http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;
	
	static{
		RestAssured.filters(new LoggingFilter());
	}
	
	public BaseService() {
		
		requestSpecification= given().baseUri(BASE_URL);
	}
	
	protected void setAuthToken(String token) {
		
		
		requestSpecification.header("Authorization", "Bearer " +token);
	}
protected Response postRequest(Object payLoad, String endPoint) {
	
	Response response =requestSpecification.contentType(ContentType.JSON).body(payLoad).post(endPoint);
	return response;
}

protected Response getRequest(String endPoint) {
	
	Response response =requestSpecification.get(endPoint);
	return response;
}

protected Response putRequest(Object payLoad, String endPoint) {
	
	return requestSpecification.contentType(ContentType.JSON).body(payLoad).put(endPoint);
}

}
