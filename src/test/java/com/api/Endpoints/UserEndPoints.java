package com.api.Endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class UserEndPoints {

//CRUD Operations for user Module,
	//separate class for each Module
	//Given and when will be part of this
	//Passing data using External JSON file
	
	
	public static Response createUser(String payload)
	{
		 Response res=  given()
		.accept("application/json")
		.contentType(ContentType.JSON)
		.body(payload)
		
		.when()
		.post(Routes.USER_POST_URL);
		 return res;
				
	}
	
	
}
