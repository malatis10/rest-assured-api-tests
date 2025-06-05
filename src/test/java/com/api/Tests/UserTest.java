package com.api.Tests;

import java.io.IOException;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.Endpoints.UserEndPoints;
import com.api.Utlities.TestDataUtil;

import io.restassured.response.Response;

public class UserTest {
	
	//Post Request for User Module
	//Create separate Test class for each Module
	//CRUD Operations in single Test class
	@Test
	public void createUser() throws IOException
	{
		//load data from json file
		String jsonPayload=TestDataUtil.readJSONFile("src/test/resources/userPayload.json");
		System.out.println("JSONPayload is "+jsonPayload);
		Response userResponse=UserEndPoints.createUser(jsonPayload); //call method from UserEndPoints
		userResponse.prettyPrint();
		userResponse.then().statusCode(200); //using RestAssured
		System.out.println("Pass using restAssured");
		Assert.assertEquals(userResponse.statusCode(), 200); //using TestNG
		System.out.println("Pass using testNG");
		//verify headers
        String contentType = userResponse.getHeader("Content-Type");
        Assert.assertEquals(contentType, "application/json");     
        
        //verify code value
        int code=  userResponse.jsonPath().getInt("code");
        Assert.assertEquals(code, 200);
        userResponse.then().body("code", equalTo(200));

		
	}
	

}
